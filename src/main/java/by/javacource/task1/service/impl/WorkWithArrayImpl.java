package by.javacource.task1.service.impl;

import by.javacource.task1.entity.CustomArrayImpl;
import by.javacource.task1.exception.CustomException;
import by.javacource.task1.service.WorkWithArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WorkWithArrayImpl implements WorkWithArray {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public int searchMaxElement(CustomArrayImpl array) {
        int maxElement = array.getArray()[0];
        for (int i = 1; i < array.getArray().length; i++) {
            if (array.getArray()[i] > maxElement) {
                maxElement = array.getArray()[i];
            }
        }
        return maxElement;
    }

    @Override
    public int searchMinElement(CustomArrayImpl array) {
        int minElement = array.getArray()[0];
        for (int i = 1; i < array.getArray().length; i++) {
            if (array.getArray()[i] < minElement) {
                minElement = array.getArray()[i];
            }
        }
        return minElement;
    }

    @Override
    public CustomArrayImpl changeElements(CustomArrayImpl array, int element) {
        int[] arr = array.getArray();
        for (int i = 0; i < arr.length; i++) {
            if (array.getArray()[i] < 0) {
                array.getArray()[i] = element;
            }
        }
        return new CustomArrayImpl(arr);
    }

    @Override
    public double averageValueOfElement(CustomArrayImpl array) throws CustomException {
        double sum = 0;
        double averageValue;
        for (int i = 0; i < array.getArray().length; i++) {
            sum = sum + array.getArray()[i];
        }
        try {
            averageValue = sum / array.getArray().length;
        } catch (ArithmeticException e) {
            logger.info("Division by zero");
            throw new CustomException("Array length = 0");
        }

        return averageValue;
    }

    @Override
    public int sumOfElements(CustomArrayImpl array) {
        int sum = 0;
        for (int i = 0; i < array.getArray().length; i++) {
            sum = sum + array.getArray()[i];
        }
        return sum;
    }

    @Override
    public int amountOfPositiveElements(CustomArrayImpl array) {
        int amount = 0;
        for (int i = 0; i < array.getArray().length; i++) {
            if (array.getArray()[i] > 0) {
                amount++;
            }
        }
        return amount;
    }

    @Override
    public int amountOfNegativeElements(CustomArrayImpl array) {
        int amount = 0;
        for (int i = 0; i < array.getArray().length; i++) {
            if (array.getArray()[i] < 0) {
                amount++;
            }
        }
        return amount;
    }
}
