import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;




public class Terminaloperation {

    public static void main(String Args[]){

        List<String> newlist = new ArrayList<String>();
        
        newlist.add("Hello");
        newlist.add("World");
        newlist.add("These");
        newlist.add("are");
        newlist.add("Streams");



        Stream<String> newStream = newlist.stream();

        int count = (int) newStream.map((values) -> values.toUpperCase())
                                .count();


       
        System.out.println("count ="+count);






    }






}