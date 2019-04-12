import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Distinct{

    public static void main(String args[]){

        List<String> newList = new ArrayList<String>();
        
        newList.add("One");
        newList.add("Two");
        newList.add("Three");
        newList.add("One");


        Stream<String> stream =  newList.stream();

        stream.distinct().forEach(e -> System.out.println(e));
        
    }


}