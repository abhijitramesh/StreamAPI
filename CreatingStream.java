import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream{

    public static void main(String[] args){
List <String> demo = new ArrayList<String>();

demo.add("HEllo");
demo.add("HI");
demo.add("Good morning");


Stream <String> demoStream = demo.stream();

long count = demoStream
                .map((value) -> {return value.toLowerCase();})
                .count();

                System.out.println("count = "+count);
    }

}