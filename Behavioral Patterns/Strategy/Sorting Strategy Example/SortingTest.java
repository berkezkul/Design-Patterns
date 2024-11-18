import strategies.BubbleSort;
import strategies.QuickSort;

import java.util.Arrays;
import java.util.List;

public class SortingTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 2, 8, 1);

        //Using strategies.BubbleSort
        System.out.println("Original List: " + numbers);
        Sorting sorter = new Sorting(new BubbleSort());
        sorter.sortNumbers(numbers);
        System.out.println("Sorted with strategies.BubbleSort: " + numbers);


        // Switch to a different strategy(Quick Sort)
        numbers = Arrays.asList(5, 3, 2, 8, 1); // Reset the list
        sorter.setStrategy(new QuickSort());
        sorter.sortNumbers(numbers);
        System.out.println("Sorted with strategies.QuickSort: " + numbers);

    }
}
