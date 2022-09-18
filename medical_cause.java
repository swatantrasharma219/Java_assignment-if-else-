import java.util.Scanner;

public class cause {
    public static void main(String[] args) {
        double a, b,percentage;
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total no. of class held");
        a = sc.nextInt();
        System.out.println("enter no. of class you attend");
        b = sc.nextInt();
        percentage=(b/a)*100;
        System.out.println("total %:"+percentage);
        if(percentage<75){
            System.out.println("do you have medical if yes type 'Y if not type 'N'");
            c= sc.next().charAt(0);
            if(c=='Y'){
                System.out.println("you are allowed");
            }if(c=='N'){
                System.out.println("you are not allowed");
            }
        }

        }
    }
