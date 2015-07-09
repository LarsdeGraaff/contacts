package domain;

import javax.activation.DataSource;
import java.util.Date;

/**
 * Created by jeansmits on 9/07/15.
 */
public class Contact {
    private String firstName;
    private String lastName;
    private Gender gender;
    private String group;
    private Adress adress;
    private Date birthdate;

    public Contact(String firstName, String lastName, Gender gender, String group, Adress adress, Date birthdate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.group = group;
        this.adress = adress;
        this.birthdate = birthdate;
    }

    public Contact() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}
