package LiskovPrincipleWITH;

public class Enquiry extends Member {

    public Enquiry(String name) {
        super(name);
        this.memberType = "Enquity";
    }

    @Override
    public void addToDatabase() {
        System.out.println("Added the Enquiry to the Database");
    }
}
