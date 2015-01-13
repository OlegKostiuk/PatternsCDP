package com.epam.kostiuk.strategy_templatemethod;

public interface SortStrategy {
    int[] sort(int[] sortArray);
    boolean swap(int number, int nextNumber);
}
