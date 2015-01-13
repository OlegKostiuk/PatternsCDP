package com.epam.kostiuk.strategy_templatemethod;

public class ArraySorter {

    private SortStrategy sortStrategy = new AscBubbleSort();

    public void changeStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public int[] sort(int[] arrayToSort) {
        return sortStrategy.sort(arrayToSort);
    }
}
