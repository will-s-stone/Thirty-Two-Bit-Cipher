import java.util.Scanner;

public class Bit32Cipher {
    private static String mainString = "";
    private static int key;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi there, please input a string: ");
        String string = scanner.next();

        System.out.println("Enter an Integer over 255 and 4,294,967,295 : ");
        key = scanner.nextInt();

        display(string);
        System.out.println("_".repeat(30));
        //Can actually delete the reverse() method;
        display(mainString);
    }
    public static void display(String temp){
        mainString = "";
        for(int i = 0; i < temp.length(); i++){
            char ch = temp.charAt(i);
            int in = temp.charAt(i);
            System.out.println();
            char ch2 = newChar(ch);
            int in2 = ch2;
            System.out.print(ch + " " + "[" + in + "]" + " -> " + "[" + in2 + "] " + ch2 );
            mainString = mainString + ch2;
        }
        System.out.println("\n" + "Result is: " + mainString);
    }
    public static char newChar(char tempChar){
        int keyChar = tempChar ^ key;
        char charKey = (char) keyChar;
        return charKey;
    }
}

