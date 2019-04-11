import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;


public class limit {

    public static void main(String args[]){

        List<String> newlist = new ArrayList<String>();

        newlist.add("Hello");
        newlist.add("World");
        newlist.add("This");
        newlist.add("Function");
        newlist.add("Would");   
        newlist.add("limit");
        newlist.add("The output");

        Stream<String> stream = newlist.stream();

        stream.limit(2).forEach(e -> System.out.println(e));   
    }
}