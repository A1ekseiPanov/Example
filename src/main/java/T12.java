import java.util.HashSet;
import java.util.Set;
//Удаление повторяющихся символов
public class T12 {
    public static void main(String[] args) {
        System.out.println(delDuplicate("мама мыла раму"));
        System.out.println(delDubl("мама мыла раму"));
    }
    public static String delDuplicate(String str){
        char []ch =str.toCharArray();
        StringBuilder sb =new StringBuilder();
        Set<Character> setCh=new HashSet<>();
        for (char c: ch) {
            if(setCh.add(c)){
                sb.append(c);
            }

        }
        return sb.toString();
    }
    public static String delDubl(String srt){
        char[] ch=srt.toCharArray();
        StringBuilder sb=new StringBuilder();

        for(char c:ch) {

            if (sb.indexOf(String.valueOf(c)) == -1) {
                sb.append(c);

            }
        }
        return sb.toString();
    }

}
