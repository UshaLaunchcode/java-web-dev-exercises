package exercises.technology.main;

public class Program {
    public static void main(String[] args) {

        //Implementing Smartphone, calling it's class methods and parent class methods
        Smartphone mySmartPhone = new Smartphone(1500, 500, "2021", true);
        //mySmartPhone.makePhoneCall("314-234-1234");
        //int result = mySmartPhone.processTwoPlusTwo();
       // System.out.println("Smartphone result is: " + result);
        //mySmartPhone.tellMeAJoke();

        //Implementing Laptop, calling it's class methods and parent class methods
        Laptop myLaptop = new Laptop(2500, 1500, "2021");
       // myLaptop.openIntelliJ();
        //int result = myLaptop.processTwoPlusTwo();
       // System.out.println("Laptop result is: " + result);

        //Implementing Computer, calling it's class methods
        Computer myComputer = new Computer(3000, 3000, "2021");
        int computerResult = myComputer.processTwoPlusTwo();
        System.out.println("Computer result is: " + computerResult);

            }
        }


