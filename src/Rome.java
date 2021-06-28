import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Rome {
    static String[] lil_roman = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    static Map<Integer, String> big_roman = new HashMap<Integer, String>() {{
        put(1, "X");
        put(2, "XX");
        put(3, "XXX");
        put(4, "XL");
        put(5, "L");
        put(6, "LX");
        put(7, "LXX");
        put(8, "LXXX");
        put(9, "XC");
    }};

    public static Integer getInt(String str) {
        return Arrays.asList(lil_roman).indexOf(str);
    }

    public static String getRome(Integer num) {
        if (num <= 10) {
            return lil_roman[num];
        } else if (num == 100) {
            return "C";
        } else {
            return big_roman.get(num / 10) + lil_roman[num % 10];
        }
    }
}
