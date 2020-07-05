package com.rahulmitt.interviewpedia.dp.creational.factorymethod.creator.impl;

import com.rahulmitt.interviewpedia.dp.creational.factorymethod.creator.TradeCreator;
import com.rahulmitt.interviewpedia.dp.creational.factorymethod.trade.Trade;
import com.rahulmitt.interviewpedia.dp.creational.factorymethod.trade.impl.TradeImpl;

public class TradeCreatorImpl implements TradeCreator {
    public Trade create() {
        return new TradeImpl();
    }
}
