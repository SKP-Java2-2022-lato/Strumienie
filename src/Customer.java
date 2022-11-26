public class Customer {
    private String firstName;
    private String lastName;
    private String city;
    private int birthYear;

    public Customer(String firstName, String lastName, String city, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.birthYear = birthYear;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "\n Customer{" +
                " \n firstName='" + firstName + '\'' +
                ", \n lastName='" + lastName + '\'' +
                ", \ncity='" + city + '\'' +
                ", \nbirthYear=" + birthYear +
                "\n}";
    }
}
