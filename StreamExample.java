import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String args[]) {
        /// create stream from integer
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> stream = list.stream();

        /// create stream from string array
        String[] arrays = {"one", "two", "three", "four", "five"};
        Stream<String> stringStream = Arrays.stream(arrays);

        /// create stream directly
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<String> nameStream = Stream.of("Tirthbhai", "Kaushal bhai", "Vyom", "Tilak bhai");

        Stream<Integer> intStream = Stream.iterate(0, n -> n + 1).limit(10);

        Stream<Integer> limit = Stream.generate(() -> (int) (Math.random() * 100) + 1) .limit(10);
//        System.out.println(limit.toList());


        /// Operations
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

       //Filter
       List<Integer> resultList = numberList.stream()
               .peek(System.out :: println) // allows you to see the current operated value
               .filter(x -> x % 2 == 0)
               .collect(Collectors.toList());  // filter
       System.out.println(resultList);

        Map
       List<Integer> mappedList = numberList.stream()
               .map(x -> x * 5)
               .collect(Collectors.toList());
       System.out.println(mappedList);

       // both filter and map together
       List<Integer> filteredMappedList = numberList.stream()
               .filter(x -> x % 2 == 0)
               .peek(System.out :: print)
               .map(x -> x * 5)
               .collect(Collectors.toList());
       System.out.println(filteredMappedList);
//
//        // more operations
           numberList = Arrays.asList(100, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
          List<Integer> operatedList = numberList.stream()
                .filter(x -> x % 2 == 0)
                  .peek(System.out :: print)
                  .map(x -> x * 5)
                .distinct()
                .sorted()
                .limit(5)
                .skip(2)
                .collect(Collectors.toList()); // min, max, count
//
        System.out.println(operatedList);

    }
}
