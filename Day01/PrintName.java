import java.util.Scanner;
public class Name{
 public static void main(String ar[]){
 String name;
 int age;
Scanner sc = new Scanner(System.in);
  System.out.println("Enter your name");
  name= sc.nextLine();
  System.out.println("Enter your age");
  age= sc.nextInt();
   System.out.println("Hello "  + name);
    System.out.println("your age is:"+age);
}
}
