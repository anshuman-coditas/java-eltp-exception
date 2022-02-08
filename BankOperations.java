package CustomizedExceptionAssignment;
public class BankOperations {
    double balance=0.0;
    public BankOperations(double bal){
        this.balance=bal;
    }
    public void deposit(double amount) throws InvalidAmountException {
        if(amount<=0)
            throw new InvalidAmountException("Amount invalid.");
        System.out.println("Amount Entered "+amount);
        System.out.println("After Depositing ::"+(balance+amount));
    }
    public void withdraw(double amount) throws InvalidAmountException, InsufficientBalanceException {
        if(amount<=0)
            throw new InvalidAmountException("Amount Invalid");
        if(amount>balance)
            throw new InsufficientBalanceException("Insufficient Funds");

        System.out.println("Amount to be Withdrawn: "+amount);
        System.out.println("Balance after Withdrawing: "+(balance-amount));

    }
}
