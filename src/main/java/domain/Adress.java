package domain;

/**
 * Created by jeansmits on 9/07/15.
 */
public class Adress {

    private String street;
    private int stNr;
    private int postCode;
    private String city;

    public Adress(String street, int stNr, int postCode, String city) {
        this.street = street;
        this.stNr = stNr;
        this.postCode = postCode;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getStNr() {
        return stNr;
    }

    public void setStNr(int stNr) {
        this.stNr = stNr;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
