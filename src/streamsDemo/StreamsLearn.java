package streamsDemo;
import java.util.*;
import java.util.stream.Collectors;
public class StreamsLearn {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());//collect non empty srings
        System.out.println(filtered);
        //ForEach
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);// iterate over each element and process elements
        //Map it maps each elements to its corresponding result
        List<Integer> number = Arrays.asList(3,2,4,5,8,9);
        List<Integer> squareNumber= number.stream().map(i-> i*i).collect(Collectors.toList());
        System.out.println(squareNumber);
        //sorted
        number.stream().sorted().forEach(System.out::println);
        //Parallel Streams used for parallel processing
        long count = strings.parallelStream().filter(string -> !string.isEmpty()).count();
        System.out.println(count);
        //Collectors are used to combine the result of processing on the elements of a stream
        //it may return list or string
        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(""));
        System.out.println("Merged String: " + mergedString);


    }
}
