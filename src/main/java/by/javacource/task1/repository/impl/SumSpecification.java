package by.javacource.task1.repository.impl;

import by.javacource.task1.entity.CustomArrayImpl;
import by.javacource.task1.repository.Specification;
import by.javacource.task1.service.impl.WorkWithArrayImpl;

public class SumSpecification implements Specification {
    private int sum;

    public SumSpecification(int sum) {
        this.sum = sum;
    }

    @Override
    public boolean specify(CustomArrayImpl customArray) {
        WorkWithArrayImpl workWithArray = new WorkWithArrayImpl();
        boolean result = workWithArray.sumOfElements(customArray) > sum;
        return result;
    }
}
