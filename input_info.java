import java.util.Scanner;

public class service {
    public static void main(String[] args) {
        int age;
        char sex;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age ");
        age = sc.nextInt();
        System.out.println("if you are male type M if women type F");
        sex = sc.next().charAt(0);
        if (sex == 'F'){
            System.out.println("you'll work in urban area");
        }
        if(sex == 'M'){
            if(age>=20&&age<40){
                System.out.println("you can work anywhere");
            } else if (age>=40&&age<=60) {
                System.out.println("you'll work in urban area ");
            }
            else{
                System.out.println("you can't work");
            }
        }
    }
}
