import java.lang.*;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by benaissa on 8/23/17. FormatNumbers project
 */
public class Main {
    public static void main(String [] args) {
        Locale locale =new Locale("da","DK");

        double doubleValue = 1_234_567.89;
        NumberFormat numF = NumberFormat.getNumberInstance(locale);
        System.out.println("Number: "+numF.format(doubleValue));

        NumberFormat curF = NumberFormat.getCurrencyInstance(locale);
        System.out.println("Currency: "+curF.format(doubleValue));

        NumberFormat intF = NumberFormat.getIntegerInstance(locale);
        System.out.println("Integer: "+intF.format(doubleValue));


    }
}
