import java.util.Scanner;
public class recursionPrintNnum{
    static void printNum(int current,int num){
        if(current>num)
            return ;
      System.out.println(current);
            printNum(current+1,num);
}
     public static void main(String []arg){
        int opt;
        do { 
            
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        printNum(1,num);
        System.out.println("If you want to print another number press 1 else 0:");
        opt=sc.nextInt();
    } while (opt==1);
      //  sc.close();
    }
}

   
