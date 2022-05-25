import java.util.Locale;

public class T16 {
    public static void main(String[] args) {
        System.out.println(cont("МАМА МЫЛА РАМУ","п"));
        
    }

    public static boolean cont(String srt,String s){
        return srt.toLowerCase().contains(s.toLowerCase());
    }
}
