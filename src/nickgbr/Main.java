package nickgbr;

import nickgbr.exeptions.IncorrectNumberOfPeopleException;
import nickgbr.exeptions.TheSameNameAgeException;
import nickgbr.sorters.BubbleSort;
import nickgbr.sorters.InsertionSort;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws TheSameNameAgeException, IncorrectNumberOfPeopleException {

        ArrayList<Person> originalList = PeopleGenerator.generate(10);
        ArrayList<Person> testedList = new ArrayList<>(originalList);

        long startTime = System.currentTimeMillis();
        new BubbleSort().sortByName(testedList);
        long endTime = System.currentTimeMillis();
        System.out.println("*** Bubble sort by name ***");
        getStat(originalList, testedList, startTime, endTime);
        testedList = new ArrayList<>(originalList);

        startTime = System.currentTimeMillis();
        new BubbleSort().sortByAge(testedList);
        endTime = System.currentTimeMillis();
        System.out.println("*** Bubble sort by age ***");
        getStat(originalList, testedList, startTime, endTime);
        testedList = new ArrayList<>(originalList);

        startTime = System.currentTimeMillis();
        new InsertionSort().sortByName(testedList);
        endTime = System.currentTimeMillis();
        System.out.println("*** Insertion sort by name ***");
        getStat(originalList, testedList, startTime, endTime);
        testedList = new ArrayList<>(originalList);

        startTime = System.currentTimeMillis();
        new InsertionSort().sortByAge(testedList);
        endTime = System.currentTimeMillis();
        System.out.println("*** Insertion sort by age ***");
        getStat(originalList, testedList, startTime, endTime);
    }

    private static void getStat(ArrayList<Person> originalList, ArrayList<Person> testedList, long startTime, long endTime) {
        System.out.println("Original list = " + originalList);
        System.out.println("Sorted list = " + testedList);
        System.out.println("Execution time = " + (endTime - startTime) + "ms\n");
    }
}