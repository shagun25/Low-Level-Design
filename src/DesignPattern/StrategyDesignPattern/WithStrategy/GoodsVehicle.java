package DesignPattern.StrategyDesignPattern.WithStrategy;

import DesignPattern.StrategyDesignPattern.WithStrategy.Strategy.NormalDriverStrategy;

public class GoodsVehicle extends Vehicle{

    GoodsVehicle(){
        super(new NormalDriverStrategy());
    }
}
