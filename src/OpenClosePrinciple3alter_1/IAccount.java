package OpenClosePrinciple3alter_1;

import java.math.BigDecimal;

public interface IAccount {
    abstract void doDeposit(BigDecimal amount);
    abstract void withDraw(BigDecimal amount);
}
