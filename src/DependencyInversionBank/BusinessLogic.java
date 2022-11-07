package DependencyInversionBank;

import DependencyInversionBank.Bank.BankApi;
import DependencyInversionBank.Paypal.PaypalApi;

public class BusinessLogic {
    private BankApi bankApi;
    private PaypalApi paypalApi;

    public BusinessLogic(BankApi bankApi, PaypalApi paypalApi) {
        this.bankApi = bankApi;
        this.paypalApi = paypalApi;
    }

    public void doPayment(final double amount){
        bankApi.doPayment( amount);
    }

    public void chargeCustomer( final double amount) { paypalApi.chargeCustomer( amount);}
}
