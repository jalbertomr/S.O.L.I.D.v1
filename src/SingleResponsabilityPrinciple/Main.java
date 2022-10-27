package SingleResponsabilityPrinciple;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Hugo", "Worker", 7, 1000);

        double calcTax = TributaryService.calcTax(emp);

        System.out.println("employee calculated Tax:" + calcTax);
    }
}
