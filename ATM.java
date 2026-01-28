public class ATM {
    private double balance = 2000;
    public void deposit(double amount) {
        balance = balance + amount;
    }
    public void withdraw(double amount) {
        balance = balance - amount;
    }
    double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.deposit(1000);
        obj.withdraw(100);
        System.out.println(obj.getBalance());
    }
}
