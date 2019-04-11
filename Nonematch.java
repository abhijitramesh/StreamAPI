import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.lang.String;
import java.util.Scanner;


public class Nonematch{

    public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 5 sentence wihtout e");

    List<String> newlist = new ArrayList<String>();

    for(int i=0;i<5;i++){   
        String a;
        a=sc.nextLine().toLowerCase();
        newlist.add(a);
    }

    Stream<String> stream = newlist.stream();
   
    
    boolean Nonematch =    stream.noneMatch((value) -> {return value.contains("e");});
    
    if(Nonematch){
        System.out.println("Great Job that sentance does not contain e");
    }
    else{
        System.out.println("Opps cant fool the system, that sentace contain e");
    }        
}
}