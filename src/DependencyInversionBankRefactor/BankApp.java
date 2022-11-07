package DependencyInversionBankRefactor;

import DependencyInversionBankRefactor.Paypal.PaypalApi;
import DependencyInversionBankRefactor.Bank.BankApi;

public class BankApp {
    public static void main(String[] args) {

        double amount;

        BusinessLogic businessLogic = new BusinessLogic( new AdapterBankApiPort( new BankApi()),
                new AdapterPaypalApiPort( new PaypalApi()));

        amount = 123.45;
        businessLogic.doPayment( amount);

        businessLogic.chargeCustomer( amount);
    }
}
