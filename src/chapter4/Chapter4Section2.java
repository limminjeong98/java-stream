package chapter4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Chapter4Section2 {
    public static void main(String[] args) {
        // consumer
        Consumer<String> myStringConsumer = (String str) -> System.out.println(str);
        myStringConsumer.accept("hello");
        myStringConsumer.accept("world");

        // asList로 생성한 List는 나중에 add로 변경할 수 없다.
        List<Integer> integerInputs = Arrays.asList(4, 2, 3);
        Consumer<Integer> myIntegerProcessor = x -> System.out.println("Processing integer " + x);
        process(integerInputs, myIntegerProcessor);
        Consumer<Integer> myDifferentIntegerProcessor = x -> System.out.println("Processing integer in different way " + x);
        process(integerInputs, myDifferentIntegerProcessor);

        Consumer<Double> myDoubleProcessor = x -> System.out.println("Processing double " + x);
        List<Double> doubleInputs = Arrays.asList(1.1, 2.2, 3.3);
        process(doubleInputs, myDoubleProcessor);
    }

    public static <T> void process(List<T> inputs, Consumer<T> processor) {
        for (T input : inputs) {
            // Consumer는 accept
            processor.accept(input);
        }
    }

}
