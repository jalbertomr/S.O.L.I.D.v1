package OpenClosePrinciple3_1;

import java.math.BigDecimal;

public abstract class Account {
    protected BigDecimal balance = new BigDecimal(0);
    protected abstract void doDeposit(BigDecimal amount);
    protected abstract void withDraw(BigDecimal amount);
}
