package OpenClosePrinciple3;

import java.math.BigDecimal;

public class CurrentAccount {
    BigDecimal balance;

    public CurrentAccount(BigDecimal balance) {
        this.balance = balance;
    }

    void doDeposit(BigDecimal amount){
        this.balance = this.balance.add(amount);
    };

    void withDraw(BigDecimal amount){
        this.balance = this.balance.subtract(amount);
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "balance=" + this.balance +
                '}';
    }
}
