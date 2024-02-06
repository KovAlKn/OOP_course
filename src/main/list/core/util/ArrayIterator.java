package main.list.core.util;

import java.util.Iterator;

public class ArrayIterator <E> implements Iterator<E> {
    private E[] values;
    private int index;
    public ArrayIterator(E[] values){
        this.values = values;
        this.index = 0;

    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public E next() {
        return null;
    }
}
