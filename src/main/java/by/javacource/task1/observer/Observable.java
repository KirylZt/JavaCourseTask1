package by.javacource.task1.observer;

import by.javacource.task1.exception.CustomException;

public interface Observable {
    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObservers() throws CustomException;
}
