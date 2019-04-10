import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Chaining{

public static void main(String args[]){

    List<String> newlist = new ArrayList<String>();

    newlist.add("A");
    newlist.add("B");
    newlist.add("C");



    Stream<String> newStreamlist = newlist.stream();

    newStreamlist.map((values) -> {return values.toLowerCase();})
                                    .forEach(e -> {System.out.println(e);});

   Stream<String> newStreamlist1 = newlist.stream(); 
   
   newStreamlist.map((values) -> {return values.toUpperCase();})
                                    .forEach(e -> {System.out.println(e);});
   




                            

}
}
