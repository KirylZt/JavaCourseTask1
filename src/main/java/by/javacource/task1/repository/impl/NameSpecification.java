package by.javacource.task1.repository.impl;

import by.javacource.task1.entity.CustomArrayImpl;
import by.javacource.task1.repository.Specification;

public class NameSpecification implements Specification {
    private String subName;

    public NameSpecification(String subName) {
        this.subName = subName;
    }

    @Override
    public boolean specify(CustomArrayImpl customArray) {
        boolean result = customArray.getName().contains(subName);
        return result;
    }
}
