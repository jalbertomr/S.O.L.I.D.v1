package LiskovPrinciple;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Member> members = new ArrayList<>();

        members.add( new LifeTimeMember("Forever Member", new Date()));
        members.add( new AnnualMember("One Year Member", new Date()));
        members.add( new Enquiry("just Enquiry member"));

        for( Member member: members){
            member.addToDatabase();
        }

        for ( Member member: members){
            member.doBooking();
        }
    }
}
