import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.lang.String;

public class Anymatch{


    public static void main(String args[]){
        List<String> newlist = new ArrayList<String>();

        newlist.add("I write blogs");
        newlist.add("Do you write blogs");
        newlist.add("Then visit");
        newlist.add("https://alpha.tech.blog/");

        Stream<String> stream = newlist.stream();


        boolean anymatch = stream.anyMatch((value) -> value.startsWith("D"));

        if(anymatch){
            System.out.println(newlist.get(3));
        }
    }
}