package com.hillel.Lesson6.HomeWork;

public class HomeWorkString {
    public static void main(String[] args) {
//          isEmpty
        String noString = null;
        String yesString =  " Hillel is my feature. I will be developer";

        boolean isEmptynoString = noString == null;
        boolean isEmptyyesString = noString == null;
        boolean isEmptyMethodYesString = yesString.isEmpty();
        System.out.println("empty:  "+isEmptyMethodYesString);

        // length
        String text = new String ("  Hillel is my feature. I will be developer      ");
        int textLength = text.length();
        System.out.println("Length: " +textLength+ "  Hillel is my feature. I will be developer     \n " );

//        trim
        String myTestTrim = " Hillel is my feature. I will be developer";
        System.out.println("Trim:"+ myTestTrim.trim());

//        charAt
        String myTestCharAt = " Hillel is my feature. I will be developer";
        char myTestCharAtValue = myTestCharAt.charAt(2);
        System.out.println("charAt:  "+myTestCharAtValue);

//        substring
        String myTestSubstring = " Hillel is my feature. I will be developer";
        System.out.println("substring: " +myTestSubstring.substring(33,42));

//      added a sign at the end of the line "!"
        String string1 = " Hillel is my feature. I will be developer";
        String string2 ="!";
        System.out.println(string1+string2);

//        equals
        String textString1 ="Hillel is my feature. I will be developer";
        String textString2 = "Hillel is my feature. I will be DEVELOPER";
        boolean textStringNoEqual = textString1.equals(textString2);
        boolean textStringAreEqual = textString1.equalsIgnoreCase(textString2);
        System.out.println("equals:             "+textStringNoEqual);
        System.out.println("equalsIgnoreCase:   "+textStringAreEqual);

//        toLowerCase toUpperCase
        String textToLowerCase ="Hillel is my feature. I will be developer";
        System.out.println(textToLowerCase.toLowerCase());
        System.out.println(textToLowerCase.toUpperCase());
    }
}
