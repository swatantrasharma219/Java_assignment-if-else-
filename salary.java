import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        int year,bonus,sal;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter years of hardwork u done for us");
        year = sc.nextInt();
        System.out.println("enter how less we pay U ");
        sal =sc.nextInt();
        if(year>5){
            bonus=(sal/10)/2;
            System.out.println("bonus is"+bonus);
        }
        else{
            System.out.println("spend more year to get bonus3");
        }
}
}
