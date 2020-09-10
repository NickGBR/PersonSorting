package nickgbr;

import nickgbr.Constants.Sex;

public class Person {

    private int age;
    private Sex sex;
    private String name;

    private Person(){}

    public Person(int age, Sex sex, String name){
        this.age = age;
        this.sex = sex;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }
}
