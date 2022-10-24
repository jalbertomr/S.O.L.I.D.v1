package LiskovPrincipleWITH;

import java.util.Date;

abstract class Member {
    String name;
    String memberType;
    Date mStartDate;
    Date mEndDate;

    public Member(String name) {
        this.name = name;
    }

    public abstract void addToDatabase();
}
