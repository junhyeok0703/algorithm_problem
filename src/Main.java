import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int input = sc.nextInt();
       int longnum = input/4;

       for(int i =0;i<longnum;i++){
           System.out.print("long ");
       }
        System.out.println("int");


    }
}