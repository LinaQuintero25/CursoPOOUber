package Java;

class UberPool  extends Car {
    String brand;
    String model;

    //Constructor
    public UberPool(String licensse, Account driver, String brand, String model){
        //llamo al constructor de la clase padre Car
        super(licensse, driver);
        this.brand=brand;
        this.model=model;
    }
    
}
