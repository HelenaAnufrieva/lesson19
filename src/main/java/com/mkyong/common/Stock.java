package com.mkyong.common;

public class Stock {
    int stockId;
    String stockCode;
    String stockName;

    public Stock(int stockId, String stockCode, String stockName) {
        this.stockId = stockId;
        this.stockCode = stockCode;
        this.stockName = stockName;
    }

    public Stock(){}

    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
}