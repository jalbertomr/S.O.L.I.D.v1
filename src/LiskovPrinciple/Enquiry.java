package LiskovPrinciple;

public class Enquiry extends Member {

    public Enquiry(String name) {
        super(name);
        this.memberType = "Enquiry";
    }

    @Override
    public void addToDatabase() {
        System.out.println("Added the Enquiry member to the Database");
    }

    @Override
    public void doBooking() {
        System.out.println("Enquiry Member can not do booking");
    }
}
