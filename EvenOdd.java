import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int Number;
        System.out.print("Enter Number: ");
        Number = myObj.nextInt();
        if(Number % 2 == 20){
            System.out.println(Number + " is Even Number");
        }
        else{
            System.out.println(Number + " is Odd Number");
        }
    }
}
