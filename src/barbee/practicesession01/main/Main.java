package barbee.practicesession01.main;

/**
 * Created by bboros on 2014.10.29..
 */
public class Main {
    public static void main(String[] args){
        double price=15943;
        double cash=16000;

        if (cash==price)
            System.out.println("Have a nice day!");
        else if (cash<price) System.out.println("It's not enough!");
        else               //is there any better/faster/easier way to solve the „hungarian cash rounding”?
            if (price/10 < Math.floor(price/10)+0.3) price=((int)Math.floor(price/10)*10);
            else if (price/10 > Math.floor(price/10)+0.7) price=((int)Math.ceil(price / 10) * 10);
            else price=((int)Math.floor(price/10)*10+5);
        System.out.println("Here is your change: "+((int)cash-(int)price));
    }
}
