import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PersonUtilitiesTest {
    private List<Person> personList = new ArrayList<>();
    private Person person1 = new Person("Joe", LocalDate.of(1999, 12, 22), Person.Sex.MALE, "");
    private Person person2 = new Person("John", LocalDate.of( 2000, 1, 23), Person.Sex.MALE, "");
    private Person person3 = new Person("Jane", LocalDate.of(2011, 10, 24), Person.Sex.FEMALE, "");
    private Person person4 = new Person("Joan" , LocalDate.of(1943, 9, 7), Person.Sex.FEMALE, "");


    @Test
    public void checkWithPredicate() {
        personList.clear();

        Predicate<Person> predicate = person -> person.getAge() > 21;
        PersonUtilities personUtils = new PersonUtilities();

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);

        CheckPerson tester = personUtils.new Tester(predicate);

        Integer expected = 1;
        Integer actual = personUtils.checkWithPredicate(personList, tester).size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkWithPredicate2(){
        personList.clear();

        Predicate<Person> predicate = person -> person.getAge() < 21;
        PersonUtilities personUtils = new PersonUtilities();

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);

        CheckPerson tester = personUtils.new Tester(predicate);

        Integer expected = 3;
        Integer actual = personUtils.checkWithPredicate(personList, tester).size();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void checkWithPredicate3(){
        personList.clear();

        Predicate<Person> predicate = person -> person.getAge() < 21 && person.getAge() > 5;
        PersonUtilities personUtils = new PersonUtilities();

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);

        CheckPerson tester = personUtils.new Tester(predicate);

        Integer expected = 3;
        Integer actual = personUtils.checkWithPredicate(personList, tester).size();

        Assert.assertEquals(expected, actual);

    }

}
