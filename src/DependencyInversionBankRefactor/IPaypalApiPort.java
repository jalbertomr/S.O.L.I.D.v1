package DependencyInversionBankRefactor;

public interface IPaypalApiPort {
    public void chargeCustomer(final double amount);
}
