import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.*;
import java.nio.file.*;
import java.io.IOException;


public class StreamEg {
    public static void main (String args[]) throws IOException {
        // Integer Stream
        IntStream
                .range(1, 10)
                .forEach(System.out::print);
        System.out.println();

        System.out.println("--------------------------------------");
        // Integer Stream with skip
        IntStream
                .range(1, 10)
                .skip(5)
                .forEach(x -> System.out.println(x));
        System.out.println();

        System.out.println("--------------------------------------");

        // Integer Stream with sum
        System.out.println(
                IntStream
                        .range(1, 5)
                        .sum());
        System.out.println();

        System.out.println("--------------------------------------");

         //Stream.of, sorted and findFirst
        Stream.of( "Anand", "Amrit" , "Akshar")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("--------------------------------------");

        // Stream from Array, sort, filter and print
        String[] names = {"Ram", "Lakshman", "Bharat", "Shatrugnha", "Sita", "Gita", "Hanuman", "Shiva", "Parvati"};
        Arrays.stream(names)	// same as Stream.of(names)
                .filter(x -> x.startsWith("S"))
                .sorted()
                .forEach(System.out::println);

        System.out.println("--------------------------------------");
        // average of squares of an int array
        Arrays.stream(new int[] {2, 4, 6, 8, 10})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);


        System.out.println("--------------------------------------");
//        // Stream from List, filter and print
//        List<String> people = Arrays.asList("Ram", "Lakshman", "Bharat", "Shatrugnha", "Sita", "Gita", "Hanuman", "Shiva", "Parvati");
//        people
//                .stream()
//                .map(String::toLowerCase)
//                .filter(x -> x.startsWith("s"))
//                .forEach(System.out::println);
//
//        System.out.println("--------------------------------------");
//
        // Reduction - sum
        double total = Stream.of(7.3, 1.5, 4.8)
                .reduce(0.0, (Double a, Double b) -> a + b);
        System.out.println("Total = " + total);
//
        System.out.println("--------------------------------------");
//
//
//        // 14. Reduction - summary statistics -- only works for integers
        IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10)
                .summaryStatistics();
        System.out.println(summary);
    }
}
