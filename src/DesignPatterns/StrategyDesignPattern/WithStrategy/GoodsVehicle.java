package DesignPatterns.StrategyDesignPattern.WithStrategy;

import DesignPatterns.StrategyDesignPattern.WithStrategy.Strategy.NormalDriverStrategy;

public class GoodsVehicle extends Vehicle{

    GoodsVehicle(){
        super(new NormalDriverStrategy());
    }
}
