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

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        this.age = ( (age >= 0) && (age <= 100) ) ? age : 0;
    }

    public boolean isTeen(){
        return ( (age > 12) && (age < 20) ) ? true : false;
    }

    public String getFullName(){
        if( !firstName.isEmpty() && !lastName.isEmpty() ) {
            return (firstName + " " + lastName);
        } else if( firstName.isEmpty() ) {
            return lastName;
        } else if ( lastName.isEmpty() ) {
            return firstName;
        } else return "";
    }
}

