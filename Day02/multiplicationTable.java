import java.util.Scanner;
public class multiplicationTable{
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int i,num,sum=0;
        System.out.println("Enter number which you want to print table:");
        num=sc.nextInt();
        for(i=1;i<=10;i++){
            sum= num*i;
            System.out.println(""+num+"*"+i+"="+sum);
            }
        }
    }
