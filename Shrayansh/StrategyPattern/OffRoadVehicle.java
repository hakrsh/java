package Shrayansh.StrategyPattern;

import Shrayansh.StrategyPattern.strategy.SportDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle() {
        super(new SportDriveStrategy());
    }
}
