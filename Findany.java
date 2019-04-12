import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.Optional;

public class Findany{

    public static void main(String args[]){


        List<String> stringList = new ArrayList<String>();
        stringList.add("one");
        stringList.add("Two");


        Stream<String> stream = stringList.stream();

    Optional<String> anyElement = stream.findAny();

System.out.println(anyElement.get());






    }





}