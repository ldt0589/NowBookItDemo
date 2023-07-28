package nowbookit.com.projects.website.nbi.model;

public class Booking {
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String service;
    private String time;
    private String date;
    private String numberPeople;
    private String table;
    private String note;


    public Booking(String firstName, String lastName, String phone, String email, String service, String time, String date, String numberPeople, String table, String note) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.service = service;
        this.time = time;
        this.date = date;
        this.numberPeople = numberPeople;
        this.table = table;
        this.note = note;
    }

    public Booking() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNumberPeople() {
        return numberPeople;
    }

    public void setNumberPeople(String numberPeople) {
        this.numberPeople = numberPeople;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", service='" + service + '\'' +
                ", time='" + time + '\'' +
                ", date='" + date + '\'' +
                ", numberPeople='" + numberPeople + '\'' +
                ", table='" + table + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
