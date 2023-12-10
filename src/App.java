import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        int weight= input.nextInt();

        System.out.println("Enter feet: ");
        int feet= input.nextInt();

        System.out.println("Enter inches: ");
        int inches= input.nextInt();

        int feetToInches = feet * 12;
        int height = feetToInches + inches;
        double bmi = (weight / (Math.pow(height, 2))) * 703;

        String status = "NA";

        if(bmi < 18.5){
            status = "Underweight";
        } else if( bmi >= 18.5 && bmi <= 24.9 ){
            status = "Normal";
        } else if( bmi >= 25 && bmi <= 29.9 ){
            status = "Overweight";
        } else{ 
            status = "Obese";
        }

        System.out.print( "BMI is " + bmi + "\n" + status);
        // System.out.print(  );
        

    }
}
