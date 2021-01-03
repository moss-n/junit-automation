
public class Car {
    private String mMake; 
    private String mModel; 

    public Car(String make, String model){
        this.mMake = make; 
        this.mModel = model;
        System.out.println("Vrooom Vroom!");
        System.out.printf("Congratulations on your new %s %s!%n", mMake, mModel);      
    }

    public void turnRight(){
        System.out.println("Turned Right"); 
    }

    public void turnLeft(){
        System.out.println("Turned Left"); 
    }    

    public void moveForward(){
        System.out.println("Moving forward");
    }
    
    public void reverse(){
        System.out.println("Reversing"); 
    }

    public void brake(){
        System.out.println("Stopped"); 
    }
    
    public String getMake(){
        return mMake; 
    }

    public String getModel(){
        return mModel; 
    }

}
