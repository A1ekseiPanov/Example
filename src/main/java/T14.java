import com.sun.jdi.connect.spi.Connection;

import java.util.*;

public class T14 {
    public static void main(String[] args) {
        System.out.println(maxCountWord("м м а а м м а а м ы мы ла"));
    }

    public static Map<Character, Integer> maxCountWord(String srt) {
        Map<Character, Integer> counter = new TreeMap<>();
        Map<Character, Integer> counter1 = new TreeMap<>();


        for (int i = 0; i < srt.length(); i++) {
            char ch = srt.charAt(i);
            int num = 0;
            for (int j = 0; j < srt.length(); j++) {
                char ch1 = srt.charAt(j);
                if (ch == ch1) {
                    num++;
                }

                if (!Character.isWhitespace(ch))
                    counter.put(ch, num);

            }


        }


        return counter;


    }


}

