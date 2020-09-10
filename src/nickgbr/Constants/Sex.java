package nickgbr.Constants;

public class Sex {
    public  static final String WOMAN = "WOMAN";
    public  static final String MAN = "MAN";

    private String sex;

    protected Sex(){}

    public Sex(String sex){
        this.sex = sex;
    }

    public String getSex(){
        return sex;
    }
}
