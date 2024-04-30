import java.util.Scanner;

/**
 * function
 */
public class function {

    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
      //Question-1 Write a method named is Even that accepts an int argument.The method should
// return true if the argument is even,or false otherwise.Also write a program
// to test your method 


if (isEven(num)){
    System.out.println("Number  is Even");
} else{
    System.out.println("Number is Odd");
}


    }
}