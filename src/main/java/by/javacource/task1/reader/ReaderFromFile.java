package by.javacource.task1.reader;

import by.javacource.task1.exception.CustomException;

import java.util.List;

public interface ReaderFromFile {
    List<String> readFile(String pathToFile) throws CustomException;
}
