import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class Nonoperation{

        public static void main(String[] args){

            List<String> demolist = new ArrayList<String>();
             
            demolist.add("One");
            demolist.add("Two");
            demolist.add("Three");


            Stream<String> streamlist = demolist.stream();


            streamlist.map((value) -> {return value.toLowerCase();})
                        .forEach(e -> {System.out.println(e);});
            
            Stream<String> streamlist1 = demolist.stream();

            streamlist1.map((value)-> {return value.toUpperCase();} )
                        .forEach(e -> {System.out.println(e);});

            

        }



}