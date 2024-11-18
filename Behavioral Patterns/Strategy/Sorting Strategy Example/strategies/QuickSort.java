package strategies;

import java.util.List;

public class QuickSort implements SortingStrategy {
    @Override
    public void sort(List<Integer> numbers) {
        quickSort(numbers, 0, numbers.size() - 1);
    }

    private void quickSort(List<Integer> numbers, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(numbers, low, high);
            quickSort(numbers, low, pivotIndex - 1);
            quickSort(numbers, pivotIndex + 1, high);
        }
    }

    private int partition(List<Integer> numbers, int low, int high) {
        int pivot = numbers.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (numbers.get(j) <= pivot) {
                i++;
                // Swap numbers[i] and numbers[j]
                int temp = numbers.get(i);
                numbers.set(i, numbers.get(j));
                numbers.set(j, temp);
            }
        }

        // Swap numbers[i+1] and numbers[high] (pivot)
        int temp = numbers.get(i + 1);
        numbers.set(i + 1, numbers.get(high));
        numbers.set(high, temp);

        return i + 1;
    }
}
