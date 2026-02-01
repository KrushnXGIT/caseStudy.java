
//package {package_name}
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Hello World
    // System.out.println("First Hand Shake with Java");

    // case Study:: Nandurbar City Health Management System
    // objective1:: To calculate generic Body Mass Index for well-being

    // bmi_inputs:
    Scanner getter = new Scanner(System.in);
    System.out.println("===================================================\n");
    System.out.println("===| Pune City Health Management System Portal |===\n");
    System.out.println("===================================================\n");
    System.out.println("\ngeneric BMI CALCULATOR\n");

    System.out.println("\nEnter Height in centimeters (cm)\n");

    double height = getter.nextDouble();
    height = height / 100;
    System.out.println("\nEnter Weight in kilograms (kg)\n");

    double weight = getter.nextDouble();

    // bmi_outputs:
    double bmi = weight / (height * height);

    String currentSituation;
    
    if (bmi < 18.5) {
      currentSituation = "UNDERWEIGHT";
    } 
    else if (bmi >= 18.5 && bmi < 24.9) {
      currentSituation = "NORMAL";
    }
    else if (bmi >= 24.9 && bmi < 29.9) {
      currentSituation = "OVERWEIGHT";
    }
    else if (bmi >= 29.9 && bmi < 34.9) {
      currentSituation = "OBESE (CLASS 1)";
    }
    else if (bmi >= 34.9 && bmi < 39.9) {
      currentSituation = "OBESE (Class 2)";
    }
    else {
      currentSituation = "EXTREMELY OBESE (CLASS 3)";
    }

    // Display results
    System.out.println("\n====== BMI REPORT ======");
    System.out.println("Height: " + height + " m");
    System.out.println("Weight: " + weight + " kg");
    System.out.println("BMI: " + String.format("%.2f", bmi));
    System.out.println("Inference: " + currentSituation);
    System.out.println("=========================");

    //Reference BMI chart
    System.out.println("\n=== BMI REFERENCE CHART ===");
    System.out.println("Underweight: < 18.5");
    System.out.println("Normal:      18.5 - 24.9");
    System.out.println("Overweight:  25 - 29.9");
    System.out.println("Obese Class I: 30 - 34.9");
    System.out.println("Obese Class II: 35 - 39.9");
    System.out.println("Obese Class III: ≥ 40");
    //getter.close();
  }
}