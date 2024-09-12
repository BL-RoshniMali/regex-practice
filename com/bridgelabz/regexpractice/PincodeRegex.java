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
    * */
    private static final String PINCODE_PATTERN = "^[1-9][0-9]{5}$";
    public static boolean validatePinCode(String pincode){
        Pattern pattern = Pattern.compile(PINCODE_PATTERN);
        Matcher matcher = pattern.matcher(pincode);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String pincodeToValidate = "400088B"; // this input should fail

        if(validatePinCode(pincodeToValidate)){
            System.out.println(pincodeToValidate+ " is valid pincode.");
        }
        else{
            System.out.println("Invalid Pincode");
        }
    }
}
