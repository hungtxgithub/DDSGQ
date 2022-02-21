/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author hungt
 */
public class HistoryRecharge {
    private int rechargeID;
    private String transactionID;
    private float money;
    private String time;
    private int userID;

    public HistoryRecharge() {
    }

    public HistoryRecharge(int rechargeID, String transactionID, float money, String time, int userID) {
        this.rechargeID = rechargeID;
        this.transactionID = transactionID;
        this.money = money;
        this.time = time;
        this.userID = userID;
    }

    public int getRechargeID() {
        return rechargeID;
    }

    public void setRechargeID(int rechargeID) {
        this.rechargeID = rechargeID;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        return "HistoryRecharge{" + "rechargeID=" + rechargeID + ", transactionID=" + transactionID + ", money=" + money + ", time=" + time + ", userID=" + userID + '}';
    }
    
    
}
