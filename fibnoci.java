import java.util.Scanner;

public class fibnoci{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the Nth number of fibnoci series:");
    int n = in.nextInt();
    int a = 0;
    int b = 1;
    int count;
    int temp;
    for(count=2;count<=n;count++){
      temp = b;
      b = a + b;
      a = temp;
      System.out.println(b);
    }

  }
}