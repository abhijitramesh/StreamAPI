import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Foreach{
public static void main(String args[]){

    List<Integer> newlist = new ArrayList<Integer>();

    for(int i=0;i<10;i++)
    newlist.add(i);

    Stream<Integer> stream = newlist.stream();

    stream.forEach((value) -> System.out.println(value));
}
}