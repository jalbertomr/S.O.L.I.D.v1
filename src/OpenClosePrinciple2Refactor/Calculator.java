package OpenClosePrinciple2Refactor;

// Adding a new operation forces to modify this Class code
public class Calculator {

    public static void main(String[] args) throws Exception {
        Calculator obj = new Calculator();
        Addition add = new Addition(10, 5);
        obj.calculate( add);
        System.out.println("Add result: " + add.result);

        Substraction substraction = new Substraction(10, 5);
        obj.calculate( substraction);
        System.out.println("Substraction result: " + substraction.result);

        Multiplication multiplication = new Multiplication(10, 5);
        obj.calculate( multiplication);
        System.out.println("Multiplication result: " + multiplication.result);
    }

    public void calculate(IOperation operation) throws Exception {
        if (operation == null){
            throw new  Exception("Operation is null");
        }

        operation.perform();

    }
}
