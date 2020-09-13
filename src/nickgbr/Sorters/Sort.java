package nickgbr.Sorters;

import nickgbr.Exeptions.TheSameNameAgeException;
import nickgbr.Person;
import java.util.List;

public interface Sort {
    public List sortByName(List<Person> people) throws TheSameNameAgeException;
    public List sortByAge (List<Person> people) throws TheSameNameAgeException;

}
