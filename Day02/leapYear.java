import java.util.Scanner;
public class leapYear {
    public static void main(String ar[]){
        int year,choice;
     
        Scanner a= new Scanner(System.in);
        do { 
        System.out.println("Enter Year:");
        year=a.nextInt();
        if(year%4==0){
            System.out.println("Year is leap year");
        }
         else{
            System.out.println("Year is not leap year");
         }   

        
         System.out.println("press 1 for continue");
        System.out.println("press 0 for Exit");
        choice=a.nextInt();
        }
      while (choice==1);
        System.out.println("ThankYou!!");
    }
}
