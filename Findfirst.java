import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;


public class Findfirst{

        public static void main(String args[]){

            List<String> newlist = new ArrayList<String>();
/** 
            newlist.add("Hello");
            newlist.add("World");
            newlist.add("This");
            newlist.add("is");
            newlist.add("Stream");
*/
//Try removing these comments and run again
            Stream<String> newstream = newlist.stream();

            Optional<String> optional = newstream.findFirst();


            System.out.println(optional.isPresent());





        }






}