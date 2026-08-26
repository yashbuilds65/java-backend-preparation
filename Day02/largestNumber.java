import java.util.Scanner;
public class largestNumber
{
    public static void main(String arg[]){
        int a,b;
        System.out.println("Enter two values:");
        Scanner sc=new Scanner(System.in);
        a= sc.nextInt();
        b=sc.nextInt();
        if(a<b){
            System.out.println("No 2nd is greater than No 1st");
        }
        else if(a>b){
             System.out.println("No 1st is greater than No 2nd");
        }
        else{
             System.out.println("Both numbers are equal");
        }
    }
}