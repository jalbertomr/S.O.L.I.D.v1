package LiskovPrincipleWithSegregation;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<IDatabaseInference> databaseMembers = new ArrayList<>();

        databaseMembers.add(new LifetimeMember("Hugo", new Date()));
        databaseMembers.add(new AnnualMember("Paco", new Date()));
        databaseMembers.add(new Enquiry("Luis"));

        for (IDatabaseInference member: databaseMembers) {
            member.addToDatabase();
        }

        ArrayList<IBookingInference> bookingMembers = new ArrayList<>();

        bookingMembers.add( new LifetimeMember("Juan", new Date()));
        bookingMembers.add( new AnnualMember("Pepe", new Date()));
        //bookingMembers.add(new Enquiry("Lupita"));  // Enquiry does not implements IBookingInference

        for ( IBookingInference member: bookingMembers) {
            member.makeBooking();
        }
    }
}
