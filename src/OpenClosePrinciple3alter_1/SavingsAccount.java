package OpenClosePrinciple3alter_1;

import java.math.BigDecimal;

public class SavingsAccount implements IAccount {
    BigDecimal balance = new BigDecimal(0);

    public SavingsAccount(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public void doDeposit(BigDecimal amount) {
        this.balance = this.balance.add( amount);
    }

    @Override
    public void withDraw(BigDecimal amount) {
        this.balance = this.balance.subtract( amount);
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "balance=" + this.balance +
                '}';
    }
}
