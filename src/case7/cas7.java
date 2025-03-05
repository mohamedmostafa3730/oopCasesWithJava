package case7;

import java.util.ArrayList;

public class cas7 {
    public static void main(String[] args) {
        Account myAccount1 = new Account("mohamed", 20, 50000);
        Account myAccount2 = new Account("Ahmed", 23, 34000);
        Bank b = new Bank();
        b.addAccount(myAccount2);
        b.addAccount(myAccount1);
        b.getAccountInfo(myAccount2);
        System.out.println("-============================-");
        b.getAccountInfo(myAccount1);
    }

    /*
     * [1] Write a Java program to create a class called "Bank" with a collection of
     * accounts and methods to add and remove accounts,
     * [2] and to deposit and withdraw money.
     * [3] Also define a class called "Account" to maintain account details of a
     * particular customer.
     */

    public static class Bank {
        private ArrayList<Account> collectionAccounts;

        public Bank() {
            collectionAccounts = new ArrayList<Account>(); 
        }

        public void addAccount(Account account) {
            collectionAccounts.add(account);
        }

        public void removeAccount(Account account) {
            collectionAccounts.remove(account);
        }

        public void depositInAccount( Account account , double dep){
            account.Deposit(dep);
        }

        public void withdrawInAccount( Account account , double dra){
            account.withdraw(dra);
        }

        public void getAccountInfo(Account account){
            System.out.println("|=============================|");
            System.out.println("| The Account name is: " + account.name + " |");
            System.out.println("| The Account age is: " + account.age + " |");
            System.out.println("| The Account amount is: " + account.amount + " |");
            System.out.println("|=============================|");
        }

    }

    public static class Account {
        private String name;
        private int age;
        private double amount;

        public Account(String name, int age, double amount) {
            this.name = name;
            this.age = age;
            this.amount = amount;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public void Deposit(double dep) {
            this.amount = this.amount + dep;
        }

        public void withdraw(double dra) {
            this.amount = this.amount - dra;
        }

    }
}
