package org.example;

public abstract class Space {

    int amount = 0;

    public Space(int amount) {
        this.amount = amount;
    }

    public abstract Type Type();
}
