package org.jun.algorithms.array;

import java.util.Arrays;

public class AutoInArray {
    private final int DEFAULT_CAPACITY = 10;
    private final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
    private Object[] elementData;
    private int size = 0;

    public AutoInArray(){
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }

    public boolean add(Object e){
        ensureCapacityInternal(size + 1);
        elementData[size++] = e;
        return true;
    }

    public int length(){
        return elementData.length;
    }

    private void ensureCapacityInternal(int minCapacity) {
        int capacity = calculateCapacity(elementData, minCapacity);
        ensureExplicitCapacity(capacity);
    }

    private int calculateCapacity(Object[] elementData, int minCapacity){
        if(elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA){
            return Math.max(DEFAULT_CAPACITY, minCapacity);
        }
        return minCapacity;
    }

    private void ensureExplicitCapacity(int minCapacity) {
        if (minCapacity - elementData.length > 0)
            grow(minCapacity);
    }

    private void grow(int minCapacity){
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        elementData = Arrays.copyOf(elementData, newCapacity);
    }
}
