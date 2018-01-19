package contr;

import dto.CityMaster;
import dto.CitySport;
import dto.Sport;
import dto.StateMaster;
import dto.Users;
import dto.Venue;
import dto.VenueSearch;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserContr {
    @Autowired
    HibernateTemplate template;
    
    @RequestMapping("/registerUser.htm")
    public String createUser(Model model,ModelMap map, Users u,CitySport cs, HttpSession session)
    {
        System.out.println("in createuser");
        map.put("muser",u);
        String mail = "Registration Succesfull<br> <a href='http://localhost:8080/SportVenueBooking/updateuserstatus.htm?loginId="+u.getLoginId()+"'>Email Confirm</a>";
        SM obj = new SM("j2ee3batch@gmail.com", "pass@$123", u.getEmail(), "Sport Venue", mail);
        int i = obj.send();
        System.out.println("mail send"+i);
        session.setAttribute("suer",u.getLoginId());
        template.save(u);
         List<CitySport> lcs = template.executeFind(new HibernateCallback <List<CitySport>> () {

            @Override
            public List<CitySport>  doInHibernate(Session sn) throws HibernateException, SQLException {
                Query q = sn.createQuery("from CitySport");
               List<CitySport> cs = q.list();
               return cs;
            }
        });
        List<Sport> ls = template.executeFind(new HibernateCallback <List<Sport>> () {

            @Override
            public List<Sport>  doInHibernate(Session sn) throws HibernateException, SQLException {
                Query q = sn.createQuery("from Sport");
               List<Sport> s = q.list();
               return s;
            }
        });
        System.out.println("ls"+ls);
        System.out.println("lcs"+lcs);
        map.put("lcs", lcs);
        map.put("ls",ls);
        model.addAttribute("venueSearch", new VenueSearch());
        return "user/home";
    }
    
    @RequestMapping("/updateuserstatus.htm")
    public String updateUserStatus(Model model, ModelMap map, CitySport cs, Users u)
    {
        System.out.println("user statis "+u.getLoginId());
        
         List<CitySport> lcs = template.executeFind(new HibernateCallback <List<CitySport>> () {

            @Override
            public List<CitySport>  doInHibernate(Session sn) throws HibernateException, SQLException {
                Query q = sn.createQuery("from CitySport");
               List<CitySport> cs = q.list();
               return cs;
            }
        });
        List<Sport> ls = template.executeFind(new HibernateCallback <List<Sport>> () {

            @Override
            public List<Sport>  doInHibernate(Session sn) throws HibernateException, SQLException {
                Query q = sn.createQuery("from Sport");
               List<Sport> s = q.list();
               return s;
            }
        });
        System.out.println("ls"+ls);
        System.out.println("lcs"+lcs);
        map.put("lcs", lcs);
        map.put("ls",ls);
        model.addAttribute("venueSearch", new VenueSearch());
        return "user/home";
    }
    @RequestMapping("/preregister.htm")
    public String preRegister(ModelMap map, StateMaster sm, Users u)
    {
        
        List<StateMaster> lsm = template.executeFind(new HibernateCallback<List<StateMaster>>() {
            @Override
            public List<StateMaster> doInHibernate(Session sn) throws HibernateException, SQLException {
                Query q = sn.createQuery("from StateMaster");
                List<StateMaster> lsm = q.list();
                return lsm;
            }
        });
        map.put("lsm", lsm);
        return "user/registerUser";
    }
    
    @RequestMapping("/getcity.htm")
    public String getCity(ModelMap map, CityMaster cm, StateMaster sm)
    {
        List<CityMaster> lcm = template.executeFind(new HibernateCallback<List<CityMaster>>() {
            @Override
            public List<CityMaster> doInHibernate(Session sn) throws HibernateException, SQLException {
                Query q = sn.createQuery("from CityMaster where stateMaster.sid = ?");
                q.setInteger(0, sm.getSid());
                List<CityMaster> lcm = q.list();
                return lcm;
            }
        });
        map.put("lsm", lcm);
        return "user/city";
    }
    
    @RequestMapping("/userhome.htm")
    public String userhome(Model model, ModelMap map, CitySport cs)
    {
        List<CitySport> lcs = template.executeFind(new HibernateCallback <List<CitySport>> () {

            @Override
            public List<CitySport>  doInHibernate(Session sn) throws HibernateException, SQLException {
                Query q = sn.createQuery("from CitySport");
               List<CitySport> cs = q.list();
               return cs;
            }
        });
        List<Sport> ls = template.executeFind(new HibernateCallback <List<Sport>> () {

            @Override
            public List<Sport>  doInHibernate(Session sn) throws HibernateException, SQLException {
                Query q = sn.createQuery("from Sport");
               List<Sport> s = q.list();
               return s;
            }
        });
        map.put("lcs", lcs);
        map.put("ls",ls);
        model.addAttribute("venueSearch", new VenueSearch());
        return "user/home";
    }   
    @RequestMapping("/searchvenue.htm")
    public String searchVenue(HttpServletRequest servletRequest, ModelMap map, VenueSearch vs)
    {
        String path = servletRequest.getServletContext().getRealPath("/image");
        List<Object[]> ls = template.executeFind(new HibernateCallback <List<Object[]>> () {
            @Override
            public List<Object[]>  doInHibernate(Session sn) throws HibernateException, SQLException {
                Query q = sn.createSQLQuery("select * from venue where venue_city = ?");
                q.setInteger(0, vs.getCityId());
                List<Object[]> lcs = q.list();
               return lcs;
            }
        });
        map.put("search",ls); 
        return "user/searchResult";
    }
    @RequestMapping("/showvenuedetails.htm")
    public String showvenuedetails(ModelMap map, Venue v)
    {
         List<Venue> ls = template.executeFind(new HibernateCallback <List<Venue>> () {

            @Override
            public List<Venue>  doInHibernate(Session sn) throws HibernateException, SQLException {
                Query q = sn.createQuery("from Venue where venueId = ?");
                q.setInteger(0, v.getVenueId());
                List<Venue> lcs = q.list();
                System.out.println(lcs);
               return lcs;
            }
        });
         map.put("venuelist",ls);
        return "user/venuedetails";     
    }
}
