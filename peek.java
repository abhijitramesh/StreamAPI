import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;



public class peek{

    public static void main(String args[]){

    List<String> newlist = new ArrayList<String>();


        newlist.add("Stream");
        newlist.add("Is");
        newlist.add("Fun");

    Stream<String> stream = newlist.stream();
        stream.peek((values) -> System.out.println(values));
    }
}