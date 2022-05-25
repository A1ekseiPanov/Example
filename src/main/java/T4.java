public class T4 {
    public static void main(String[] args) {
        System.out.println(containsOnlyDigits("123"));
        System.out.println(cOD("1b"));
    }
    public static String containsOnlyDigits(String str){
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return "строка содержит не толко цифры";
            }
        }
        return "строка содержит толко цифры";
    }
    public static boolean cOD(String str){
        return str.matches("[0-9]+");
    }
}
