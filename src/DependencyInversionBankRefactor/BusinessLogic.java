package DependencyInversionBankRefactor;

public class BusinessLogic {
    IBankApiPort iBankApiPort;
    IPaypalApiPort iPaypalApiPort;

    public BusinessLogic(IBankApiPort iBankApiPort, IPaypalApiPort iPaypalApiPort) {
        this.iBankApiPort = iBankApiPort;
        this.iPaypalApiPort = iPaypalApiPort;
    }

    public void doPayment(final double amount) {
        iBankApiPort.doPayment( amount);
    }

    public void chargeCustomer(final double amount){
        iPaypalApiPort.chargeCustomer( amount);
    }
}
