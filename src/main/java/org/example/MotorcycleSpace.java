package org.example;

public class MotorcycleSpace extends Space{


    public MotorcycleSpace(int amount) {
        super(amount);
    }

    @Override
    public String toString() {
        return "MotorcycleSpace{" +
                "amount=" + amount +
                '}';
    }

    @Override
    public Type Type() {
        return Type.MOTORCYCLE;
    }
}
