package se.nackademin.model;


import se.nackademin.controller.IObserver;

public interface IObservable {

    void attach(IObserver iObserver);
    void detach(IObserver iObserver);
    void notify(String message);
}