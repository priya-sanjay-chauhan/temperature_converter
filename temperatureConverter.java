import java.util.*;
public class temperatureConverter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Celcius to Fahrenheit: ");
        System.out.println("2. Fahrenheit to Celsius: ");
         int choice=sc.nextInt();

        if(choice==1){
            System.out.print("Enter the value of Celcius: ");
            double Celcius=sc.nextDouble();
            double Fahrenheit=(Celcius * 9/5) + 32;
            System.out.println("Fahrenheit: "+ String.format("%.3f", Fahrenheit));

        }else  if(choice==2){
            System.out.print("Enter the value of Fahrenheit: ");
            double Fahrenheit=sc.nextDouble();
            double Celcius=(Fahrenheit - 32) * 5/9;
            System.out.println("Celsius: "+ String.format("%.3f", Celcius));
            
        }else{
            System.out.println("Invalid choice.");
        }
    }
}
