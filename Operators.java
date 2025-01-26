import java.util.Scanner;
public class Operators {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter first number:");
        int num1=sc.nextInt();
        System.out.print("enter second number:");
        int num2=sc.nextInt();

        System.out.println("Arithmetic:");
        System.out.println("addition:"+(num1+num2));
        System.out.println("subtraction:"+(num1-num2));
        System.out.println("multiplication:"+(num1*num2));
        System.out.println("division:"+(num1/num2));

        System.out.println("Relational:");
        System.out.println("num1==num2"+(num1==num2));
        System.out.println("num1!=num2"+(num1!=num2));
        System.out.println("num1>num2"+(num1>num2));
        System.out.println("num1<num2"+(num1<num2));
        System.out.println("num1>=num2"+(num1>=num2));
        System.out.println("num1<=num2"+(num1<=num2));

        System.out.println("Logical:");
        int z=9;
        System.out.println("z>10 && z<5:"+(z>10&&z<5));
        System.out.println("z>10 || z<5:"+(z>10||z<5));
        System.out.println("!(z>10):"+!(z>10));
       



    }
    
}
