public class reverse {
  public static void main(String[] args) {
    int n = 82747289;
    int revNum = 0;
    for(int i = n; i>0;i=i/10){
      int rem = i%10;
      revNum = revNum*10+rem;
    }
    // while(n>0){
    //   int rem = n%10;
    //   revNum = revNum*10+rem;
    //   n=n/10;
    // } 
    System.out.println(revNum);
  }
}
