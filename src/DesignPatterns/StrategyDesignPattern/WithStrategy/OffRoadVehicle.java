package DesignPatterns.StrategyDesignPattern.WithStrategy;

import DesignPatterns.StrategyDesignPattern.WithStrategy.Strategy.SportDriveStrategy;

public class OffRoadVehicle extends Vehicle{

    public OffRoadVehicle(){
        super(new SportDriveStrategy());
    }
}
