package barbee.practicesession01.main;

/**
 * Created by bboros on 2014.10.29..
 */
public class Main {
    public static void main(String[] args){
        int num=1;

        for (int i=0;i<100;i++){
            if(num%2==0)
                System.out.println(num*2);
            else
                System.out.println(num*3);
            num++;
        }
    }
}
