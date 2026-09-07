import java.util.Scanner;
public class recursiveFactorial{
    
    static int factorial(int n){
        if(n==1){
            return 1;
        }
     return   n*factorial(n-1);
    }
    public static void main(String []ar){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number:");
        int n=sc.nextInt();
        int result=factorial(n);
        System.out.println("Factorial of Number "+n+" is= "+result);
    }
}
