package org.example;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyIterator implements Iterable<String> {
    private final String[] items;

    public MyIterator(String[] items) {
        this.items = items;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<>() {
            private int index = -1;

            @Override
            public boolean hasNext() {
                return index < items.length - 1;
            }

            @Override
            public String next() {
                index++;
                if (index >= 0 && index < items.length) {
                    return items[index];
                } else {
                    throw new NoSuchElementException();
                }
            }
        };
    }
}
