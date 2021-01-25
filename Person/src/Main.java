public class Main {

    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName("Sean");
        person.setLastName("Murphy");

        String fullName = person.getFullName();
        System.out.println(fullName);
    }
}
