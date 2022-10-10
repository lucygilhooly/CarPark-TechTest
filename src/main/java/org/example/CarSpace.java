package org.example;

public class CarSpace extends Space{


    public CarSpace(int amount) {
        super(amount);
    }

    @Override
    public String toString() {
        return "CarSpace{" +
                "amount=" + amount +
                '}';
    }

    @Override
    public Type Type() {
        return Type.CAR;
    }

}
