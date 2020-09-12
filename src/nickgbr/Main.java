package nickgbr;

import nickgbr.Sorters.BubbleSort;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new PeopleGenerator().generate(30);
        new BubbleSort().sortByAge(people);
    }
}
