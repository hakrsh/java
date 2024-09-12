package Shrayansh.solid;
import java.util.*;;
class Marker  {
    String color;
    double price;
    
    public Marker(String color,double price) {
        this.color = color;
        this.price = price;
    }
}
class Invoice {
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker,int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }
    public double calculateTotal() {
        return marker.price * quantity;
    }
}
// class InvoiceDao {
//     Invoice invoice;
    
//     public InvoiceDao(Invoice invoice) {
//         this.invoice = invoice;
//     }
//     public void saveToDB() {
//         // save the data into DB
//     }
// }
class InvoicePrinter {
    Invoice invoice;
    
    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }
    public void printInvoice() {
        // print the invoice
    }
}

interface InvoiceDao {
    public void save(Invoice invoice);
}

class DbInvoiceDao implements InvoiceDao {
    @Override
    public void save(Invoice invoice) {
        // save Invoice into DB
    }
}

class FileInvoiceDao implements InvoiceDao {
    @Override
    public void save(Invoice invoice) {
        // save Invoice into file
    }
}

interface RestaurantEmployee {
    void washDishes();
    void serveCustomers();
    void cookFood();
}

class Waiter implements RestaurantEmployee {
    public void washDishes() {
        // not my job
    }
    public void serveCustomers() {
        System.out.println("Serving the customer");
    }
    public void cookFood() {
        // not my job
    }
}

interface WaiterInterface {
    void serveCustomers();
    void takeOrder();
}

interface ChefInterface {
    void cookFood();
    void decideMenu();
}

class WiredKeyboard {}
class WiredMouse {}

class MacBook {
    private final WiredKeyboard keyboard;
    private final WiredMouse mouse;

    public MacBook() {
        keyboard = new WiredKeyboard();
        mouse = new WiredMouse();
    }
}

class Vehicle {
    public Integer getNumberofWheels() {
        return 2;
    }
}

class EngineVehicle extends Vehicle {
    public Boolean hasEngine() {
        return true;
    }
}

class MotorCycle extends EngineVehicle {}

class Car extends EngineVehicle {
    public Integer getNumberofWheels() {
        return 4;
    }
}
class Bicyle extends Vehicle {
    public Boolean hasEngine() {
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        List<EngineVehicle> vehicles = new ArrayList<>();
        vehicles.add(new MotorCycle());
        vehicles.add(new Car());
        // vehicles.add(new Bicyle());

        for(EngineVehicle vehicle : vehicles) {
            System.out.println(vehicle.hasEngine().toString());
        }
    }
}

