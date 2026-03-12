import java.util.ArrayList;
import java.util.List;

public class Credit {
    public int countYears(double sum, double stavka, double resultSum) {
        int time = 0;
        while (sum <= resultSum) {
            sum = sum * stavka + sum;
            time++;
        }
        return time;
    }

    public List<Integer> reverse(List<Integer> list) {
        int minIndex = list.indexOf(list.stream().min(Integer::compareTo).orElse(null));
        int maxIndex = list.indexOf(list.stream().max(Integer::compareTo).orElse(null));
        int minValue = list.get(minIndex);
        int maxValue = list.get(maxIndex);
        list.set(minIndex, maxValue);
        list.set(maxIndex, minValue);
        return list;
    }
}
