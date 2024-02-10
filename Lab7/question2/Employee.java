
public class Employee extends EmployeeComponent {
    private String name;
    private String position;
    private int salary;

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void print() {
        System.out.println("Employee :[ Name : " + getName() + ", position : " + getPosition() + ", salary : " + getSalary() + " ]");
    }
}
