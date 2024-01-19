package org.example.moneyExample;

public class Dollar {
    public int amount;
    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier){

        return new Dollar(amount*multiplier);//Value object
        //Any time a value object is created equals must be implemented
    }

    public boolean equals(Object object){
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }


}
