public class BankAccounts extends Asset {
    private String beneficiaries;
    private String iban;
    private AccountType acctType;
    private float balance;

    public enum AccountType {
        SAVINGS, CURRENT // Add more if needed
    }
}