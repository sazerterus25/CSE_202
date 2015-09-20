/**
 * Created by Mahathir on 19-09-15.
 */

public class Account {
    private Customer customer;
    private int accountNumber;
    private double balance;
    private String branch;
    public Account(Customer cust,int no,double b){
        this.customer=cust;
        this.accountNumber=no;
        this.balance=b;
    }
    public Account(Customer cust,int no,String br){
        this.customer=cust;
        this.accountNumber=no;
        this.branch=br;
    }
    public void setBalance(double b){
        this.balance=b;
    }
    public void setBranch(String br){
        this.branch=br;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public Customer getCustomer(){
        return this.customer;
    }
    public String getCustomerName(){
        return this.customer.getName();
    }
    public double getBalance(){
        return this.balance;
    }
    public String getBranch(){
        return this.branch;
    }
    public void credit(double amount){
        this.balance+=amount;
    }
    public void debit(double amount){
        if(amount<=this.balance){
            this.balance-=amount;
            return;
        }
        System.out.println("Amount withdrawn exceeds the current balance!" + '\n');
    }
    public void print(){
        System.out.println("Customer: " + this.getCustomerName() +"Branch: " + this.getBranch() + "A/C no" + this.getAccountNumber() + "Balance: " + this.getBalance() + '\n');
    }

}
