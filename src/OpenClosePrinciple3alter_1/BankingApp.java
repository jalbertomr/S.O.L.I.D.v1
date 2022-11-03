package OpenClosePrinciple3alter_1;


import java.math.BigDecimal;

public class BankingApp {
    public static void main(String[] args) {
        BigDecimal balance = new BigDecimal(0);
        // previous tasks...
        IAccount currentIAccount = new CurrentAccount( balance);
        currentIAccount.doDeposit( new BigDecimal(123532.34));
        System.out.println(currentIAccount);
        currentIAccount.withDraw( new BigDecimal(234.00));
        System.out.println(currentIAccount);
        // some tasks...
        IAccount savingsIAccount = new SavingsAccount( balance);
        savingsIAccount.withDraw( new BigDecimal(77.12));
        System.out.println(savingsIAccount);
        savingsIAccount.doDeposit( new BigDecimal(111.11));
        System.out.println(savingsIAccount);
        // some tasks...
    }
}
