package custom_methods;

public class exchangeRate {
	
	    // Method to calculate rate charges
	    public static double calculateRateCharges(double fcyToLcyAmount, double fcyToLcyRate, double chargeRate) {
	        // Converted amount
	        double convertedAmount = fcyToLcyAmount * fcyToLcyRate;

	        // Calculate charges on the converted amount
	        double charges = (convertedAmount * chargeRate) / 100;

	        return charges;
	    }

	    public static void main(String[] args) {
	        // Example 1: FCY to LCY
	        double fcyToLcyAmount = 500;
	        double fcyToLcyRate = 83.5;  // e.g., USD to INR
	        double chargeRate = 0.5;     // 0.5% charge

	        double fcyToLcyCharges = calculateRateCharges(fcyToLcyAmount, fcyToLcyRate, chargeRate);
	        System.out.println("FCY to LCY Charges: ₹" + fcyToLcyCharges);

	        // Example 2: FCY to FCY (USD to EUR)
	        double fcyToFcyAmount = 500;
	        double fcyToFcyRate = 0.92;  // e.g., USD to EUR
	        double fcyToFcyCharges = calculateRateCharges(fcyToFcyAmount, fcyToFcyRate, chargeRate);
	        System.out.println("FCY to FCY Charges: €" + fcyToFcyCharges);
	    }

}
