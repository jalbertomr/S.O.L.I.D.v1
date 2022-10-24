package NotUseEqualsOrNotEqual;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Double val1 = 123.123;
        Double val2 = 123.123;
        Double valnull = null;

        System.out.println( testEqual( val1, val2));
        System.out.println( testEqual( valnull, val1));
        System.out.println( testEqual( val1, valnull));

        System.out.println(testObjectEquals( valnull, val2));
        System.out.println(testObjectEquals( valnull, valnull));
    }

    public static Boolean testEqual( Double a, Double b){
        if ( a != null && a.equals(b) ) {
            return true;
        } else return false;
    };

    public static Boolean testObjectEquals( Double a, Double b){
        return Objects.equals( a, b);
    }
}
