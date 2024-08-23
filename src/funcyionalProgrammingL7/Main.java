package funcyionalProgrammingL7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("AA", "BB", "CC");
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        list.sort((String s1, String s2) -> {
            return s1.compareTo(s2);
        });

        list.sort((s1, s2) -> {
            return s1.compareTo(s2);
        });

        list.sort((s1, s2) -> s1.compareTo(s2));

        list.sort(Comparator.naturalOrder());
    }
}