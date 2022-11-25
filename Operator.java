import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        int First_number;
        int Second_number;
        System.out.print("Enter Your First Number: ");
        First_number = myObj.nextInt();
        
        System.out.print("Enter Your Secondt Number: ");
        Second_number = myObj.nextInt();

        System.out.println("Addition of "+ (First_number) +" + "+ (Second_number) + " is: "+ (First_number+ Second_number) );
        System.out.println("Substraction of "+ (First_number) +" - "+ (Second_number) + " is: "+ (First_number - Second_number) );
        System.out.println("Multiplication of "+ (First_number) +" x "+ (Second_number) + " is: "+ (First_number * Second_number) );
        System.out.println("Division of "+ (First_number) +" / "+ (Second_number) +  " is: "+ (First_number / Second_number) );
        System.out.println("Remainder of "+ (First_number) +" % "+ (Second_number) + " is: "+ First_number % Second_number );

    }
}
