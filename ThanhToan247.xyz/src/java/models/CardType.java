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
public class CardType {
    private int cardTypeID;
    private String cardTypeName;

    public CardType() {
    }

    public CardType(int cardTypeID) {
        this.cardTypeID = cardTypeID;
    }

    public CardType(String cardTypeName) {
        this.cardTypeName = cardTypeName;
    }

    public CardType(int cardTypeID, String name) {
        this.cardTypeID = cardTypeID;
        this.cardTypeName = name;
    }

    public int getCardTypeID() {
        return cardTypeID;
    }

    public void setCardTypeID(int cardTypeID) {
        this.cardTypeID = cardTypeID;
    }

    public String getName() {
        return cardTypeName;
    }

    public void setName(String name) {
        this.cardTypeName = name;
    }

    @Override
    public String toString() {
        return "CardType{" + "cardTypeID=" + cardTypeID + ", name=" + cardTypeName + '}';
    }

   
}
