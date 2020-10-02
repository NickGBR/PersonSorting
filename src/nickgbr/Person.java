package nickgbr;

import nickgbr.constants.Gender;

public class Person {

    private int age;
    private Gender gender;
    private String name;

    private Person() {
    }

    public Person(int age, Gender gender, String name) {
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Gender getSex() {
        return gender;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String s = name + " " + gender.toString() + " " + age;
        return s;
    }

}
