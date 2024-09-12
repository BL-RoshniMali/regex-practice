package com.bridgelabz.regexpractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegex {
    /*
    Validate Email address with a regex. The email consists of minimum 3 and optional 2 more parts with mandatory @ and .
    abc.xyz@bridgelabz.co.in or abc@bridgelabz.co
    Here abc, bridgelabz and co are mandatory and the remaining 2 are optional.

    Email UC1:
    Validate the mandatory part and start with abc.
    * */

    // Regex pattern to validate the 'abc' part
    // *: Allows any characters to follow after the mandatory abc part.
    private static final String EMAIL_PATTERN = "^[a-z]{3}.*$";

    // Method to validate the email
    public static boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String emailToValidate = "abc.xyz@bridgelabz.co.in";
        // Validate the email
        if (validateEmail(emailToValidate)) {
            System.out.println(emailToValidate + " has a valid start (abc).");
        } else {
            System.out.println(emailToValidate + " does not have a valid start (abc).");
        }
    }
}
