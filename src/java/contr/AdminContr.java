package contr;

import dto.AdminLogin;
import dto.Booking;
import dto.CitySport;
import dto.TaxMaster;
import dto.Users;
import dto.Venue;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;


@Controller
public class AdminContr {
    @Autowired
    HibernateTemplate template;
    
   
    CommonsMultipartFile multipartResolver;

    public HibernateTemplate getTemplate() {
     return template;
    }

    public void setTemplate(HibernateTemplate template) {
     this.template = template;
    }

    public CommonsMultipartFile getMultipartResolver() {
     return multipartResolver;
    }

    public void setMultipartResolver(CommonsMultipartFile multipartResolver) {
     this.multipartResolver = multipartResolver;
    }
    
    
    @RequestMapping("/adminlogin.htm")
    public String adminLogin(AdminLogin al)
    {
        return "admin/adminlogin";
    }
    
    @RequestMapping("/adminlogincheck.htm")
    public String adminLoginCheck(AdminLogin al, HttpSession session) {
        List<AdminLogin> adminList = template.executeFind(new HibernateCallback<Object>() {
            @Override
            public Object doInHibernate(Session sn) throws HibernateException, SQLException {
                Query query = sn.createQuery("from AdminLogin where adminLoginId = :adminLoginId and adminPassword = :adminPassword");
                query.setString("adminLoginId",al.getAdminLoginId());
                query.setString("adminPassword",al.getAdminPassword());
                List<AdminLogin> adminList1 = query.list();
                return adminList1;
            }
        });
        if(adminList.isEmpty()) {
            return "admin/adminlogin";
        }
        else {
            session.setAttribute("admin",adminList.get(0).getAdminLoginId());
            return "admin/adminhome";
        }
    }
    
    @RequestMapping("/adminhome.htm")
    public String adminHome(HttpSession session) {
        boolean flag = true;
        try {
            long sd = session.getCreationTime();
          } catch (IllegalStateException ise) {
              flag = false;
          }
        if(flag) {
            return "admin/adminhome";
        } else {
            return "admin/adminlogin";
        }                 
    }
    
    /*
     * User part
     */
    @RequestMapping("/viewuser.htm")
    public String viewUser(Users u, ModelMap map)
    {
        List<Users> userList = template.executeFind(new HibernateCallback<List<Users>>() {
            @Override
            public List<Users> doInHibernate(Session sn) throws HibernateException, SQLException {
               Query query = sn.createQuery("from Users");
               List<Users> userList = query.list();
               return userList;
            }
        });
        
        List<Object> userCityList = template.executeFind(new HibernateCallback<List<Object>>() {
            @Override
            public List<Object> doInHibernate(Session sn) throws HibernateException, SQLException {
                Query q1 = sn.createSQLQuery("select * from users");
                List<Object[]> userList = q1.list();
                List<Integer> userCities = new ArrayList<>();
                for(Object[] o: userList) {
                    userCities.add((Integer)o[5]);
                } 
                List<Object> cityName = new ArrayList<>();
                for(Integer i : userCities) {
                    Query q = sn.createSQLQuery("select ctname from city_master where ctid = ?");
                    q.setInteger(0, i);
                    cityName.add(q.list().get(0));
                }
                return cityName;
            }
        });
        
        if(userList.isEmpty())
        {
            return "admin/adminhome";
        }
        else
        {
            map.put("user", userList);
            map.put("city", userCityList);
            return "admin/viewuser";
        } 
    }
    
    
     /*
     * City part
     */
    @RequestMapping("/viewcity.htm")
    public String viewCities(CitySport citySport, ModelMap map) {
        List<CitySport> citySportList;
        citySportList = template.executeFind(new HibernateCallback<List<CitySport>>() {
            @Override
            public List<CitySport> doInHibernate(Session sn) throws HibernateException, SQLException {
                Query query = sn.createQuery("from CitySport where cityStatus = 1");
                List<CitySport> citySportList = query.list();
                return citySportList;
            }
        });
        if(citySportList.isEmpty()) {
            return "admin/adminhome";
        }
        map.put("cs", citySportList);
        return "admin/viewcity";
    }
    
    @RequestMapping("/addcity.htm")
    public String addCity(CitySport citySport)
    {
        Date currentDate = new Date();
        citySport.setCityDate(currentDate);
        citySport.setCityStatus(true);
        template.save(citySport);
        return "admin/adminhome";
    }
    
    @RequestMapping("/editcity.htm")
    public String editCity(CitySport citySport, ModelMap map) {      
        List<CitySport> citySportList = template.executeFind(new HibernateCallback<List<CitySport>>() {
            @Override
            public List<CitySport> doInHibernate(Session sn) throws HibernateException, SQLException {
                Query query = sn.createQuery("from CitySport where cityId = :cityId");
                query.setInteger("cityId", citySport.getCityId());
                List<CitySport> citySportList = query.list();
                return citySportList;
            }
        });
        map.put("cs",citySportList);
        return "admin/editcity";
    }
    
    @RequestMapping("/updatecity.htm")
    public String updateCity(CitySport citySport)
    {
        citySport.setCityDate(new Date());
        citySport.setCityStatus(true);
        template.update(citySport);
        return "admin/adminhome";
    }
    
    @RequestMapping("/deletecity.htm")
    public String deleteCity(CitySport citySport)
    {
        List<CitySport> citySportList = template.executeFind(new HibernateCallback<List<CitySport>>() {
            @Override
            public List<CitySport> doInHibernate(Session sn) throws HibernateException, SQLException {
                Query q = sn.createQuery("from CitySport where cityId = ?");
                q.setInteger(0, citySport.getCityId());
                List<CitySport> citySportList = q.list();
                return citySportList;
            }
        });
        
        CitySport citySportToDelete = citySportList.get(0);
        citySportToDelete.setCityStatus(false);
        template.update(citySportToDelete);
        return "admin/adminhome";
    }
    
    
     /*
     * Venue part
     */
    @RequestMapping("/viewvenue.htm")
    public String viewVenue(Venue venue, ModelMap map) {
        List<Venue> venueList;
        venueList = template.executeFind(new HibernateCallback<List<Venue>>() {
            @Override
            public List<Venue> doInHibernate(Session sn) throws HibernateException, SQLException {
                Query query = sn.createQuery("from Venue where venueStatus = 1");
                List<Venue> venueList = query.list();
                return venueList;
            }
        });
        
        List<Object> venueCityList = template.executeFind(new HibernateCallback<List<Object>>() {
            @Override
            public List<Object> doInHibernate(Session sn) throws HibernateException, SQLException {
                Query q1 = sn.createSQLQuery("select venue_city from venue where venue_status = 1 order by venue_id");
                List<Object> venueCity = q1.list();
                List<Object> cityName = new ArrayList<>();
                for(Object o : venueCity) {
                    Query q = sn.createSQLQuery("select city_name from city_sport where city_id = ?");
                    q.setInteger(0, (Integer)o);
                    cityName.add(q.list().get(0));
                }
                return cityName;
            }
        });
        
        List<CitySport> citySportList = template.executeFind(new HibernateCallback<List<CitySport>>() {
            @Override
            public List<CitySport> doInHibernate(Session sn) throws HibernateException, SQLException {
                Query query = sn.createQuery("from CitySport");
                List<CitySport> venueList = query.list();
                return venueList;
            }
        });
        if(venueList.isEmpty()) {
            return "admin/adminhome";
        }
        map.put("venuecity", venueCityList);
        map.put("csl", citySportList);
        map.put("vl", venueList);
        return "admin/viewvenue";
    }

    
    @RequestMapping("/addvenue.htm") 
    public String addVenue(HttpServletRequest servletRequest, HttpSession session,Venue venue)
    {
        List<MultipartFile> file1 = venue.getImage1();
        List<MultipartFile> file2 = venue.getImage2();
        List<MultipartFile> file3 = venue.getImage3();
        String path = servletRequest.getServletContext().getRealPath("/image");
        venue.setImg1(uploadImage(file1, venue, path));
        venue.setImg2(uploadImage(file2, venue, path));
        venue.setImg3(uploadImage(file3, venue, path));
        venue.setVenueDate(new Date());
        venue.setVenueStatus(true);
        template.save(venue);
        return "admin/adminhome";
    }
    
    public String uploadImage(List<MultipartFile> files, Venue venue, String path) {
        List<String> fileNames = new ArrayList<>();
        String fileName = "";
        if (null != files && files.size() > 0)
        {
            for (MultipartFile multipartFile : files) {
                
                String originalFileName = multipartFile.getOriginalFilename();
                Date d = new Date();
                long l = d.getTime();
                fileName = Long.toString(l); 
                StringTokenizer st = new StringTokenizer(originalFileName,".");
                String extension = "";
                while(st.hasMoreTokens()) {
                    extension = st.nextToken();
                }
                System.out.println(extension);
                fileName = fileName + "." + extension;
                System.out.println(fileName);
                fileNames.add(fileName); 
                File imageFile = new File(path, fileName);
                try
                {
                    multipartFile.transferTo(imageFile);
                    
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
        return fileName;
    }
    
    @RequestMapping("/editvenue.htm")
    public String editVenue(Venue venue, ModelMap map) {
        List<Venue> venueList = template.executeFind(new HibernateCallback<List<Venue>>() {
            @Override
            public List<Venue> doInHibernate(Session sn) throws HibernateException, SQLException {
                Query query = sn.createQuery("from Venue where venueId = :venueId");
                query.setInteger("venueId", venue.getVenueId());
                List<Venue> venueList = query.list();
                return venueList;
            }
        });    
        System.out.println(venueList.get(0).getCitySport());
        map.put("vl",venueList);
        return "admin/editvenue";
    }
    
    @RequestMapping("/updatevenue.htm")
    public String updateVenue(Venue venue)
    {
        venue.setVenueDate(new Date());
        venue.setVenueStatus(true);
        template.update(venue);
        return "admin/adminhome";
    }
    
    @RequestMapping("/deletevenue.htm")
    public String deleteVenue(Venue venue)
    {
        System.out.println("dfg232");
        List<Venue> venueList = template.executeFind(new HibernateCallback<List<Venue>>() {
            @Override
            public List<Venue> doInHibernate(Session sn) throws HibernateException, SQLException {
                Query q = sn.createQuery("from Venue where venueId = ?");
                System.out.println("dfg");
                q.setInteger(0, venue.getVenueId());
                System.out.println("dfggdgdf");
                List<Venue> venueList = q.list();
                return venueList;
            }
        });
        
        Venue venueToDelete = venueList.get(0);
        venueToDelete.setVenueStatus(false);
        template.update(venueToDelete);
        return "admin/adminhome";
    }
    
    
     /*
     * Booking part
     */
    @RequestMapping("/viewbookings.htm")
    public String viewBookings(Booking booking, ModelMap map)
    {
        List<Booking> bookingList;
        bookingList = template.executeFind(new HibernateCallback<List<Booking>>() {
            @Override
            public List<Booking> doInHibernate(Session sn) throws HibernateException, SQLException {
                Query query = sn.createQuery("from Booking");
                List<Booking> bookingList = query.list();
                return bookingList;
            }
        });
        if(bookingList.isEmpty()) {
            return "admin/adminhome";
        }
        map.put("booking", bookingList);
        return "admin/viewbookings";
    }
    
    
     /*
     * Tax part
     */
    @RequestMapping("/viewtax.htm")
    public String viewTax(TaxMaster tm, ModelMap map)
    {
        List<TaxMaster> taxList;
        taxList = template.executeFind(new HibernateCallback<List<TaxMaster>>() {
            @Override
            public List<TaxMaster> doInHibernate(Session sn) throws HibernateException, SQLException {
                Query query = sn.createQuery("from TaxMaster where taxStatus = 1");
                List<TaxMaster> taxList = query.list();
                return taxList;
            }
        });
        if(taxList.isEmpty()) {
            return "admin/adminhome";
        }
        map.put("tax", taxList);
        return "admin/viewtax";
    }
    
    @RequestMapping("/addtax.htm")
    public String addTax(TaxMaster tm)
    {
        Date currentDate = new Date();
        tm.setTaxDate(currentDate);
        tm.setTaxStatus(true);
        template.save(tm);
        return "admin/adminhome";
    }
    
    @RequestMapping("/edittax.htm")
    public String editTax(TaxMaster tm, ModelMap map) {  
        List<TaxMaster> taxList = template.executeFind(new HibernateCallback<List<TaxMaster>>() {
            @Override
            public List<TaxMaster> doInHibernate(Session sn) throws HibernateException, SQLException {
                Query query = sn.createQuery("from TaxMaster where taxId = :taxId");
                query.setInteger("taxId", tm.getTaxId());
                List<TaxMaster> taxList = query.list();
                return taxList;
            }
        });
        map.put("tax",taxList);
        return "admin/edittax";
    }
    
    @RequestMapping("/updatetax.htm")
    public String updateTax(TaxMaster tm)
    {
        tm.setTaxDate(new Date());
        tm.setTaxStatus(true);
        template.update(tm);
        return "admin/adminhome";
    }
    
    @RequestMapping("/deletetax.htm")
    public String deleteTax(TaxMaster tm)
    {
        List<TaxMaster> taxList = template.executeFind(new HibernateCallback<List<TaxMaster>>() {
            @Override
            public List<TaxMaster> doInHibernate(Session sn) throws HibernateException, SQLException {
                Query q = sn.createQuery("from TaxMaster where taxId = ?");
                q.setInteger(0, tm.getTaxId());
                List<TaxMaster> taxList = q.list();
                return taxList;
            }
        });
        
        TaxMaster taxToDelete = taxList.get(0);
        taxToDelete.setTaxStatus(false);
        template.update(taxToDelete);
        return "admin/adminhome";
    }
}
