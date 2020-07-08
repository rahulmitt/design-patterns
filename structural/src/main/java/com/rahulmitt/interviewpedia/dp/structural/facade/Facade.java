package com.rahulmitt.interviewpedia.dp.structural.facade;

import com.rahulmitt.interviewpedia.dp.structural.facade.subsys1.SubSystem1;
import com.rahulmitt.interviewpedia.dp.structural.facade.subsysN.SubSystemN;

public class Facade {
    public void processOrder() {
        SubSystem1 subSystem1 = new SubSystem1();
        subSystem1.getCustomer();
        subSystem1.getSecurity();
        subSystem1.priceTransaction();

        SubSystemN subSystemN = new SubSystemN();
        subSystemN.checkBalances();
        subSystemN.completeOrder();
    }
}
