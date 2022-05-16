import java.util.Scanner;

public class cbsemarkscalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of english");
        float a = sc.nextFloat();
        System.out.println("Enter marks of Maths");
        float b = sc.nextFloat();
        System.out.println("Enter marks of Science ");
        float c = sc.nextFloat();
        System.out.println("Enter total number ");
        float tt = sc.nextFloat();
        float percentage = (a+b+c)/tt * 100;
        System.out.println("Total percentage obtained -> " +percentage);
    }
}
