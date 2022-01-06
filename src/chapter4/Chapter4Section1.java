package chapter4;

import java.util.function.Supplier;

public class Chapter4Section1 {
    public static void main(String[] args) {
        // Supplier
        Supplier<String> myStringSupplier = () -> "hello world!";
        System.out.println(myStringSupplier.get());

        Supplier<Double> myRandomDoubleSupplier = () -> Math.random();
        printRandomDoubles(myRandomDoubleSupplier, 5);
    }

    public static void printRandomDoubles(Supplier<Double> randomSupplier, int count) {
        for (int i = 0; i < count; i++) {
            // Supplier는 get
            System.out.println(randomSupplier.get());
        }
    }
}
