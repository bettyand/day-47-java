import java.util.Scanner;

public class VariableInputs {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string of text:");
        String string = scanner.nextLine();

        System.out.println("Enter an integer:");
        int num = scanner.nextInt();

        System.out.println("Enter a double:");
        double dec = scanner.nextDouble();

        System.out.println("Enter a boolean value:");
        boolean bool = scanner.nextBoolean();

        System.out.println("Your string is " + string);
        System.out.println("Your integer is " + num);
        System.out.println("Your double is " + dec);
        System.out.println("Your boolean is " + bool);

        scanner.close();
    }
}
