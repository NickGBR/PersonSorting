package nickgbr.sorters;

import nickgbr.exeptions.TheSameNameAgeException;
import nickgbr.Person;
import java.util.List;

public interface Sort {
    List sortByName(List<Person> people) throws TheSameNameAgeException;
    List sortByAge (List<Person> people) throws TheSameNameAgeException;

}
