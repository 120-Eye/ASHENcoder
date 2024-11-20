import java.util.*;
class Main{
  public static void main(String harsh[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number to check palindrome");
    int sum = 0;
    int r;
    int num = sc.nextInt();
    int temp = num; 
    while(num > 0){
      r = num % 10;
      sum = (sum * 10) + r;
      num = num / 10;
    }
    if(temp == sum) {
      System.out.println("It is a palindrome");
    }
    else {
      System.out.println("It is not a palindrome");
    }
  }
}
