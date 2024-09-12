package Shrayansh.StrategyPattern;

import Shrayansh.StrategyPattern.strategy.SportDriveStrategy;

public class SportVehicle extends Vehicle{
    public SportVehicle() {
        super(new SportDriveStrategy());
    }
}
