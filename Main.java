import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("1人目の身長を入力してください。(m)");
        Scanner sc = new Scanner(System.in);
        double height1 = Double.parseDouble(sc.nextLine());

        System.out.println("1人目の体重を入力してください。(Kg)");
        double weight1 = Double.parseDouble(sc.nextLine());

        System.out.println("2人目の身長を入力してください。(m)");
        double height2 = Double.parseDouble(sc.nextLine());

        System.out.println("2人目の体重を入力してください。(Kg)");
        double weight2 = Double.parseDouble(sc.nextLine());

        double bmi1 = weight1 / (height1 * height1);
        double bmi2 = weight2 / (height2 * height2);

        System.out.println("1人目");
        System.out.printf("%.2f%n", bmi1);
        double num1 = (height1 * height1) * 22;
        System.out.print("適正体重は、");
        System.out.printf("%.2f%n", num1);


        System.out.println("2人目");
        System.out.printf("%.2f%n", bmi2);
        double num2 = (height2 * height2) * 22;
        System.out.print("適正体重は、");
        System.out.printf("%.2f%n", num2);
    }
}