package java_core.functional_interface.predicate;

public class Employee {
    private Integer id;
    private Integer age;
    private String gender;
    private String firstName;
    private String lastName;

    public Employee(Integer id, Integer age, String gender, String fName, String lName) {
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.firstName = fName;
        this.lastName = lName;
    }

    public Integer getId() {
        return id;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return this.id.toString() + " - " + this.age.toString();
    }
}
