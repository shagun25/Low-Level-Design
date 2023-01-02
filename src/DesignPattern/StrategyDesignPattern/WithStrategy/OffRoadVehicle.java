package DesignPattern.StrategyDesignPattern.WithStrategy;

import DesignPattern.StrategyDesignPattern.WithStrategy.Strategy.SportDriveStrategy;

public class OffRoadVehicle extends Vehicle{

    public OffRoadVehicle(){
        super(new SportDriveStrategy());
    }
}
