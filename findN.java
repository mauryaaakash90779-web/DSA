import java.util.Scanner;

public class findN {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number");
    int num = in.nextInt();
    int n = 128738;
    int count=0;
    // for(int i=n;i>0;i=i/10){
    //   int rem = i%10;
    //   if(rem == num){
    //     count++;
    //   }
    // }
    // System.out.println("Total number of "+num+" is "+count);

      while(n>0){
        int rem = n%10;
        if(rem==num){
          count++;
        }
        n=n/10;
      } 
      System.out.println("Total number of "+num+" is "+count);
  }
}



