import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Maxandmin {

    public static void main(String args[]){
        List<Integer> list = new ArrayList<Integer>();

        for(int i=0;i<10;i++){list.add(i);}

        Stream<Integer> stream = list.stream();
        Stream<Integer> stream1 = list.stream();
        

        Integer minnumber = stream.min(Comparator.comparing(Integer::valueOf)).get();
        Integer maxnumber = stream1.max(Comparator.comparing(Integer::valueOf)).get();

        System.out.println(minnumber);
        System.out.println(maxnumber);
    }
}