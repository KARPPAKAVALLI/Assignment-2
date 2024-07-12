import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Celsius value to convert : ");
        double celsius=sc.nextDouble();
        double fahrenheit = (9.0/5.0)*celsius + 32;
        System.out.println("The corresponding Fahrenheit value is : "+fahrenheit);
    }
}
