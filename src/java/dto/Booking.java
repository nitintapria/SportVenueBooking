package dto;
// Generated Aug 16, 2017 12:27:59 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Booking generated by hbm2java
 */
public class Booking  implements java.io.Serializable {


     private Integer bookId;
     private Users users;
     private VenueSport venueSport;
     private Date startsTime;
     private Date endsTime;
     private float totalPrice;
     private Date bookingDate;
     private boolean bookingStatus;
     private String transactionId;

    public Booking() {
    }

    public Booking(Users users, VenueSport venueSport, Date startsTime, Date endsTime, float totalPrice, Date bookingDate, boolean bookingStatus, String transactionId) {
       this.users = users;
       this.venueSport = venueSport;
       this.startsTime = startsTime;
       this.endsTime = endsTime;
       this.totalPrice = totalPrice;
       this.bookingDate = bookingDate;
       this.bookingStatus = bookingStatus;
       this.transactionId = transactionId;
    }
   
    public Integer getBookId() {
        return this.bookId;
    }
    
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }
    public Users getUsers() {
        return this.users;
    }
    
    public void setUsers(Users users) {
        this.users = users;
    }
    public VenueSport getVenueSport() {
        return this.venueSport;
    }
    
    public void setVenueSport(VenueSport venueSport) {
        this.venueSport = venueSport;
    }
    public Date getStartsTime() {
        return this.startsTime;
    }
    
    public void setStartsTime(Date startsTime) {
        this.startsTime = startsTime;
    }
    public Date getEndsTime() {
        return this.endsTime;
    }
    
    public void setEndsTime(Date endsTime) {
        this.endsTime = endsTime;
    }
    public float getTotalPrice() {
        return this.totalPrice;
    }
    
    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
    public Date getBookingDate() {
        return this.bookingDate;
    }
    
    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }
    public boolean isBookingStatus() {
        return this.bookingStatus;
    }
    
    public void setBookingStatus(boolean bookingStatus) {
        this.bookingStatus = bookingStatus;
    }
    public String getTransactionId() {
        return this.transactionId;
    }
    
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }




}


