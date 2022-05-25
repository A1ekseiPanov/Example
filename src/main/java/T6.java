public class T6 {
    public static void main(String[] args) {
        System.out.println(counts("мама мыла раму",'р'));
    }
    public static int counts(String srt, char ch){
        int count=0;
        for (int i = 0; i < srt.length(); i++) {
            if(srt.charAt(i)==ch){
                count++;
            }
        }
        return count;
    }
}
