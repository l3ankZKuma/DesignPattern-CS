
import java.util.ArrayList;
import java.util.List;

public class EmployeeGroup extends EmployeeComponent {
    private List<EmployeeComponent> employees = new ArrayList<>();
    private String groupName;

    public EmployeeGroup(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public void add(EmployeeComponent employeeComponent) {
        employees.add(employeeComponent);
    }

    @Override
    public void remove(EmployeeComponent employeeComponent) {
        employees.remove(employeeComponent);
    }

    @Override
    public void print() {
        System.out.println("\n" + groupName + " Group:");
        for (EmployeeComponent employee : employees) {
            employee.print();
        }
    }
}
