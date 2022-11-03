package OpenClosePrinciple3;

import java.math.BigDecimal;

public class SavingsAccount {
    BigDecimal balance;

    public SavingsAccount(BigDecimal balance) {
        this.balance = balance;
    }

    void doDeposit(BigDecimal amount){
        this.balance = this.balance.add(amount);
    }

    void withDraw(BigDecimal amount){
        this.balance = this.balance.subtract(amount);
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "balance=" + this.balance +
                '}';
    }
}
