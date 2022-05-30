package reduce;

import java.util.Arrays;
import java.util.List;

public class Reducer {

    static int sumInt(int[] ints) {
        return Arrays.stream(ints).reduce(0, Integer::sum);
    }

    public static String concatStrings(String[] strings) {
        return Arrays.stream(strings).reduce("", String::concat);
    }

    public static int sumUserAges(List<User> users) {
        return users.stream().reduce(0, (partialAgeResult, user) -> partialAgeResult + user.getAge(), Integer::sum);
    }
}
