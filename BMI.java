import java.util.Scanner;
public class BMI{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your weight in kilograms :");
        float Weight=sc.nextFloat();
        System.out.println("Enter your height in meters :");
        float height=sc.nextFloat();
        float BMI=Weight/(height*height);
        System.out.println("Your Body Mass Index is = " + BMI);
        

    }
}