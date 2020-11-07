package prestonhigg17;

import java.io.InputStream;
import java.text.MessageFormat;
import java.util.Scanner;

public class password {
    public static void password() {
        boolean passwordQualityLength = false;
        boolean passwordQualityConsenates = false;
        boolean passwordQualityVowels = false;
        boolean passwordQualityTwoLettersInARow = false;
        boolean passwordQualityContainsVowel = false;
        InputStream passwords = password.class.getResourceAsStream("passwords.txt");
        Scanner scan = new Scanner(passwords);
        int numberOfPasswords = scan.nextInt();
        for (int loopNumberOfPasswords = numberOfPasswords; loopNumberOfPasswords > 0; loopNumberOfPasswords--) {
            String passwordString = new String();
            passwordString = scan.next();


            if (passwordString.length() == 8) {
                passwordQualityLength = true;
            } else {
                passwordQualityConsenates = false;
            }


            if (passwordString.length() == 8) {
                passwordQualityLength = true;
            } else {
                passwordQualityConsenates = false;
            }


            if (passwordString.length() == 8) {
                passwordQualityLength = true;
            } else {
                passwordQualityConsenates = false;
            }


            if (passwordString.length() == 8) {
                passwordQualityLength = true;
            } else {
                passwordQualityConsenates = false;
            }
        }
        System.out.print(
                MessageFormat.format("The results of the passwords tested from file \'passwords.txt\" are: \n{0}\n{1}\n{2}\n{3}\n{4}",
                " - 3 consenates in a row? " + passwordQualityConsenates,
                " - 3 vowels in a row? " + passwordQualityVowels,
                " - Contains a vowel? " + passwordQualityContainsVowel,
                " - 8 Characters Long? " + passwordQualityLength,
                " - 3 consenates in a row? " + passwordQualityTwoLettersInARow));
    }
}
