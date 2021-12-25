package module3;

import java.util.Iterator;

public class CustomList<T> implements Iterable<T> {

    private static final int DEFAULT_CAPACITY = 16;

    private T[] data;
    private int size;
    private int capacity;
    private int pos;

    @SuppressWarnings("unchecked")
    public CustomList() {
        size = 0;
        capacity = DEFAULT_CAPACITY;
        data = (T[]) new Object[capacity];
    }

    public void add(T item) {

        if (size > capacity) {
            reallocate();
        }

        data[size] = item;
        size++;
    }

    public void removeLast() {
        if (size > 0) {
            size--;
        } else {
            throw new ArrayIndexOutOfBoundsException(
                    "Could not remove from empty list"
            );
        }
    }

    private void reallocate() {
        capacity *= 2;
        T[] tmp = (T[]) new Object[capacity];
        if (size >= 0) {
            System.arraycopy(data, 0, tmp, 0, size);
        }
        data = tmp;
    }

    @Override
    public Iterator<T> iterator() {

        pos = 0;

        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return pos < size;
            }

            @Override
            public T next() {
                T item = data[pos];
                pos++;
                return item;
            }
        };
    }
}
