import java.util.Scanner;
public class sumOfN{
    public static void main(String ar[]){
       
        Scanner sc=new Scanner(System.in);
        int option;
         do { 
       int num;
        int sum=0;
        
        System.out.println("Enter natural number");
        num= sc.nextInt();
        for(int i=1;i<=num;i++){
            sum= sum+i;
        }
         System.out.println("Total sum is:"+ sum);
        System.out.println("If you want to continue press 1 either press 2");
        option=sc.nextInt();
        } while (option==1);
       
    }
}