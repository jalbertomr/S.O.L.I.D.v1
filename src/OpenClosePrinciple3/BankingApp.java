package OpenClosePrinciple3;

import java.math.BigDecimal;
import java.util.Currency;

public class BankingApp {
    public static void main(String[] args) {
        BigDecimal balance = new BigDecimal(0);

        // previous tasks...
        CurrentAccount currentAccount = new CurrentAccount( balance);
        currentAccount.doDeposit( new BigDecimal(100.11));
        System.out.println( currentAccount);
        currentAccount.withDraw( new BigDecimal(175.75));
        System.out.println( currentAccount);
        // some tasks...
        SavingsAccount savingsAccount = new SavingsAccount( balance);
        savingsAccount.withDraw( new BigDecimal(100.23));
        System.out.println( savingsAccount);
        savingsAccount.doDeposit( new BigDecimal(25.25));
        System.out.println( savingsAccount);
        // some tasks...
    }
}
