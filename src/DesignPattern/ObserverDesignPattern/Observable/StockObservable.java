package DesignPattern.ObserverDesignPattern.Observable;

import DesignPattern.ObserverDesignPattern.Observer.NotificationAlertObserver;

public interface StockObservable {

    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public  void notifySubscribers();
    public void setStockCount(int newStockAdded);
    public int getStockCount();
}
