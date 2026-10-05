package Assignment_2;

public class Car {
    //Static Members
    public static final String companyName="JUST Cars";
    public static int totalCars=0;

    //Car field/Properties

    private String plate_Number;
    private String car_Model;
    private double daily_Rate;
    private boolean is_Rent;

    //Constructures
    Car(){
        plate_Number="A1001";
        car_Model="Tayota";
        daily_Rate=45;
        is_Rent=false;
    }
    Car(String p_Number, String car_model, double dailyRent, boolean isRent){
        this.plate_Number=p_Number;
        this.car_Model=car_model;
        this.daily_Rate=dailyRent;
        this.is_Rent=isRent;
    }

    //Static Methods
    public static void displayCompany(){
        System.out.println("Company Name: "+companyName);
    }
    public static void totalCars(){
        System.out.println("Total Cars: "+totalCars);
    }


    //Getters

    public String getPlate_Number() {
        return plate_Number;
    }

    public String getCar_Model() {
        return car_Model;
    }

    public double getDaily_Rate() {
        return daily_Rate;
    }

    public boolean isIs_Rent() {
        return is_Rent;
    }

    //Setters


    public void setDaily_Rate(double daily_Rate) {
        this.daily_Rate = daily_Rate;
    }
    public void rent(){
        if (!is_Rent){
            System.out.println("This car already has been ranted");
        }
        else
            System.out.println("Car rent has been successful");
    }
    public void returnCar(){
        is_Rent=true;
        System.out.println("Car rent has beeen successful");
    }

    public void displayCar(){
        System.out.println("==================== Car Info =======================\n" +
                "Company Name: "+companyName+"\n" +
                "Plate Number: "+plate_Number+"\n" +
                "Car Model: "+car_Model+"\n" +
                "Daily Rant: "+daily_Rate+"\n" +
                "=======================================================");
        System.out.println();
    }

}

class TestCar{
    static void main() {
        Car car1=new Car("C1002","Hayundia",70,false);
        car1.rent();
        car1.returnCar();
        car1.displayCar();
        Car car2=new Car("A1003","BMW",90,true);
        car1.returnCar();
    }
}