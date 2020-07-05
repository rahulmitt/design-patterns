package com.rahulmitt.interviewpedia.dp.creational.factorymethod;

import com.rahulmitt.interviewpedia.dp.creational.factorymethod.creator.TradeCreator;
import com.rahulmitt.interviewpedia.dp.creational.factorymethod.creator.impl.TradeCreatorImpl;
import com.rahulmitt.interviewpedia.dp.creational.factorymethod.trade.Trade;

public class FactoryMethodMain {
    public static void main(String[] args) {
        TradeCreator tradeCreator = new TradeCreatorImpl();
        Trade trade = tradeCreator.create();
        trade.action();
    }
}
