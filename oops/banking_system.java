package oops;
class Account{
    int acc_no;
    String name;
    double amount;
    double balance;
    public void insert(int a, String n, float amt){
        acc_no=a;
        name=n;
        amount=amt;
    }
    // balance
//    public void balance(){
//        balance = 0.0;
//    }
    // deposit
    public void deposit(double amt){
        amount=amount+amt;
        System.out.println(amt+" "+"deposited in "+" "+name);
    }
    // withdraw
    public void withdraw(double amt){
        if(amount<amt){
            System.out.println("Insufficient balance");
        }
        else {
            amount=amount-amt;
            System.out.println(amt+" "+"withdrawn from "+" "+name);
        }
    }
    public void getbalance(){
        System.out.println("The balance is "+" "+amount+"in "+ name);
    }
    public void display(){
        System.out.println(acc_no+" "+name+" "+amount);
    }
}
public class banking_system {
    public static void main(String[] args){
        Account a1 = new Account();
        Account a2 = new Account();
        a1.insert(12345,"karthik",5000);
        a1.display();
        a2.insert(64573,"Ankith",3000);
        a2.display();
        a1.deposit(10000);
        a1.display();
        a2.deposit(20000);
        a2.display();
        a1.withdraw(3000);
        a1.display();
        a2.withdraw(2000);
        a2.display();
        a1.getbalance();
        a2.getbalance();
    }
}
