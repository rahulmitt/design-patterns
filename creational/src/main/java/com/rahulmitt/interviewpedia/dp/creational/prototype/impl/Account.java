package com.rahulmitt.interviewpedia.dp.creational.prototype.impl;

import com.rahulmitt.interviewpedia.dp.creational.prototype.Prototype;

public class Account implements Prototype<Account> {
    public Account() {
        System.out.println("Account constructed.");
    }

    public Account getClone() {
        // if required, put deep copy code here
        return new Account();
    }

    public void reconcile() {
        System.out.println("Account.reconcile() called.");
    }
}
