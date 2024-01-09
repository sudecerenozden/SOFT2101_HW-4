import java.util.Scanner;

public class Program {

  public static void main(String[] args) {
  
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter the first number: ");
    int num1 = sc.nextInt();
    /*from  w  ww  . j  a v  a2s  . c  om*/
    System.out.print("Please enter the second number: ");
    int num2 = sc.nextInt();
    
    for (int i= num1+1; i<num2; i++){
        if (i % 2 == 1) {
          System.out.print(i+" ");
        }
    }
    sc.close();
 }
    
}
