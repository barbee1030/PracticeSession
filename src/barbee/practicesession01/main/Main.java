package barbee.practicesession01.main;

/**
 * Created by bboros on 2014.10.29..
 */
public class Main {
    public static void main(String[] args){
        int price=15943;
        int cash=16000;

        if(cash==price)
            System.out.println("Have a nice day!");
        else if (cash>price)

            System.out.println("Here is your change: "+(cash-price));
        else
            System.out.println("It's not enough!");
    }
}
