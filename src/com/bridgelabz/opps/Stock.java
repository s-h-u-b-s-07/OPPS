package com.bridgelabz.opps;

public class Stock {
    private String shareName;
    private int noOfShare;
    private double sharePrice;
    private double totalValue;

    public double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public String getShareName() {
        return shareName;
    }

    public void setShareName(String shareName) {
        this.shareName = shareName;
    }

    public int getNoOfShare() {
        return noOfShare;
    }

    public void setNoOfShare(int noOfShare) {
        this.noOfShare = noOfShare;
    }

    public double getSharPrice() {
        return sharePrice;
    }

    public void setSharPrice(double sharPrice) {
        this.sharePrice = sharPrice;
    }

    @Override
    public String toString() {
        return "Stock [shareName=" + shareName + ", noOfShare=" + noOfShare + ", sharPrice=" + sharePrice + "]";
    }

}
