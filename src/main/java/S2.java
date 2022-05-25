public class S2
{
    public static void main(String[] args) {
    int aAge=20;
    int bAge=12;
    int cAge=30;

    int min=1000;
    int middle=0;
    int max=0;

    if(min>aAge){
        min=aAge;
    }
        if(min>bAge){
            min=bAge;
        }
        if(min>cAge){
            min=cAge;
        }
        if(max<aAge){
            max=aAge;
        }
        if(max<bAge){
            max=bAge;
        }
        if(max<cAge){
            max=cAge;
        }
        if(aAge>min&&aAge<max){
            middle=aAge;
        }
        if(bAge>min&&bAge<max){
            middle=bAge;
        }
        if(cAge>min&&cAge<max){
            middle=cAge;
        }
        System.out.println("Минимальный возрост: " + min + "\n" + "Средний возраст: " + middle + "\n" + "Максимальный возраст:" + max);
    }
}
