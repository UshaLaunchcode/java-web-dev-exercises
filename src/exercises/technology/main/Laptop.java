package exercises.technology.main;

public class Laptop extends Computer {

    //Class variables
    private  boolean isIntelliJOpened;

    //Constructors
    public Laptop(int screenWidth, int screenHeight, String manufactureYear) {
        super(screenWidth, screenHeight, manufactureYear);
        this.isIntelliJOpened = false;
    }

    public Laptop(int screenWidth, int screenHeight, String manufactureYear, boolean isIntelliJOpened) {
        super(screenWidth, screenHeight, manufactureYear);
        this.isIntelliJOpened = isIntelliJOpened;
    }

    //Getters and Setters

    public boolean getIsIntelliJOpened() {
        return this.isIntelliJOpened;
    }

    public void setIsIntelliJOpened(boolean isIntelliJOpened)
    {
        this.isIntelliJOpened = isIntelliJOpened;
    }
    //Methods
    public void openIntelliJ(){
        this.isIntelliJOpened = true;
        System.out.println("IntelliJ is now opened!");
    }

}
