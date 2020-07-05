package com.rahulmitt.interviewpedia.dp.creational.prototype;

import com.rahulmitt.interviewpedia.dp.creational.prototype.impl.Account;
import com.rahulmitt.interviewpedia.dp.creational.prototype.impl.Trade;

public class PrototypeMain {
    public static void main(String[] args) {
        Trade trade = new Trade();
        Trade clonedTrade = trade.getClone();
        clonedTrade.execute();

        Account account = new Account();
        Account clonedAccount = account.getClone();
        clonedAccount.reconcile();
    }
}
