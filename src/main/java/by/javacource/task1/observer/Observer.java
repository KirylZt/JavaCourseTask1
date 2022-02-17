package by.javacource.task1.observer;

import by.javacource.task1.exception.CustomException;

public interface Observer {
    void parameterChanged(ArrayEvent arrayEvent) throws CustomException;
}
