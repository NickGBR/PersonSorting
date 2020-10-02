package nickgbr;

import nickgbr.constants.Gender;
import nickgbr.constants.Names;
import nickgbr.exeptions.IncorrectNumberOfPeopleException;

import java.util.ArrayList;

public class PeopleGenerator {

    public static ArrayList<Person> generate(int numberOfPeople) throws IncorrectNumberOfPeopleException {
        if (numberOfPeople <= 0) {
            throw new IncorrectNumberOfPeopleException("Incorrect number of people.");
        }
        ArrayList<Person> persons = new ArrayList<Person>();
        for (int i = 0; i < numberOfPeople; i++) {
            Gender gender;

            if (Math.random() < 0.5) {
                gender = Gender.MAN;
            } else gender = Gender.WOMAN;

            String name = null;
            if (gender.toString().equals(Gender.MAN.toString())) {
                name = Names.MEN[(int) (Math.random() * Names.MEN.length)];
            } else name = Names.WOMEN[(int) (Math.random() * Names.WOMEN.length)];

            int age = (int) (Math.random() * 101);
            persons.add(new Person(age, gender, name));
        }
        return persons;
    }
}

