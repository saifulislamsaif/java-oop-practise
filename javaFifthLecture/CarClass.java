package javaFifthLecture;

public class CarClass {
    public String manufacturerName;
    private String modelName;
    private String carKeyValue;
    private String passwardString;
    public int engineCC;
    final private float amountOfFuelConsumedPersecond=0.02f;


    public float getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(float fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    private float fuelAmount;

    public CarClass(String manu, String model, String key, int engineCC, float fuel) {
        manufacturerName = manu;
        modelName = model;
        carKeyValue = key;
        this.engineCC = engineCC;
        fuelAmount = fuel;
    }

    public CarClass() {
        manufacturerName = new String();
        modelName = new String();
        engineCC = 0;
        fuelAmount = 0;
    }

    public CarClass(String carName) {
        carName = carName;
        manufacturerName = new String(carName);
        modelName = new String();
        engineCC = 0;
        fuelAmount = 0;
    }


    public String getManufacturerName() {
        return manufacturerName;
    }

    public float presentAmountofFuel() {
        return fuelAmount;
    }
    public void addFuel(int fuelAmount){
        this.fuelAmount+=fuelAmount;
    }

    public void runForSecond(int timeInSecond){
        float usedFuel=timeInSecond*amountOfFuelConsumedPersecond;
        fuelAmount-=usedFuel;
    }

    public String getModelName() {
        return modelName;
    }

    public boolean matchPassward(String userInput) {
        return userInput.equals(passwardString);
    }
}
