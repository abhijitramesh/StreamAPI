import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;



public class chaining2{

public static void main(String args[]){

List<String> newlist = new ArrayList<String>();

newlist.add("One");
newlist.add("Two");
newlist.add("Three");


Stream<String> newstreamlist = newlist.stream();

Stream<String> stream1 = newstreamlist
                          .map((value) -> {return value.toLowerCase();})
                          .map((value) -> {return value.toUpperCase();})
                          .map((value) -> {return value.substring(0,3);});
                          
}





}