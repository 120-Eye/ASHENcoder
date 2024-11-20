import java.util.*;
class Main{
  public static void main(String harsh[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to check if it is an Armstrong number");
    int num = sc.nextInt();
    int originalNum = num;
    int sum = 0;
    int r;
    int n = 0;

  
    while(num > 0){
      num = num / 10;
      n++;
    }

    num = originalNum; // Reset num to the original number

   
    while(num > 0){
      r = num % 10;
      sum += Math.pow(r, n);
      num = num / 10;
    }

    if(originalNum == sum) {
      System.out.println("It is an Armstrong number");
    }
    else {
      System.out.println("It is not an Armstrong number");
    }
  }
}
