package ValidateNotNullAndEmptyString;

public class Main {
    public static void main(String[] args) {
        String stringNull = null;
        String stringEmpty = "";
        String stringFilled = "StringWithValue";

        isFilledValidatedVSNull( stringNull );
        isFilledNotValidatedVSNull( stringNull );

    }

    public static boolean isFilledNotValidatedVSNull(String stringParam) {
        try {
            if (stringParam.isEmpty()) {
                System.out.println("string is empty");
                return false;
            } else {
                System.out.println("string is filled:" + stringParam);
                return true;
            }
        } catch (Exception e) {
            System.out.println("isFilledNotValidatedVSNull - Exception catched: " + e);
            return false;
        }
    }

    public static boolean isFilledValidatedVSNull(String stringParam) {
        if ( stringParam != null && !stringParam.isEmpty()){
            System.out.println("string not null and not empty: " + stringParam );
            return true;
        }
        System.out.println("isFilledValidatedVSNull:" +stringParam);
        return false;
    }
}
