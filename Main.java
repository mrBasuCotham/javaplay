import java.util.Scanner;

public class Main {
    public static void Main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your first name?: ");
        String firstName = sc.nextLine();

        System.out.println("What is your second name?: ");
        String secondName = sc.nextLine();

        System.out.printf("Your first name is %f, surname is %s", firstName, secondName);
    }
}