package LiskovPrincipleWithSegregation;

public class Enquiry implements IDatabaseInference {

    String name;

    public Enquiry(String name) {
        this.name = name;
    }

    @Override
    public void addToDatabase() {
        System.out.println("Added the Enquiry to the Database");
    }


}
