public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // LastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("John"); // firstName is John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is Smith
        System.out.println("fullName= " + person.getFullName());
    }
}
