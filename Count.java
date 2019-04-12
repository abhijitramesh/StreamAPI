import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class Count{

    public static void main(String args[]){

   
        List<Integer> intlist = new ArrayList<Integer>();
        for(int i=1;i<=10;i++){
        intlist.add(i);
        }
        Stream<Integer> stream = intlist.stream(); 

    long Count =  stream.filter((value) ->  {return (value%2==0) ;}).count();


System.out.println(Count);

    }
}