import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args)  {
        Credit credit = new Credit();
//        int years = credit.countYears(100000, 0.1, 200000);
//        System.out.println(years);
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println(credit.reverse(list));
    }
}
