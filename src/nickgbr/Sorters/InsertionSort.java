package nickgbr.Sorters;

import nickgbr.Constants.Sex;
import nickgbr.Exeptions.TheSameNameAgeException;
import nickgbr.Person;

import java.util.LinkedList;
import java.util.List;

public class InsertionSort implements Sort {

    @Override
    public List sortByAge(List<Person> people) throws TheSameNameAgeException {
        removeNullElements(people);
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
                }

                //В случае совбедение имени и возраста выбрасывается исключение.
                else if (age==age2 && people.get(left).getName().equals(people.get(i).getName())){
                    throw new TheSameNameAgeException("Name and age are the same.");
                }

                else break;

            }
        }

        menToForwardPositions(people);

        return people;
    }



    @Override
    public List sortByName(List<Person> people) throws TheSameNameAgeException {
        removeNullElements(people);
        for(int left  = 0; left<people.size();left++){

            int charCounter = 0;
            String leftName = people.get(left).getName();

            int i = left-1;
            for(;i>=0;i--) {

                String name = people.get(i).getName();

                //Находим длину самого короткого имени
                int nameLength = name.length();
                if(leftName.length()<nameLength){
                    nameLength = leftName.length();
                }

                System.out.println(name);
                char leftNameChar = leftName.charAt(charCounter);
                char nameChar = name.charAt(charCounter);

                //Если возраст нового эллимента больше то переставим его правее
                if (leftNameChar < nameChar) {
                    Person person = people.get(i);
                    people.remove(i);
                    people.add(i + 1, person);
                }

                //В случае совбедение имени и возраста выбрасывается исключение.
                else if (people.get(left).getAge()==people.get(i).getAge() && people.get(left).getName().equals(people.get(i).getName())){
                    throw new TheSameNameAgeException("Name and age are the same.");
                }

                //Если буквы одинаковые то проверяем следующую
                else if(leftNameChar == nameChar && charCounter!=nameLength-1){
                    i++;
                    charCounter++;
                }

                else break;

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

    private void removeNullElements(List<Person> people){
        for(int i = 0; i<people.size();i++){
            if(people.get(i)==null){
                people.remove(i);
                i=0;
            }
        }
    }
}
