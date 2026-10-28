import java.util.Scanner;

public class calculator {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter first number:");
    int num1 = in.nextInt();
    System.out.println("Enter second number:");
    int num2 = in.nextInt();
    System.out.println("Enter operator to perform calculation");
    int ans=0;
    while(true){
      char opr = in.next().trim().charAt(0);
      if(opr=='+' || opr =='-' || opr=='*' || opr=='/' || opr=='%'){
      if(opr=='+'){
      ans = num1+num2;
    }
      if(opr=='-'){
      ans = num1-num2;
    }
      if(opr=='*'){
      ans = num1*num2;
    }
      if(opr=='/'){
        if(num2!=0){
      ans = num1/num2;
    }
  }
      if(opr=='%'){
      ans = num1%num2;
    }
  }else{
      System.out.println("Invalid operator");
    }
    System.out.println(ans);
    
  }
}
}