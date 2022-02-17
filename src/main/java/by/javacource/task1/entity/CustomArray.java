package by.javacource.task1.entity;

import by.javacource.task1.exception.CustomException;

public abstract class CustomArray {
    long id;
    String name;
    int[] array;

    public abstract int[] getArray();

    public abstract void setArray(int[] array) throws CustomException;
}
