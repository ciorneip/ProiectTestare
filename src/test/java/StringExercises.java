//import org.junit.Assert;
//import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.Calendar;
import java.util.List;

/**
 * Created by PAULA on 19/09/2017.
 */
public class StringExercises {

    @Test
    public void charAt() throws InterruptedException {
        //se deschide instanta de browser

        String str = "Exercitii Java!";
        System.out.println("String initial = " + str);
        // afiseaza caracterele de pe pozitia 0 si 10
        int index1 = str.charAt(0);
        int index2 = str.charAt(10);

        // printeaza rezultatul.
        System.out.println("Caracterul de pe pozitia 0 este " + (char) index1);
        System.out.println("Caracterul de pe pozitia 10 este " + (char) index2);

    }

    @Test
    public void printStrinsS() throws InterruptedException {
        String original = "software";
        StringBuilder result = new StringBuilder("hi");

        //indexul caracterului a din primul string
        int index = original.indexOf('a');

        result.setCharAt(0, original.charAt(0));
        System.out.println(result);

        result.setCharAt(1, original.charAt(original.length() - 1));
        System.out.println(result);

        result.insert(1, original.charAt(4));
        System.out.println(result);

        result.append(original.substring(1, 4));
        System.out.println(result);

        result.insert(3, (original.substring(index, index + 2) + " "));
        System.out.println(result);
    }


    @Test
    public void replaceAll() throws InterruptedException {
        String str = "The quick brown fox jumps over the lazy dog.";

        // Replace all the 'dog' with 'cat'.
        String new_str = str.replaceAll("fox", "cat");

        // Display the strings for comparison.
        System.out.println("Original string: " + str);
        System.out.println("New String: " + new_str);
    }

    @Test
     public void prinGtStrinsS() throws InterruptedException {
        String str = "w3rsource.com";
        System.out.println("Original String : " + str);

        // codepoint from index 1 to index 10
        int ctr = str.codePointCount(1, 10);

        // prints character from index 1 to index 10
        System.out.println("Codepoint count = " + ctr);
    }

    @Test
    public void compareTo() throws InterruptedException {
        String str1 = "This is Exercise 1";
        String str2 = "This is Exercise 2";

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // Compare the two strings.
        int result = str1.compareTo(str2);

        // Display the results of the comparison.
        if (result < 0) {
            System.out.println("\"" + str1 + "\"" +
                    " is less than " +
                    "\"" + str2 + "\"");
        } else if (result == 0) {
            System.out.println("\"" + str1 + "\"" +
                    " is equal to " +
                    "\"" + str2 + "\"");
        } else // if (result > 0)
        {
            System.out.println("\"" + str1 + "\"" +
                    " is greater than " +
                    "\"" + str2 + "\"");
        }
    }

    @Test
    public void concat() throws InterruptedException {
        String str1 = "PHP Exercises and ";
        String str2 = "Python Exercises";

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);


        // Concatenate the two strings together.
        String str3 = str1.concat(str2);

        // Display the new String.
        System.out.println("The concatenated string: " + str3);
    }

    @Test
    public void contains() throws InterruptedException {
        String str1 = "PHP Exercises and Python Exercises";
        String str2 = "and";
        System.out.println("Original String: " + str1);
        System.out.println("Specified sequence of char values: " + str2);
        System.out.println(str1.contains(str2));
    }

    @Test
    public void contentEquals() throws InterruptedException {
        String str1 = "example.com", str2 = "Example.com";
        CharSequence cs = "example.com";
        System.out.println("Comparing " + str1 + " and " + cs + ": " + str1.contentEquals(cs));
        System.out.println("Comparing " + str2 + " and " + cs + ": " + str2.contentEquals(cs));

        String str3 = "example.com", str4 = "Example.com";
        StringBuffer strbuf = new StringBuffer(str1);

        System.out.println("Comparing " + str3 + " and " + strbuf + ": " + str3.contentEquals(strbuf));

        System.out.println("Comparing " + str4 + " and " + strbuf + ": " + str4.contentEquals(strbuf));

    }

    @Test
    public void calendar() throws InterruptedException {
        Calendar c = Calendar.getInstance();
        System.out.println("Current Date and Time :");
        System.out.format("%tB %te, %tY%n", c, c, c);
        System.out.format("%tl:%tM %tp%n", c, c, c);
    }

    @Test
    public void length() throws InterruptedException {
        String str = "example.com";
        // Get the length of str.
        int len = str.length();
        System.out.println("The string length of '" + str + "' is: " + len);
    }



}

