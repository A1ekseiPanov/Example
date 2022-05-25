public class T13 {
    //удаление заданного символа


    public static void main(String[] args) {
        System.out.println(remCh("мфмф мыла раму",'м'));
    }
    public static String remCh(String srt, char ch) {
        StringBuilder sb = new StringBuilder();
        char []c= srt.toCharArray();
        for (char cc:c) {
            if(cc!=ch){
                sb.append(cc);
            }

        }
        return sb.toString();
    }
}
