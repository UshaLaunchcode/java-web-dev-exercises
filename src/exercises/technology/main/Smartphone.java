package exercises.technology.main;

public class Smartphone extends Computer {

    //Class variables (Properties)
    private boolean isConnectedTo5G;

    //Constructor
    public Smartphone(int screenWidth, int screenHeight, String manufactureYear, boolean isConnectedTo5G) {
        super(screenWidth, screenHeight, manufactureYear);
        this.isConnectedTo5G = isConnectedTo5G;
    }

    //Getter

    public boolean getIsConnectedTo5G() {
        return this.isConnectedTo5G;
    }

    //Methods
    public void makePhoneCall(String number){
        System.out.println("Calling: " + number);
    }
}

