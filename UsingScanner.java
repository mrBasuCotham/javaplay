import java.util.Scanner;

public class UsingScanner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your first name?: ");
        String firstName = sc.nextLine();

        System.out.print("What is your second name?: ");
        String secondName = sc.nextLine();

        System.out.printf("Your first name is %s, surname is %s", firstName, secondName);
    }
}