package kg.iaau.edu.com.model;

public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private String groupName;

    public Student()
    {

    }

    public Student(int id, String firstName, String lastName, String groupName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.groupName = groupName;
    }

    public Student(String firstName, String lastName, String groupName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.groupName = groupName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
