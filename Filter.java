import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class Filter{

    public static void main(String args[]){

        List<String> newlist = new ArrayList<String>();


        newlist.add("One");
        newlist.add("Two");
        newlist.add("Three");
        newlist.add("Four");

        Stream<String> stream = newlist.stream();

        Stream<String> longStringsStream = stream.filter((value) -> {
            return value.length() >= 4;
        });

        longStringsStream.forEach(e -> System.out.println(e));







    }





}