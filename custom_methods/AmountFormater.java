package custom_methods;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
public class AmountFormater {
	
	    // Custom method to format amount as ₹1,00,000.00
	    public static String formatAmountIndian(double amount) {
	        // Pattern for Indian number system (lakhs, crores)
	        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ENGLISH);
	        DecimalFormat formatter = new DecimalFormat("##,##,###.00", symbols);
	        return formatter.format(amount);
	    }

	    public static void main(String[] args) {
	        double[] amounts = {100000};

	        for (double amt : amounts) {
	            System.out.println(formatAmountIndian(amt));
	        }
	    }
	}
