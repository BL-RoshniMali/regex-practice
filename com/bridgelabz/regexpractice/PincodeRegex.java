package com.bridgelabz.regexpractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PincodeRegex {

    /*
    * PIN Code UC1: The Postal Index Number (PIN) or PIN Code is a 6 digit code
        of Post Office numbering used by India Post.
        Create a regex pattern to validate Pin Code 400088
        *
    * PIN Code UC2: Restrict the PIN code from taking alphabets or special characters at the
    beginning.
    Check for A400088 – this should fail
    *
    * PIN Code UC3: Restrict the PIN code from taking alphabets or special characters at the End.
    Check for 400088B – this should fail
    *
    * PIN Code UC4: Make sure 400 088 is also valid along with 400088
    * */


    // Updated regex pattern to allow space between 3rd and 4th digits
    // ? : means zero or one occurrence of a space
    private static final String PINCODE_PATTERN = "^[1-9][0-9]{2} ?[0-9]{3}$";
    public static boolean validatePinCode(String pincode){
        Pattern pattern = Pattern.compile(PINCODE_PATTERN);
        Matcher matcher = pattern.matcher(pincode);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String pinCodeToValidate1 = "400088";    // Example that should pass
        String pinCodeToValidate2 = "400 088";   // Example with space that should also pass

        // Validate the first PIN Code
        if (validatePinCode(pinCodeToValidate1)) {
            System.out.println(pinCodeToValidate1 + " is a valid PIN Code.");
        } else {
            System.out.println(pinCodeToValidate1 + " is not a valid PIN Code.");
        }

        // Validate the second PIN Code with space
        if (validatePinCode(pinCodeToValidate2)) {
            System.out.println(pinCodeToValidate2 + " is a valid PIN Code.");
        } else {
            System.out.println(pinCodeToValidate2 + " is not a valid PIN Code.");
        }
    }
}
