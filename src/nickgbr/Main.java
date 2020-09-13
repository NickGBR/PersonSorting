package nickgbr;

import nickgbr.Constants.Sex;
import nickgbr.Exeptions.IncorrectNumberOfPeopleException;
import nickgbr.Exeptions.TheSameNameAgeException;
import nickgbr.Sorters.BubbleSort;
import nickgbr.Sorters.InsertionSort;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws TheSameNameAgeException, IncorrectNumberOfPeopleException {

        ArrayList<Person> originalList = new PeopleGenerator().generate(50);
        ArrayList<Person> testedList = originalList;

        long startTime = System.currentTimeMillis();
        new BubbleSort().sortByName(testedList);
        long endTime = System.currentTimeMillis();
        System.out.println("*** Bubble sort by name ***");
        System.out.println("Original list = " + originalList );
        System.out.println("Sorted list = " + testedList);
        System.out.println("Execution time = " + (endTime-startTime) + "ms");
        testedList = originalList;

        System.out.println("");
        startTime = System.currentTimeMillis();
        new BubbleSort().sortByAge(testedList);
        endTime = System.currentTimeMillis();
        System.out.println("*** Bubble sort by age ***");
        System.out.println("Original list = " + originalList );
        System.out.println("Sorted list = " + testedList);
        System.out.println("Execution time = " + (endTime-startTime) + "ms");
        testedList = originalList;

        System.out.println("");
        startTime = System.currentTimeMillis();
        new InsertionSort().sortByAge(testedList);
        endTime = System.currentTimeMillis();
        System.out.println("*** Insertion sort by name ***");
        System.out.println("Original list = " + originalList );
        System.out.println("Sorted list = " + testedList);
        System.out.println("Execution time = " + (endTime-startTime) + "ms");
        testedList = originalList;

        System.out.println("");
        startTime = System.currentTimeMillis();
        new InsertionSort().sortByAge(testedList);
        endTime = System.currentTimeMillis();
        System.out.println("*** Insertion sort by age ***");
        System.out.println("Original list = " + originalList );
        System.out.println("Sorted list = " + testedList);
        System.out.println("Execution time = " + (endTime-startTime) + "ms");
    }
}