package nickgbr;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new PeopleGenerator().generate(100000);
        for (Person p: people){
            System.out.println(p);
        }
    }
}
