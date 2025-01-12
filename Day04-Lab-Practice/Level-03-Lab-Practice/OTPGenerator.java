import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Class to generate and validate unique 6-digit OTP numbers

public class OTPGenerator 
{

    // Method to generate a 6-digit OTP number
    public static int generateOTP() 
	{
        // Generate a random 6-digit number (between 100000 and 999999)
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to check if all OTP numbers are unique
    public static boolean areOTPsUnique(int[] otps) 
	{
        Set<Integer> otpSet = new HashSet<>();
        // Add each OTP to the set. If the OTP already exists, it's a duplicate
        for (int otp : otps) {
            if (!otpSet.add(otp)) {
                // Found a duplicate OTP
				return false; 
            }
        }
        // All OTPs are unique
		return true; 
    }

    public static void main(String[] args) 
	{
        // Array to store 10 OTPs
		int[] otps = new int[10]; 

        // Generate 10 OTPs and store them in the array
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }
		
		// Print the generated OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        // Check if the OTPs are unique
        if (areOTPsUnique(otps)) {
            System.out.println("All Generated OTPs are unique.");
        } else {
            System.out.println("There are duplicate Generated OTPs.");
        }

    }
}
