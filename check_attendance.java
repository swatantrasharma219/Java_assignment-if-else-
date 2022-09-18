import java.util.Scanner;

public class attendance {
    public static void main(String[] args) {
        double a, b,percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total no. of class held");
        a = sc.nextInt();
        System.out.println("enter no. of class you attend");
        b = sc.nextInt();
        percentage=(b/a)*100;
        System.out.println("total %:"+percentage);
        if(percentage>75){
            System.out.println("you are allowed");
        }
        else{
            System.out.println("you are not allowed");
        }
    }
}
