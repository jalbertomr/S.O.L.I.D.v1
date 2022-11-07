package DependencyInversionBankRefactor;

import DependencyInversionBankRefactor.Bank.BankApi;

public class AdapterBankApiPort implements IBankApiPort {
    private BankApi bankApi;

    public AdapterBankApiPort(BankApi bankApi) {
        this.bankApi = bankApi;
    }

    @Override
    public void doPayment( final double amount) {
        this.bankApi.doPayment( amount);
    }
}
