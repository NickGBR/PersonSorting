package nickgbr;

import nickgbr.Constants.Sex;
import nickgbr.Exeptions.TheSameNameAgeException;
import nickgbr.Sorters.BubbleSort;
import nickgbr.Sorters.InsertionSort;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws TheSameNameAgeException {

        ArrayList<Person> people = new PeopleGenerator().generate(100);
        System.out.println(people);
//        Person Nick = new Person(26, new Sex(Sex.MAN),"Nick");
//        Person Nick1 = new Person(26, new Sex(Sex.MAN),"Nicu");
//        Person Nick2 = new Person(26, new Sex(Sex.MAN),"Nick3");

//        people.add(Nick);
//        people.add(Nick1);
//        people.add(Nick1);

        //new BubbleSort().sortByAge(people);
        new InsertionSort().sortByName(people);
        //new InsertionSort().sortByAge(people);

        for(Person person:people) {
            System.out.println(person.getName());
        }
    }
}