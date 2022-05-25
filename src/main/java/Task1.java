import java.util.*;

public class Task1 {
    public static void main(String[] args) {

        String str = "Мама папа кокос ".toLowerCase();
        Map<Character,Integer> setCh=new TreeMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            int num=0;
            for (int j = 0; j < str.length() ; j++) {
                char c1=str.charAt(j);
                if (c==c1) {
                    num++;

                }
                setCh.put(c,num);
            }






        }
        System.out.println(setCh);

        }
    }










