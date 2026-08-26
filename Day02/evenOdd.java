import java.util.Scanner;
public class evenOdd{
    public static void main(String ar[]){
        Scanner sc= new Scanner(System.in);
        int num;
        try{
            System.out.println("Enter number:");
        num= sc.nextInt();
       
        if(num%2==0){
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is Odd");
        }
    }
     catch(Exception e){
        System.out.println("Please enter valid input");
         num= sc.nextInt();
     }
    }
}