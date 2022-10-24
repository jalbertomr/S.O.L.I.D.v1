package LiskovPrincipleWITH;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Member> myList = new ArrayList<>();

        myList.add(new LifetimeMember("Hugo", new Date()));
        myList.add(new AnnualMember("Paco", new Date()));
        myList.add(new Enquiry("Luis"));

        for (Member member: myList) {
              //member.addToDatabase();
            member.makeBooking();
        }
    }
}
