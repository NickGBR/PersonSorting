package nickgbr;

import nickgbr.Constants.Sex;
import nickgbr.Exeptions.TheSameNameAgeException;
import nickgbr.Sorters.BubbleSort;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws TheSameNameAgeException {

        ArrayList<Person> people = new PeopleGenerator().generate(10);
        System.out.println(people);
//        Person Nick = new Person(26, new Sex(Sex.MAN),"Nick");
//        Person Nick1 = new Person(26, new Sex(Sex.MAN),"Nick");
//        Person Nick2 = new Person(26, new Sex(Sex.MAN),"Nick");

//        people.add(Nick2);
//        people.add(Nick);
//        people.add(Nick1);

        //new BubbleSort().sortByAge(people);
        new BubbleSort().sortByName(people);
        System.out.println(people);
    }
}
