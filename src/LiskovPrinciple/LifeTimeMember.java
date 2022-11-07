package LiskovPrinciple;

import java.util.Calendar;
import java.util.Date;

public class LifeTimeMember extends Member {

    public LifeTimeMember(String name, Date mStart) {
        super(name);
        this.memberType = "LifeTime";
        this.mStartDate = mStart;
        Calendar c = Calendar.getInstance();
        c.setTime( this.mStartDate);
        c.add(Calendar.YEAR, 70);
        this.mEndDate = c.getTime();
    }

    @Override
    public void addToDatabase() {
        System.out.println("Added the LifeTime Member into de DB");
    }

    @Override
    public void doBooking() {
        System.out.println("Court booked for Lifetime Member");
    }
}
