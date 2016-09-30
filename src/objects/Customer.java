package objects;

/**
 * Created by jpmc on 9/29/2016.
 */

public class Customer extends Person {
    String customerOrder;


    //@override from Person Class
    public String introduceYourSelf(){
        String firstName = getFirstName();
        String lastName = getLastName();
        return "Hi I'm "+firstName+" "+lastName+" "+" and I'm a Customer";
    }

    //@overload from class
    public String introduceYourSelf(String customerOrder){
        String firstName = getFirstName();
        String lastName = getLastName();
        return "Hi I'm "+firstName+" "+lastName+" "+" and I'm a Customer"+" I want to buy a "+customerOrder;
    }

    public String getCustomerOrder() {
        return customerOrder;
    }

    public void setCustomerOrder(String customerOrder) {
        this.customerOrder = customerOrder;
    }
}
