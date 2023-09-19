package lab1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

 

public class Item {
    private String name;
    private int price;
    public Item() {
        super();
    }

 

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Item" + "name='" + name + '\'' + ", $ price=" + price  ;
    }
    public static final double REVISION = 1.0;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public static void demo(){
        Item item1 = new Item("Apple", (int) 4);
        Item item2 = new Item("Blueberry", (int) 5);
        Item item3 = new Item("chicken", (int) 10);
        double total = item1.price + item2.price + item3.price;
        double cash = 20.0;
        double change = cash - total;
        

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH:mm");
        LocalDateTime dateTime = LocalDateTime.now();
        String formattedDT = dateTime.format(dateTimeFormatter);
        System.out.println("Date and time:"+formattedDT);
        System.out.println(item1.toString());
        System.out.println(item2.toString());
        System.out.println(item3.toString());
        
        System.out.println("total: "+ total);
        
        

        System.out.println("change:"+change);

        
        
 

        }
}