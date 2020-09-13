package nickgbr.Sorters;

import nickgbr.Constants.Sex;
import nickgbr.Exeptions.TheSameNameAgeException;
import nickgbr.Person;

import java.util.LinkedList;
import java.util.List;

public class InsertionSort implements Sort {

    @Override
    public List sortByAge(List<Person> people) throws TheSameNameAgeException {

        for(int left  = 0; left<people.size();left++){

            //Вытаскиеваем значение возраста
            int age = people.get(left).getAge();

            //Перемещаеся к эллименту перед вытащенным
            int i = left-1;
            for(;i>=0;i--) {

                int age2 = people.get(i).getAge();

                //Если возраст нового эллимента больше то переставим его правее
                if (age < age2) {
                    Person person = people.get(i);
                    people.remove(i);
                    people.add(i + 1, person);
                } else break;
            }
        }

        menToForwardPositions(people);

        return people;
    }

    @Override
    public List sortByName(List<Person> people) throws TheSameNameAgeException {
        return null;
    }


    private void menToForwardPositions(List<Person> people){

        int menCounter = 0;

        for(int i = 0; i<people.size();i++){
            Person person = people.get(i);
            if (person.getSex().toString().equals(Sex.MAN)){
                people.remove(person);
                people.add(0,person);
                menCounter++;
            }
        }

        for( int i = 0;i<menCounter;i++){
            Person person = people.get(menCounter-1);
            people.remove(person);
            people.add(0+i,person);

        }
    }
}
