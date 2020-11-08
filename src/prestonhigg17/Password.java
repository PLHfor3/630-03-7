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
        boolean isPasswordAcceptable = false;
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
                passwordQualityContainsVowel = true;
            } else {
                passwordQualityContainsVowel = false;
            }

            String consonants = ".*[bcdfghjklmnpqrstvwxyz].*";
            String vowels = ".*[aeiou].*";


            for (int passwordIndex = 0; passwordIndex < passwordString.length() - 1; passwordIndex++) {
                String checkOne = passwordString.substring(passwordIndex, passwordIndex + 1);
                String checkTwo = passwordString.substring(passwordIndex + 1, passwordIndex + 2);
                if (checkOne.equals(checkTwo)) {
                    passwordQualityTwoLettersInARow = true;
                    break;
                } else {
                    passwordQualityTwoLettersInARow = false;
                }
            }
            for (int passwordIndex = 0; passwordIndex < passwordString.length() - 2; passwordIndex++) {
                String checkOne = passwordString.substring(passwordIndex, passwordIndex + 1);
                String checkTwo = passwordString.substring(passwordIndex + 1, passwordIndex + 2);
                String checkThree = passwordString.substring(passwordIndex + 2, passwordIndex + 3);
                if (checkOne.equals(checkTwo) && checkOne.equals(checkThree)) {
                    if (checkOne.matches(vowels)) {
                        passwordQualityVowels = true;
                        break;
                    } else {
                        passwordQualityVowels = false;
                    }
                } else {
                    passwordQualityVowels = false;
                }
            }


            for (int passwordIndex = 0; passwordIndex < passwordString.length() - 2; passwordIndex++) {
                String checkOne = passwordString.substring(passwordIndex, passwordIndex + 1);
                String checkTwo = passwordString.substring(passwordIndex + 1, passwordIndex + 2);
                String checkThree = passwordString.substring(passwordIndex + 2, passwordIndex + 3);
                if (checkOne.equals(checkTwo) && checkOne.equals(checkThree)) {
                    if (checkOne.matches(consonants)) {
                        passwordQualityConsenates = true;
                        break;
                    } else {
                        passwordQualityConsenates = false;
                    }
                } else {
                    passwordQualityConsenates = false;
                }
            }
            if (passwordQualityConsenates == false && passwordQualityVowels == false && passwordQualityTwoLettersInARow == false && passwordQualityContainsVowel == true && passwordQualityLength == true) {
                isPasswordAcceptable = true;
            } else {
                isPasswordAcceptable = false;
            }

            System.out.print(
                    MessageFormat.format("The results of the password tested from file \"passwords.txt\" for password \"{0}\"  are: \n{1}\n{2}\n{3}\n{4}\n{5}\n\n{6}",
                            passwordString,
                            " - 3 consenates in a row? " + passwordQualityConsenates, //1
                            " - 3 vowels in a row? " + passwordQualityVowels, //2
                            " - Contains a vowel? " + passwordQualityContainsVowel, //3
                            " - 8 Characters Long? " + passwordQualityLength, //4
                            " - 2 letters in a row? " + passwordQualityTwoLettersInARow, //5
                            "Is the Password Acceptable? "  + isPasswordAcceptable + "\n\n")); //6
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
