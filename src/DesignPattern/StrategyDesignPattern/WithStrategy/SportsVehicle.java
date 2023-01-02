package DesignPattern.StrategyDesignPattern.WithStrategy;

import DesignPattern.StrategyDesignPattern.WithStrategy.Strategy.SportDriveStrategy;

public class SportsVehicle extends Vehicle{

    public SportsVehicle(){
        super(new SportDriveStrategy());
    }
}
