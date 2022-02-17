package by.javacource.task1.parser.impl;

import by.javacource.task1.parser.CustomParser;
import by.javacource.task1.validator.CustomStringValidator;
import by.javacource.task1.validator.impl.CustomStringValidatorImpl;

import java.util.ArrayList;
import java.util.List;

public class CustomParserImpl implements CustomParser {
    private static final String REGEX = "\s";

    @Override
    public int[] parserStrToInt(List<String> stringNumbers) {
        List<Integer> numberList = new ArrayList<>();
        CustomStringValidator stringValidator = new CustomStringValidatorImpl();
        for (int i = 0; i < stringNumbers.size(); i++) {
            if (stringValidator.validateString(stringNumbers.get(i))) {
                String[] stringArray = stringNumbers.get(i).split(REGEX);
                for (String number : stringArray) {
                    numberList.add(Integer.parseInt(number));
                }
            }
        }
        int[] intNumbers = new int[numberList.size()];

        for (int i = 0; i < intNumbers.length; i++) {
            intNumbers[i] = numberList.get(i);
        }
        return intNumbers;
    }
}
