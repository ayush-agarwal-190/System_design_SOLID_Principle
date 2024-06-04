// interface segmented principle 
// interface should be such that client should not implement unnecessary function they do not need 

interface RestaurantEmployee
{
    void washDishes();
    void serveCustomer();
    void cookFood();
}
class waiter implements RestaurantEmployee{


    public void washDishes()
    {

    } 
    public void serveCustomers()
    {
        System.out.println("sserving customer");
    }
    public void cookFood()
    {

    }
}


// ?? break interface into many segmentes like 

interface WaiterInterface
{
    void serveCustomers();
    void takeOrder();
}
interface chefInterface
{
    void cookForrd();
    void decideMenu();
}

class waiter implements WaiterInterface
{
    public void serveCustomers()
    {
        System.out.println("serving the customer");
    }
    public void takeOrder()
    {
        System.out.println("Taking orders");
    }

}