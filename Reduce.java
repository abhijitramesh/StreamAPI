import java.util.List;
import java.util.OptionalInt;

import java.util.stream.*;
import java.lang.String;

public class Reduce {

    public static void main(String args[]) {

        OptionalInt sum = IntStream.range(1, 10).reduce((val1, val2) -> val1 + val2);


        System.out.println(sum);






    }




}