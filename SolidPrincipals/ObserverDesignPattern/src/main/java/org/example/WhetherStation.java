package org.example;

import java.util.ArrayList;
import java.util.List;

public class WhetherStation implements Subject {

    private int temp;
    List<Observer> observerList = new ArrayList<>();

    public void setTemp(int temp) {
        this.temp = temp;
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer o: observerList) {
            o.update(temp);
        }
    }
}
