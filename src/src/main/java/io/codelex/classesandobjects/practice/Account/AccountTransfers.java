package io.codelex.classesandobjects.practice.Account;

public class AccountTransfers {
    public static void main(String[] args) {

        Account mattsAccount = new Account("Matt's", 1000);
        Account myAccount = new Account("My", 0);
        mattsAccount.withdrawal(100.0);
        myAccount.deposit(100.0);
        System.out.println(mattsAccount);
        System.out.println(myAccount);

        Account A = new Account("A", 100.0);
        Account B = new Account("B", 0.0);
        Account C = new Account("C", 0.0);

        Account.transfer(A, B, 50.0);
        Account.transfer(B, C, 25.0);

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

    }
}
