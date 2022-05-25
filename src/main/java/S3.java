public class S3 {
    public static int count(int number){
        int sum=0;
        int[] sumArray = new int[50];

        String convert=Integer.toString(number);
        for (int i = 0; i < convert.length(); i++) {
            int c= Character.getNumericValue(convert.charAt(i));

            sum+=c;


        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(count(222));
    }
}
