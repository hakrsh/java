package Shrayansh.StrategyPattern;
import java.util.*;;
public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new SportVehicle());
        vehicles.add(new OffRoadVehicle());
        vehicles.add(new GoodsVehicle());
        for(Vehicle vehicle : vehicles) {
            vehicle.drive();
        }
    }
}
