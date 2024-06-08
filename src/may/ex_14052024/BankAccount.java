package may.ex_14052024;

public class BankAccount {
    String bankname;
    int balance;
    String bankcode;

    BankAccount(){
        bankname = "SBI";
        bankcode = "SBI001";
        balance = 0;
    }

    public BankAccount(int balance, String bankname, String bankcode) {
        this.balance = balance;
        this.bankname = bankname;
        this.bankcode = bankcode;
    }

    void printDetails(){
        System.out.println("Bank name -> "+ bankname);
        System.out.println("Bank code -> "+ bankcode);
        System.out.println("Bal -> " + balance);
    }
}
