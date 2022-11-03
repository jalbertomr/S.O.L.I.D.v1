package OpenClosePrinciple3_1;

import java.math.BigDecimal;

public class BankingApp {
    public static void main(String[] args) {
        // previous tasks...
        Account currentAccount = new CurrentAccount();
        currentAccount.doDeposit( new BigDecimal(100.10));
        System.out.println(currentAccount);
        currentAccount.withDraw( new BigDecimal(125.25));
        System.out.println(currentAccount);
        // some tasks...
        Account savingsAccount = new SavingsAccount();
        savingsAccount.doDeposit( new BigDecimal(200.22));
        System.out.println(savingsAccount);
        savingsAccount.withDraw( new BigDecimal(111.11));
        System.out.println(savingsAccount);
        // some tasks...
    }
}
