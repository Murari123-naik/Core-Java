package custom_methods;
import java.text.NumberFormat;
import java.util.Locale;

public class internationalAmountFormate {
	

	    // Method to format amount in international currency style
	    public static String formatAmountInternational(double amount, Locale locale) {
	        NumberFormat formatter = NumberFormat.getNumberInstance(locale);
	        formatter.setMinimumFractionDigits(2);
	        formatter.setMaximumFractionDigits(2);

	        return formatter.format(amount);
	    }

	    public static void main(String[] args) {
	        double[] amounts = {10000000};

	        for (double amt : amounts) {
	            String formatted = formatAmountInternational(amt, Locale.US);  // You can change to Locale.UK or others
	            System.out.println(formatted);
	        }
	    }

}
