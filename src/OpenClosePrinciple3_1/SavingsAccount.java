package OpenClosePrinciple3_1;

import java.math.BigDecimal;

public class SavingsAccount extends Account {
    @Override
    protected void doDeposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    @Override
    protected void withDraw(BigDecimal amount) {
        balance = balance.subtract(amount);
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "balance=" + balance +
                '}';
    }
}
