package prestonhigg17;

import java.text.MessageFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String scannerVar = "";
        int initializer = 0;
        while ((scannerVar.equals("3n") || scannerVar.equals("password")) || initializer < 1) {
            System.out.print(MessageFormat.format("Please choose a program below or type exit to exit: \n{0}\n{1}",
                    " - Type \"password\" to run the password checker",
                    " - Type \"3n\" to run the 3n+1 program\n $ "));
            scannerVar = scan.next();
            initializer++;
            if (scannerVar.equals("password")) {
                Password.password();
            } else if (scannerVar.equals("3n")) {
                ThreeNPlusOne.threeNPlusOne();
            } else {
                System.out.print("Terminating process...\n ");
            }
            try
            {
                Thread.sleep(6500);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            int typeSpaceClear = 0;
            while (typeSpaceClear < 80) {
                System.out.print("\n");
                typeSpaceClear++;
            }

        }
    }
}
