package org.example.one;
/**
 * 1. polja ... capacity, numbers
 * 2. konsturktor
 * 3. add(broj)
 * 4. inner klase
 *
 * DynamicArray dynamicArray = new DynamicArray();
 * for (int number: dynamicArray) {
 *
 * }
 * Moramo:
 * 1. implements Iterable<Integer> -> natjera da implementiramo:
 * 2. Iterator iterator()
 *
 * ZADAĆA:
 * Implementirati remove()
 */

import java.util.Arrays;
import java.util.Iterator;

public class DynamicArray implements Iterable<Integer>{
    private int capacity = 0;
    private int[] numbers = new int[capacity];

    public void add(int number) {
        capacity++;
        numbers = Arrays.copyOf(numbers, capacity);
        numbers[capacity-1] = number;
    }

    @Override
    public Iterator<Integer> iterator() {
        Iterator<Integer> iterator = new IntegerIterator();
        return iterator;
    }
    private class IntegerIterator implements Iterator<Integer> {

        private int nextIndex = 0;
        @Override
        public boolean hasNext() {
            return (nextIndex<=capacity-1);
        }

        @Override
        public Integer next() {
            int number = numbers[nextIndex];
            nextIndex++;
            return number;
        }
    }
}
