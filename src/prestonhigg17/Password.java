package prestonhigg17;

import java.io.InputStream;
import java.text.MessageFormat;
import java.util.Scanner;

public class Password {
    public static void password() {
        boolean passwordQualityLength = false;
        boolean passwordQualityConsenates = false;
        boolean passwordQualityVowels = false;
        boolean passwordQualityTwoLettersInARow = false;
        boolean passwordQualityContainsVowel = false;
        InputStream passwords = Password.class.getResourceAsStream("passwords.txt");
        Scanner scan = new Scanner(passwords);
        int numberOfPasswords = scan.nextInt();
        for (int loopNumberOfPasswords = numberOfPasswords; loopNumberOfPasswords > 0 && scan.hasNext(); loopNumberOfPasswords--) {
            String passwordString;
            passwordString = scan.next();


            if (passwordString.length() >= 8) {
                passwordQualityLength = true;
            } else {
                passwordQualityLength = false;
            }


            if (passwordString.contains("a") || passwordString.contains("e") || passwordString.contains("i") || passwordString.contains("o") || passwordString.contains("u")){
                passwordQualityConsenates = true;
            } else {
                passwordQualityConsenates = false;
            }


            if (passwordString.length() >= 8) {
                passwordQualityLength = true;
            } else {
                passwordQualityConsenates = false;
            }


            if (passwordString.length() == 8) {
                passwordQualityLength = true;
            } else {
                passwordQualityConsenates = false;
            }
            System.out.print(
                    MessageFormat.format("The results of the password tested from file \"passwords.txt\" are: \n{0}\n{1}\n{2}\n{3}\n{4}",
                            " - 3 consenates in a row? " + passwordQualityConsenates, //0
                            " - 3 vowels in a row? " + passwordQualityVowels, //1
                            " - Contains a vowel? " + passwordQualityContainsVowel, //2
                            " - 8 Characters Long? " + passwordQualityLength, //3
                            " - 3 consenates in a row? " + passwordQualityTwoLettersInARow + "\n\n")); //4
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
        }
        System.out.print("Password Analysis Complete");
    }
}
