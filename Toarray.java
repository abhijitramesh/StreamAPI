
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.Scanner;
import java.lang.String;

public class Toarray {

    public static void main(String args[]){

        List<String> newlist = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter something");
        newlist.add(sc.nextLine());
        
        Stream<String> stream = newlist.stream();

        Object [] objects = stream.toArray();
        System.out.println(objects[0]);

    }
}