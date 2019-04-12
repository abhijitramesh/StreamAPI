import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class Map{

    public static void main(String args[]){

        List<String> newlist = new ArrayList<String>();


        newlist.add("One");
        newlist.add("Two");
        newlist.add("Three");
        newlist.add("Four");
        newlist.add("Five");


        Stream<String> stream = newlist.stream();

        Stream<String> stream1= stream.map((values)-> {return values.toUpperCase();
        });

        stream1.forEach(e -> System.out.println(e));
    }
}