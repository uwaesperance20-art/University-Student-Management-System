
public class Instructor extends Person {

    private String department;

    public Instructor(int id, String name, int age, String department) {

        super(id, name, age);

        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {

        return super.toString() +
                "\nDepartment: " + department;
    }
}

