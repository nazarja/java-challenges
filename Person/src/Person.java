public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public void setLastName(String name) {
        this.lastName = name;
    }

    public void setAge(int number) {
        if (number >= 0 && number <= 100)  this.age = number;
    }

    public boolean isTeen() {
        return (this.age > 12 && this.age < 20);
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) return "";
        else if (!firstName.isEmpty() && lastName.isEmpty()) return this.firstName;
        else if (firstName.isEmpty() && !lastName.isEmpty()) return this.lastName;
        else return this.firstName + " " + this.lastName;
    }
}
