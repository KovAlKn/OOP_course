package main.list.core;

public interface GBList<E> extends Iterable<E> {
    void add(E elem);
    void remove(int index);
    E get(int index);
    int size();
}
