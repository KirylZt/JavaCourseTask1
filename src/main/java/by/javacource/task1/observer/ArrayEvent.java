package by.javacource.task1.observer;

import by.javacource.task1.entity.CustomArrayImpl;

import java.util.EventObject;

public class ArrayEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public ArrayEvent(CustomArrayImpl source) {
        super(source);
    }

    @Override
    public CustomArrayImpl getSource() {
        return (CustomArrayImpl) super.getSource();
    }
}
