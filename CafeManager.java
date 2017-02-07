import java.util.ArrayList;

public class CafeManager
{
    private ArrayList <MenuItem> menuOffers;
    private ArrayList <Order> customerOrders;
    
    public CafeManager()
    {
        menuOffers = new ArrayList<MenuItem>();
        customerOrders = new ArrayList<Order>();
        setDefaultMenu();
    }
    
    public void showCafeInterface()                                                     //displays the interface for the menu
    {
        System.out.println("Choose by entering corrisponding number");
        System.out.println("-------Cafe Options-------");
        System.out.println("1 - View menu items");
        System.out.println("2 - Add to menu items");
        System.out.println("3 - Add a new customer order");
        System.out.println("4 - View customer order");
        System.out.println("5 - Close an order");
        System.out.println("6 - Staff training");
        System.out.println("7 - Exit");
        System.out.println("--------------------------");
    }
    
    public ArrayList getMenuOffers()                                                    //returns a duplicate of the menuOffers Array
    {
        ArrayList <MenuItem> duplicate = new ArrayList <MenuItem>();
        for(MenuItem i:menuOffers)
        {
            MenuItem copy = new MenuItem();
            copy = i;
            duplicate.add(copy);
        }
        return duplicate;
    }
    
    public ArrayList getCustomerOrders()                                                //returns a duplicate of the customer orders array
    {
        ArrayList <Order> duplicate = new ArrayList <Order>();
        for(Order i:customerOrders)
        {
            Order copy = new Order();
            copy = i;
            duplicate.add(copy);
        }
        return duplicate;
    }
    
    public void addToMenu(MenuItem mo)                                                  //adds a menu item to the menu offers array, essentially upating the menu
    {
        MenuItem duplicate = new MenuItem();
        duplicate = mo;
        menuOffers.add(duplicate);
        System.out.println(duplicate.getName() + " has been added to the menu");
    } 
    
    public void updateOrders(Order co)
    {
        Order duplicate = new Order();
        duplicate = co;
        customerOrders.add(duplicate);
    }
    
    public void setDefaultMenu()                                                        //displays all currently available items on the menu
    {
   
        menuOffers.add(new FoodItem("Beef","Meat of cow",30,"Braai Meat","salt","pepper","spice","lemon","herbs"));
        menuOffers.add(new DrinkItem("Juice","Mix of flavours",20,"Mix and serve",20,30,33,10));
            
    }
    
    public Order getSingleOrder(int i)
    {
        Order duplicate = new Order();
        duplicate = customerOrders.get(i);
        return duplicate;
    }
    
    public MenuItem getSingleItem(int i)
    {
        MenuItem duplicate = new MenuItem();
        duplicate = menuOffers.get(i);
        return duplicate;
    }
}