import java.util.Scanner;

public class CPN {
    public static void main(String[] args) {
        
        Scanner myobj = new Scanner(System.in);

        int matric_marks;
        int inter_marks;
        int Result_marks;

        System.out.print("Enter Your Matric Marks: ");
        matric_marks = myobj.nextInt();
        System.out.print("Enter Your Inter Marks: ");
        inter_marks = myobj.nextInt();
        System.out.print("Enter Your Test Score into 100: ");
        Result_marks = myobj.nextInt();

        System.out.println("Matric Marks: "+ matric_marks);
        System.out.println("Intermediate Marks: "+ inter_marks);
        System.out.println("Test Score: "+ Result_marks);    

        double Matric = (matric_marks * 100 / 850) * 0.1;
        double Inter = (inter_marks * 100 / 1100) *0.3;
        double Test = Result_marks*0.6;
        double cpn = Matric + Inter + Test;
        System.out.println("****************************");
        System.out.println("Your CPN is: "+ cpn);


    }
}
