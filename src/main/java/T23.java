import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T23 {
    private  static  String m = "мама\n"+"мыла\n"+"да\n"+"недомыла\n";
    private static List<String> list= Arrays.asList("мама", "мыла","раму");

    public static void main(String[] args) {
        System.out.println(m.indent(15));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).indent(i+1));

        }
    }
}
