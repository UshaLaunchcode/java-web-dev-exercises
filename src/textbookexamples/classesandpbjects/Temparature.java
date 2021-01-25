package textbookexamples.classesandpbjects;
//Static fields example
public class Temparature {
    private double fahrenheit;

    private static double absoluteZeroFahrenheit = -459.67;

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double aFahrenheit) {

        if (aFahrenheit < absoluteZeroFahrenheit) {
            throw new IllegalArgumentException("Value is below absolute zero");
        }

        fahrenheit = aFahrenheit;
    }

    // Use a static field the same way as a normal, non-static field
    public static void main(String[] args) {
        System.out.println("Absolute zero in F is: " + absoluteZeroFahrenheit);

// We can also be more explicit
      //  System.out.println("Absolute zero in F is: " + this.absoluteZeroFahrenheit);

    }
}
  //  TO refer static fields outside of a class:


// If the static field is public, we can do this
        //System.out.println("Absolute zero in F is: " + Temperature.absoluteZeroFahrenheit);

// Or if we have an object named "temp" of type Temperature
      //  System.out.println("Absolute zero in F is: " + temp.absoluteZeroFahrenheit);




