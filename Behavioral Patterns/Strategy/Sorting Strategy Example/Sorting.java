import strategies.SortingStrategy;

import java.util.List;

public class Sorting {
    SortingStrategy sortingStrategy;


    public Sorting(SortingStrategy strategy) {
        this.sortingStrategy = strategy;
    }

    public void setStrategy(SortingStrategy strategy) {
        this.sortingStrategy = strategy;
    }


    public void sortNumbers(List<Integer> numbers) {
        sortingStrategy.sort(numbers);
    }

    public SortingStrategy getSortingStrategy() {
        return sortingStrategy;
    }




}
