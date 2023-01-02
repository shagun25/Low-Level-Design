package DesignPatterns.StrategyDesignPattern.WithStrategy;

import DesignPatterns.StrategyDesignPattern.WithStrategy.Strategy.SportDriveStrategy;

public class SportsVehicle extends Vehicle{

    public SportsVehicle(){
        super(new SportDriveStrategy());
    }
}
