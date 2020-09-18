package nickgbr.constants;

public class Sex {

    private Gender sex;

    protected Sex(){}

    public Sex(Gender gender){
        this.sex = gender;
    }

    public String toString(){
        return sex.toString();
    }
}
