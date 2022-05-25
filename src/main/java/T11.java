public class T11 {
    public static void main(String[] args) {
       String str= "madam";
       String str1 ="madame";
        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome2(str));
        System.out.println(isPalindrome2(str1));
        System.out.println(isPalindrome3(str));
        System.out.println(isPalindrome3(str1));

    }

    public static String isPalindrome(String str){
        int left=0;
        int rigt=str.length()-1;
        while (rigt>left){
            if(str.charAt(left)!=str.charAt(rigt)){
                return "не палиндром";
            }
            left++;
            rigt--;
        }
        return "Палиндром";
    }
    public static String isPalindrome2(String str){
        if(str.equals(new StringBuilder(str).reverse().toString())) {
            return "палиндром";
        }else {
            return "не палиндром";
        }

    }
    public static String isPalindrome3(String str){
        int p =str.length();
        for (int i = 0; i < p/2; i++) {
            if(str.charAt(i)!=str.charAt(p-i-1)){
                return "не палиндром";
            }

        }
        return "палиндром";
       }


}
