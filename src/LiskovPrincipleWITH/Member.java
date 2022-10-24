package LiskovPrincipleWITH;

import java.util.Date;

class Member implements IDatabaseInference, IBookingInference{
    String name;
    String memberType;
    Date mStartDate;
    Date mEndDate;

    public Member(String name) {
        this.name = name;
    }

    public void addToDatabase(){};

    public void makeBooking(){};
}
