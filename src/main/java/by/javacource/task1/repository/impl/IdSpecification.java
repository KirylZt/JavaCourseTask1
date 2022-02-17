package by.javacource.task1.repository.impl;

import by.javacource.task1.entity.CustomArrayImpl;
import by.javacource.task1.repository.Specification;

public class IdSpecification implements Specification {
    private long id;

    public IdSpecification(long id) {
        this.id = id;
    }

    @Override
    public boolean specify(CustomArrayImpl customArray) {
        boolean result = customArray.getId() == id;
        return result;
    }
}
