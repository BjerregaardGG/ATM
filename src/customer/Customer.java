package customer;

public class Customer implements ICustomer {
    private int customerId;
    private String customerFirstName;
    private String customerLastName;

    public Customer(int customerId, String customerFirstName, String customerLastName) {
        this.customerId = customerId;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

}

