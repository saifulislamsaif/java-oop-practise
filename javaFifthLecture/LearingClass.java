package javaFifthLecture;

public class LearingClass {
    private int aNumber=2;
   static private CarClass ourCar;
   static public CarClass ourAnotherCar;

    public static void main(String[] args) {

       ourAnotherCar=new CarClass("ToyaTa","Allien","qwerty",1500,30);
       CarClass thirdCar =new CarClass("MAZDA","BMW","kdfh",45,64.3f);
        SubCarClass subCarClass= new SubCarClass("Mazda","RRR","ttt",55,33,65,"grey");
        System.out.println("Manufacture name "+ourAnotherCar.manufacturerName);
        System.out.println("Brand name "+ourAnotherCar.getModelName());
        System.out.println("Passward match"+ourAnotherCar.matchPassward("yes"));
        System.out.println("Engine CC " +ourAnotherCar.engineCC);
        System.out.println("fuel Amount " +ourAnotherCar.presentAmountofFuel()+"l");
        ourAnotherCar.addFuel(2);
        System.out.println("Amount of Fuel after adding 2l :"+ourAnotherCar.presentAmountofFuel());
        ourAnotherCar.runForSecond(60);
        System.out.println("Amount of Fuel after driving for 60s 2l :"+ourAnotherCar.presentAmountofFuel());
        System.out.println("\n");
        System.out.println("Manufacture name "+thirdCar.manufacturerName);
        System.out.println("Brand name "+thirdCar.getModelName());
        System.out.println("Passward match"+thirdCar.matchPassward("yes"));
        System.out.println("Engine CC " +thirdCar.engineCC);
        System.out.println("fuel Amount " +thirdCar.presentAmountofFuel()+"l");
        thirdCar.addFuel(2);
        System.out.println("Amount of Fuel after adding 2l :"+thirdCar.presentAmountofFuel());
        thirdCar.runForSecond(60);
        System.out.println("Amount of Fuel after driving for 60s 2l :"+thirdCar.presentAmountofFuel());
        System.out.println("\n");
        System.out.println("Manufacture name "+subCarClass.manufacturerName);
        System.out.println("Brand name "+subCarClass.getModelName());
        System.out.println("Passward match"+subCarClass.matchPassward("yes"));
        System.out.println("Engine CC " +subCarClass.engineCC);
        System.out.println("fuel Amount " +subCarClass.presentAmountofFuel()+"l");
        subCarClass.addFuel(2);
        System.out.println("Amount of Fuel after adding 2l :"+subCarClass.presentAmountofFuel());
        subCarClass.runForSecond(60);
        System.out.println("Amount of Fuel after driving for 60s 2l :"+subCarClass.presentAmountofFuel());
        System.out.println("Betary of the car "+ subCarClass.getBatary());
        System.out.println("Color of the Car "+subCarClass.getColor());
    }
}
