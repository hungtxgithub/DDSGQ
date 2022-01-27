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
    private String name;

    public CardType() {
    }

    public CardType(int cardTypeID) {
        this.cardTypeID = cardTypeID;
    }

    public CardType(int cardTypeID, String name) {
        this.cardTypeID = cardTypeID;
        this.name = name;
    }

    public int getCardTypeID() {
        return cardTypeID;
    }

    public void setCardTypeID(int cardTypeID) {
        this.cardTypeID = cardTypeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CardType{" + "cardTypeID=" + cardTypeID + ", name=" + name + '}';
    }

   
}
