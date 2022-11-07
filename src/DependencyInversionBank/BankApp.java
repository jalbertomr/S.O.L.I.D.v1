package DependencyInversionBank;

import DependencyInversionBank.Bank.BankApi;
import DependencyInversionBank.Paypal.PaypalApi;

public class BankApp {
    public static void main(String[] args) {
        double amount;

        BusinessLogic businessLogic = new BusinessLogic( new BankApi(),
                new PaypalApi());

        amount = 123.45;
        businessLogic.doPayment(amount);

        businessLogic.chargeCustomer( amount);
    }
}
