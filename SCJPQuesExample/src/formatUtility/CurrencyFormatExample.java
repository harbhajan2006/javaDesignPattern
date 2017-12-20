package formatUtility;
import java.text.NumberFormat;
import java.util.Locale;
public class CurrencyFormatExample {

//http://www.avajava.com/tutorials/lessons/how-do-i-use-numberformat-to-format-currencies.html






	public static void main(String[] args) throws Exception {

		double num = 1323.526;

		NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
		System.out.println("US: " + defaultFormat.format(num));

		Locale swedish = new Locale("sv", "SE");
		NumberFormat swedishFormat = NumberFormat.getCurrencyInstance(swedish);
		System.out.println("Swedish: " + swedishFormat.format(num));
		
		Locale china = new Locale(Locale.CHINESE.toString(), Locale.CHINA.toString());
		NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(china);
		System.out.println("china: " + chinaFormat.format(num));

	}

}