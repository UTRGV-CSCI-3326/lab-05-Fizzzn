import java.util.Scanner;
public class Input{

 public static void main(String [] args){
    Scanner scanner = new Scanner(System.in);
    //info gathering begin! 
    String username;
    int userage;
    double weight;
    boolean smokeryuck;
    System.out.print("Hello, name please?:");
    username = scanner.nextLine();
    System.out.print("age: ");
    userage = scanner.nextInt();
    System.out.print("your weight[Ib]: ");
    weight = scanner.nextDouble();
    System.out.print("do you smoke?[T/F]: ");
    smokeryuck = scanner.nextBoolean();
    System.out.print("///////////////////////////////");
    System.out.println("\nInformation summery:");
    System.out.println("Name:" + username + "\nage:" + userage + "\nweight:" + weight + "\nSmoking status:" + smokeryuck);
    
    }



}
