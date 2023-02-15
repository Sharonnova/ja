public class CalculateG {
  public static double multiplication(double x, double y) {
    return x * y;
  }
  public static double square(double x) {
    return x * x;
  }
  public static double summation(double x, double y) {
    return x + y;
  }
  public static void outline(String message, double result) {
    System.out.println(message + result);
  }
  public static void main(String[] arguments) {
    double gravity = -9.81; // Earth's gravity in m/s^2
    double fallingTime = 30;
    double initialVelocity = 0.0;
    double finalVelocity;
    double initialPosition = 0.0;
    double finalPosition;

    // Add the formulas for position and velocity
    //𝑥(𝑡) = 0.5 ∗𝑎𝑡2 + 𝑣𝑖𝑡 + 𝑥�
    finalPosition = 0.5 * gravity * fallingTime * fallingTime + initialVelocity * fallingTime + initialPosition;
    //𝑣(𝑡) = 𝑎𝑡 + 𝑣𝑖 
    finalVelocity = gravity * fallingTime + initialVelocity;

    //Output the results
    System.out.println("The object's position after " + fallingTime + " seconds is " + finalPosition + " m.");
    System.out.println("The object's velocity after " + fallingTime + " seconds is " + finalVelocity + " m/s.");
    double a = 4.1;
    double b = 2.3;
    double c = multiplication(a, b);
    outline(message; "Powering to square: ", d);
    double e = summation(a, b);
    outline(message; "Summation: ", e);
    } 
    
}
