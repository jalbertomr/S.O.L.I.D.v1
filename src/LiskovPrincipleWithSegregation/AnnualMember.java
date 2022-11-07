package LiskovPrincipleWithSegregation;

import java.util.Calendar;
import java.util.Date;

public class AnnualMember extends Member{

    public AnnualMember(String name, Date mStart) {
        super(name);
        this.memberType = "Annual";
        this.mStartDate = mStart;
        Calendar c = Calendar.getInstance();
        c.setTime(this.mStartDate);
        c.add(Calendar.YEAR, 1);
        this.mEndDate = c.getTime();
    }

    @Override
    public void addToDatabase() {
        System.out.println("Added the Annual member to the Database");
    }

    @Override
    public void makeBooking() {
        System.out.println("Court booked for Annual Member");
    }
}
