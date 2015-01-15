package com.epam.kostiuk.bridge;

public class EconomyEngine implements Engine {
    @Override
    public void accelerate() {
        System.out.println("Slow but economy.");
    }
}
