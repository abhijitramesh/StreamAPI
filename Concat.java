import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Concat {

    public static void main(String args[]){

        List<String> newlist = new ArrayList<String>();

        newlist.add("Hello this is the first string");
        newlist.add("This is the second string");
        
        Stream <String> stream = newlist.stream();


        List<String> list2 = new ArrayList<String>();

        list2.add("String 3");
        list2.add("String 4");


        Stream <String> stream2 = list2.stream();
        
        Stream <String> concatString = Stream.concat(stream,stream2);

        List<String> finalList = concatString.collect(Collectors.toList());

        System.out.println(finalList);
    }
}