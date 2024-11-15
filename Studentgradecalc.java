import java.util.Scanner;
public class Studentgradecalc {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println( "*************************Student grade Calculator**********************");
        System.out.println("Enter Student Name:");
        String Name= obj.nextLine();
        System.out.println("Enter Reg_No:");
        String Reg_No=obj.nextLine();
        System.out.println("Enter DOB:");
        String DOB=obj.nextLine();
        System.out.println("Enter the number of subjects:");
        //Here s is number of subjects
        int s=obj.nextInt();
        int total=0;
        System.out.println("Enter the marks obtained in "+s+" subjects respectively:");
        for(int i=0;i<5;i++){
            int marks=obj.nextInt();
            total=total+marks;
        }
        //Ap is average percentage
        double Ap=(double)+total/s;
        String Grade;
        if(Ap>=90){
            Grade= "O";
        }
        else if(Ap>=80){
            Grade="A+";
        }
        else if(Ap>=70){
            Grade="A";
        }
        else if(Ap>=60){
            Grade="B+";
        }
        else if(Ap>=50){
            Grade="B";
        }
        else {
            Grade="Fail";
        }
        System.out.println("Total marks =" +total);
        System.out.println("Average Percentage="+Ap+ "%");
        System.out.println("Grade is:" +Grade);

    }
    
}
