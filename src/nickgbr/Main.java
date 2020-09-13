package nickgbr;

import nickgbr.Constants.Sex;
import nickgbr.Exeptions.TheSameNameAgeException;
import nickgbr.Sorters.BubbleSort;
import nickgbr.Sorters.InsertionSort;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws TheSameNameAgeException {

        ArrayList<Person> people = new PeopleGenerator().generate(50);
        //System.out.println(people);
//        Person Nick = new Person(26, new Sex(Sex.MAN),"Nick1");
//        Person Nick1 = new Person(26, new Sex(Sex.MAN),"Nick2");
//        Person Nick2 = new Person(26, new Sex(Sex.MAN),"Nick3");

//        people.add(Nick2);
//        people.add(Nick);
//        people.add(Nick1);

        //new BubbleSort().sortByAge(people);
        new InsertionSort().sortByAge(people);
        System.out.println(people);

    }
}