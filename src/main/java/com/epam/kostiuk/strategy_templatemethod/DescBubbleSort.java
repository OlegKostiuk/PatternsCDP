package com.epam.kostiuk.strategy_templatemethod;

public class DescBubbleSort extends AscBubbleSort {
    @Override
    public boolean swap(int number, int nextNumber) {
        return number <= nextNumber;
    }
}
