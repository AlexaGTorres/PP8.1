import java.util.ArrayList;
import java.util.List;

public class TwelveDaysOfChristmas
{
    public static void main(String args[]) {

        List<String> days = new ArrayList<>();

        days.add("a partridge in a pear tree, ");
        days.add("2 turtle doves, ");
        days.add("3 french hens, ");
        days.add("4 calling birds, ");
        days.add("5 golden rings, ");
        days.add("6 geese a laying, ");
        days.add("7 swans a swimming, ");
        days.add("8 maids a milking, ");
        days.add("9 ladies dancing, ");
        days.add("10 lords a leaping, ");
        days.add("11 pipers piping, ");
        days.add("12 drummers drumming,");

        doStuff(days, 0);

    }

    public static void doStuff(List<String> days, int i) {

        if(i == 12)
            return;

        sing("On the " + (i +1) + " day of christmas my true love gave to me ");

        for(int x = 0; x < i +1 ; x++)
            sing(days.get(x));

        sing("\n");
        doStuff(days, i+1);
    }

    public static void sing(Object o) {
        System.out.print(o.toString());
    }
}//End class
