package Shrayansh.StrategyPattern;

import Shrayansh.StrategyPattern.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{
    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
