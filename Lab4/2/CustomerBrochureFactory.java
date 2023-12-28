public class CustomerBrochureFactory implements ICustomerFactory{


    @Override
    public ICustomer createCustomer(String customerType) {
        ICustomer customer = null;
        switch(customerType) {
            case "Regular":
                customer = new RegularCustomer();
                break;
            case "Mountain":
                customer = new MountainCustomer();
                break;
            case "Delinquent":
                customer = new DelinquentCustomer();
                break;
        }
        return customer;
    }
}
