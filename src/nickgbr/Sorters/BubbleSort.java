
package nickgbr.Sorters;
import nickgbr.Constants.Sex;
import nickgbr.Person;

import java.util.List;

public class BubbleSort implements Sort{

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
        System.out.println(people);
        for( int i = 0;i<menCounter;i++){
            Person person = people.get(menCounter-1);
            people.remove(person);
            people.add(0+i,person);

        }
    }

    @Override
    public List sortByName(List<Person> people) {
        for(int i = 0;i<people.size();i++){

            Person person = people.get(i);

            char letter = person.getName().charAt(0);

            if(letter<141) letter +=32;

        }

        return null;
    }

    @Override
    public List sortByAge (List<Person> people){
        for(int i = 1; i<people.size();i++){
            if(people.get(i-1).getAge()>people.get(i).getAge()){
                Person personOld = people.get(i-1);
                Person personYang = people.get(i);
                people.remove(personOld);
                people.remove(personYang);
                people.add(i-1,personYang);
                people.add(i,personOld);
                i=0;
            }
        }
        System.out.println(people);
        menToForwardPositions(people);
        System.out.println(people);
        return people;
    }
}
