package nickgbr.Sorters;

import nickgbr.Person;
import java.util.List;

public interface Sort {
    public List sortByName(List<Person> people);
    public List sortByAge (List<Person> people);

}
