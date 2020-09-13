
package nickgbr.Sorters;
import nickgbr.Constants.Sex;
import nickgbr.Exeptions.TheSameNameAgeException;
import nickgbr.Person;

import java.util.List;

public class BubbleSort implements Sort{



    @Override
    public List sortByName(List<Person> people) throws TheSameNameAgeException {

        for(int i = 1;i<people.size();i++){

            Person person1 = people.get(i);
            Person person = people.get(i-1);

            if(people.get(i-1).getAge()==people.get(i).getAge()&& people.get(i-1).getName().equals(people.get(i).getName())){
                throw new TheSameNameAgeException("Name and age are the same.");
            }

            int shortWordLength;

            if(person.getName().length()<person1.getName().length()){
                shortWordLength = person.getName().length();
            }
            else shortWordLength = person1.getName().length();

                for(int l = 0; l<shortWordLength;l++){

                    char letterP = person.getName().charAt(l);
                    char letterP1 = person1.getName().charAt(l);

                    if(letterP<97) letterP +=32;
                    if(letterP1<97) letterP1 +=32;

                    if(letterP>letterP1){
                        people.remove(person);
                        people.remove(person1);
                        people.add(i-1,person1);
                        people.add(i, person);
                        i=0;
                        break;
                    }
                    if(letterP<letterP1){
                        break;
                    }
                }
        }

        menToForwardPositions(people);
        return people;
    }

    @Override
    public List sortByAge (List<Person> people) throws TheSameNameAgeException {
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
            else if(people.get(i-1).getAge()==people.get(i).getAge()&& people.get(i-1).getName().equals(people.get(i).getName())){
                throw new TheSameNameAgeException("Name and age are the same.");
            }
        }

        menToForwardPositions(people);
        return people;
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
