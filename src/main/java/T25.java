public class T25 {
    public static void main(String[] args) {

        System.out.println("минимум из двух чиел"+min(10,20));
        System.out.println("мфксимум из двух чиел"+max(10,20));
    }
//    private static int a;
//    private static int b;
    public static int min(int a,int b){
        return Math.min(a, b);
    }
    public static int max(int a,int b){
        return Math.max(a, b);
    }
}
