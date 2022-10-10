package org.example;

public class MotorcycleSpace extends Space{

    public MotorcycleSpace(String type) {
        super(type);
    }

    @Override
    public Type Type() {
        return Type.MOTORCYCLE;
    }
}
