package OpenClosePrinciple2Refactor;

public class Addition implements IOperation{
    public double a;
    public double b;
    public double result = 0.0;

    public Addition( double a, double b){
        this.a = a;
        this.b = b;
    }

    @Override
    public void perform() {
        this.result = this.a + this.b;
    }
}
