package org.example.moneyExample;

public class Franc {
    public int amount;
    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiplier){

        return new Franc(amount*multiplier);//Value object
        //Any time a value object is created equals must be implemented
    }

    public boolean equals(Object object){
        Franc franc = (Franc) object;
        return amount == franc.amount;
    }

}
