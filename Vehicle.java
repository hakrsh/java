class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}

// Responsible for printing details
class VehiclePrinter {
    public void printDetails(Vehicle vehicle) {
        System.out.println("Make: " + vehicle.getMake());
        System.out.println("Model: " + vehicle.getModel());
        System.out.println("Year: " + vehicle.getYear());
    }
}

// Responsible for calculating the value of the vehicle
class VehicleValueCalculator {
    public double calculateValue(Vehicle vehicle) {
        // Example logic for calculation
        int age = 2024 - vehicle.getYear();
        return 20000 - (age * 1000);  // Just a hypothetical calculation
    }
}

// Responsible for database operations related to the vehicle
class VehicleDatabase {
    public void addVehicleToDB(Vehicle vehicle) {
        // Code to add the vehicle to the database
        System.out.println("Vehicle added to the database.");
    }
}
