package com.epam.kostiuk.strategy_templatemethod;

public class AscBubbleSort implements SortStrategy {

    @Override
    public int[] sort(int[] sortArray) {

        for (int i = 0; i < sortArray.length; i++) {
            for (int j = 0; j < sortArray.length - 1; j++) {
                if (swap(sortArray[j], sortArray[j + 1])) {
                    int temp = sortArray[j + 1];
                    sortArray[j + 1] = sortArray[j];
                    sortArray[j] = temp;
                }
            }
        }

        return sortArray;
    }

    public boolean swap(int number, int nextNumber) {
        return number >= nextNumber;
    }
}
