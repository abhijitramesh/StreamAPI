import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collect{

    public static void main(String argsp[]){

 


        List<String> newlist = new ArrayList<String>();
        
        newlist.add("These");
        newlist.add("Lines");
        newlist.add("are");
        newlist.add("Capitalised");

        Stream<String> stream = newlist.stream();

        List<String> capitasiedList = stream.map((value) -> value.toUpperCase()).collect(Collectors.toList());


        System.out.println(capitasiedList);
    }
}