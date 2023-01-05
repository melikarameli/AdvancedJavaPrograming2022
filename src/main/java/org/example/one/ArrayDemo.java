package org.example.one;

public class ArrayDemo {
    public static void main(String[] args) {
        int numbers[] = new int[3];
        numbers[0] = 23;
        numbers[1] = 24;
        numbers[2] = 123;
        //Java Enhanced FOR Loop
        for (int number : numbers) {
            System.out.println(number);
        }
        //numbers[3] = 120;
        System.out.println("DINAMICKI NIZ");
        // dynamicArray -> tipa DynamicArray, Iterable<Integer>
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(23);
        dynamicArray.add(24);
        dynamicArray.add(123);
        dynamicArray.add(120);
        for (int number : dynamicArray){
            System.out.println(number);
        }
        DynamicArray dynamicArray1 = new DynamicArray();
        dynamicArray1.add(1000);
        dynamicArray1.add(2000);
        for (int number : dynamicArray1) {
            System.out.println(number);
        }
    }
}
