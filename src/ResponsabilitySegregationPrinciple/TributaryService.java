package ResponsabilitySegregationPrinciple;

import java.io.Console;

public class TributaryService {

    public static double calcTax(Employee employee){
       return employee.getSalary() * 0.15;
    }

    public static Boolean payTax(Employee employee){
        double tax = calcTax(employee);
        System.out.println("Se pago " + tax + " de impuesto de " + employee.getName());
        return true;
    }
}
