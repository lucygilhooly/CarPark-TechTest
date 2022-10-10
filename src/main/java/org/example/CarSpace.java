package org.example;

public class CarSpace extends Space{
    public CarSpace(String type) {
        super(type);
    }

    @Override
    public Type Type() {
        return Type.CAR;
    }

}
