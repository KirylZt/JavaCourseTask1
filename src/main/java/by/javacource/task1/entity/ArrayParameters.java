package by.javacource.task1.entity;

public class ArrayParameters {
    private int maxElement;
    private int minElement;
    private int sumElements;
    private double averageValue;

    public ArrayParameters(int sumElements, int maxElement, int minElement, double averageValue) {

        this.sumElements = sumElements;
        this.maxElement = maxElement;
        this.minElement = minElement;
        this.averageValue = averageValue;
    }

    public int getMaxElement() {
        return maxElement;
    }

    public void setMaxElement(int maxElement) {
        this.maxElement = maxElement;
    }

    public int getMinElement() {
        return minElement;
    }

    public void setMinElement(int minElement) {
        this.minElement = minElement;
    }

    public int getSumElements() {
        return sumElements;
    }

    public void setSumElements(int sumElements) {
        this.sumElements = sumElements;
    }

    public double getAverageValue() {
        return averageValue;
    }

    public void setAverageValue(double averageValue) {
        this.averageValue = averageValue;
    }
}
