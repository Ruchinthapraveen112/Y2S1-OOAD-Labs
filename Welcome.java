import java.util.Scanner;

public class Welcome {

    public static void main(String[] args) {
        
        Scanner name = new Scanner(System.in);

        System.out.println("Please enter your first name: ");
        String Fname = name.nextLine();

        System.out.println("Please enter your last name :");
        String Lname = name.nextLine();

        System.out.println("Welcome to Second Year " + Fname +" "+ Lname );

        name.close();
    }
}

