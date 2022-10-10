package org.example;

public class VanSpace extends Space{

    public VanSpace(String type) {
        super(type);
    }

    @Override
    public Type Type() {
        return Type.VAN;
    }
}
