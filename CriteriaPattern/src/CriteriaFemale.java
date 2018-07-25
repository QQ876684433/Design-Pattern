import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<>();
        persons.stream().filter(person -> person.getGender().equalsIgnoreCase("FEMALE")).forEach(femalePersons::add);
        return femalePersons;
    }
}
