package by.javacource.task1.service;

import by.javacource.task1.entity.CustomArrayImpl;
import by.javacource.task1.exception.CustomException;

public interface WorkWithArray {

    int searchMaxElement(CustomArrayImpl array);

    int searchMinElement(CustomArrayImpl array);

    CustomArrayImpl changeElements(CustomArrayImpl array, int element);

    int amountOfNegativeElements(CustomArrayImpl array);

    double averageValueOfElement(CustomArrayImpl array) throws CustomException;

    int sumOfElements(CustomArrayImpl array);

    int amountOfPositiveElements(CustomArrayImpl array);


}
