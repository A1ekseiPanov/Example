import java.util.Arrays;

public class T99 {
    static int[]ints=new int[]{1,15,16,178484,8464,5416546,41,122,35};
    static int[]ints1;
    public static  void getInts1(int[]ints1){
        Arrays.sort(ints1);
        for (int i = 0; i < ints1.length; i++) {
            System.out.print(ints1[i]+ " ");

        }
    }



    public static void main(String[] args) {
getInts1(ints);
    }
}
