public class T2 {
    public static void main(String[] args) {
        String str = "Мама папа кокос ".toLowerCase();
        System.out.println(new StringBuilder(str).reverse().toString());

        for (int i = str.length()-1; i >= 0; i--) {
            char c =str.charAt(i);
            System.out.print(c);
        }
        System.out.println();

        for (int i = str.length()-1; i >=0 ; i--) {
            char[] c = str.toCharArray();
            System.out.print(c[i]);


        }


    }
}
