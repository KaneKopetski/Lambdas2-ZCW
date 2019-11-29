import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private LocalDate birthday;
    private Sex gender;
    private String emailAddress;

    public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Integer getAge(){
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthday, currentDate).getYears();

    }

    public String printPerson(){
        String result = "Name: " + this.name + " is " + this.getAge() + " years old.";
        System.out.println(result);
        return result;
    }

    public enum Sex {
        MALE, FEMALE
    }
}