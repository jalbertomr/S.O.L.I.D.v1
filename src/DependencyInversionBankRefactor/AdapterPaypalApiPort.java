package DependencyInversionBankRefactor;

import DependencyInversionBankRefactor.Paypal.PaypalApi;

public class AdapterPaypalApiPort implements IPaypalApiPort {
    private PaypalApi paypalApi;

    public AdapterPaypalApiPort(PaypalApi paypalApi) {
        this.paypalApi = paypalApi;
    }

    public void chargeCustomer(final double amount){
        this.paypalApi.chargeCustomer( amount);
    }
}
