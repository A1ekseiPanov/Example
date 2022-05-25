public class T8 {
    public static void main(String[] args) {
        System.out.println(del("Этот парень долбей"));
        delSplit("Этот парень долбей");
    }
    public static String del(String str){
        return str.replaceAll("\\s","");
    }
    public static void delSplit(String str){
        String [] s = str.split(" ");
        for (int i = 0; i <s.length ; i++) {
            System.out.print(s[i]);

        }
    }
}
