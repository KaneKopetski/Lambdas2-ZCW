import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;

public class PersonTest {
    Person person;
    LocalDate birthday;

    @Before
    public void setup() {
        birthday = LocalDate.of(1989, 6, 12);
        person = new Person("Kane", birthday, Person.Sex.MALE, "kane.kopetski@gmail.com");
    }

    @Test
    public void getName() {
        String expected = "Kane";
        String actual = person.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setName() {
        String expected = "Kane2";
        person.setName(expected);
        String actual = person.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getBirthday() {
        LocalDate expected = birthday;
        LocalDate actual = person.getBirthday();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthday() {
        LocalDate expected = LocalDate.of(1989, 6, 13);
        person.setBirthday(expected);
        LocalDate actual = person.getBirthday();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getGender() {
        Person.Sex expected = Person.Sex.MALE;
        Person.Sex actual =  person.getGender();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setGender() {
        Person.Sex expected = Person.Sex.FEMALE;
        person.setGender(expected);
        Person.Sex actual =  person.getGender();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getEmailAddress() {
        String expected = "kane.kopetski@gmail.com";
        String actual = person.getEmailAddress();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setEmailAddress() {
        String expected = "kanek899@gmail.com";
        person.setEmailAddress(expected);
        String actual = person.getEmailAddress();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAge() {
        Integer expected = 30;
        Integer actual = person.getAge();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void printPerson() {
        String expected = "Name: Kane is 30 years old.";
        String actual = person.printPerson();

        Assert.assertEquals(expected, actual);
    }
}
