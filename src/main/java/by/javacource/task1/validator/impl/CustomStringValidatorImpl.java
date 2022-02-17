package by.javacource.task1.validator.impl;

import by.javacource.task1.validator.CustomStringValidator;

import java.util.regex.Pattern;

public class CustomStringValidatorImpl implements CustomStringValidator {
        private static final String REGEX = "[-]?\\d(\\s?([-]?\\d))+";

        @Override
        public boolean validateString(String line) {
            return Pattern.matches(REGEX, line);
        }

}
