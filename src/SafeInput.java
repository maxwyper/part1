import java.util.Scanner;

public class SafeInput {


    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = ""; // Set this to zero length. Loop runs until it isn't
        do {
            System.out.print("\n" + prompt + ": "); // Show prompt and add space
            retString = pipe.nextLine();
        } while (retString.length() == 0); // Continue until the input is non-zero length
        return retString;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Test the method
        String name = getNonZeroLenString(in, "Enter your name");
        System.out.println("You entered: " + name);

        String address = getNonZeroLenString(in, "Enter your address");
        System.out.println("You entered: " + address);

        in.close();
    }
}
