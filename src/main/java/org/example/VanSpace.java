package org.example;

public class VanSpace extends Space{


    public VanSpace(int amount) {
        super(amount);
    }

    @Override
    public String toString() {
        return "VanSpace{" +
                "amount=" + amount +
                '}';
    }

    @Override
    public Type Type() {
        return Type.VAN;
    }
}
