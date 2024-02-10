
public class App {
    public static void main(String[] args) {
        EmployeeComponent ceo = new Employee("Settha", "CEO", 500000);

        EmployeeComponent salesDepartment = new EmployeeGroup("Sales");
        EmployeeComponent marketingDepartment = new EmployeeGroup("Marketing");

        EmployeeComponent headSales = new Employee("Kamphaka", "Head Sales", 300000);
        EmployeeComponent sales1 = new Employee("Wiroj", "Sales", 150000);
        EmployeeComponent sales2 = new Employee("Weeranan", "Sales", 100000);

        EmployeeComponent headMarketing = new Employee("UngInk", "Head Marketing", 300000);
        EmployeeComponent marketing1 = new Employee("Oak", "Marketing", 200000);
        EmployeeComponent marketing2 = new Employee("Aem", "Marketing", 250000);

        salesDepartment.add(headSales);
        salesDepartment.add(sales1);
        salesDepartment.add(sales2);

        marketingDepartment.add(headMarketing);
        marketingDepartment.add(marketing1);
        marketingDepartment.add(marketing2);

        EmployeeGroup company = new EmployeeGroup("Company");
        company.add(ceo);
        company.add(salesDepartment);
        company.add(marketingDepartment);

        company.print();
    }
}
