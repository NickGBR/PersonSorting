package nickgbr;

import nickgbr.Constants.Names;
import nickgbr.Constants.Sex;

import java.util.ArrayList;

public class PeopleGenerator {

    public static ArrayList<Person> generate(int numberOfPeople) {
        ArrayList<Person> persons = new ArrayList<Person>();
        for (int i = 0; i < numberOfPeople; i++) {
            Sex sex;

            if (Math.random() < 0.5) {
                sex = new Sex(Sex.MAN);
            } else sex = new Sex(Sex.WOMAN);

            String name = null;
            if (sex.toString().equals(Sex.MAN)) {
                name = Names.MEN[(int) (Math.random() * Names.MEN.length)];
            } else name = Names.WOMEN[(int) (Math.random() * Names.WOMEN.length)];

            int age = (int) (Math.random() * 101);
            persons.add(new Person(age,sex,name));
        }
        return persons;
    }
}

