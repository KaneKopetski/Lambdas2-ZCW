import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PersonUtilities {

    public ArrayList<String> checkWithPredicate(List<Person> personList, CheckPerson toCompare){
        ArrayList<String> result = new ArrayList<>();
        personList.forEach(person -> {if (toCompare.test(person)) result.add(person.printPerson());});
        return result;
    }

    class Tester implements CheckPerson{
        private Predicate<Person> predicate;

        Tester(Predicate<Person> predicate){
            this.predicate = predicate;
        }

        public boolean test(Person p){
            return predicate.test(p);
        }
    }
}

