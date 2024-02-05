package Java;

class Car {
    private Integer id;
    private String license;
    private Account driver;
    private Integer passegenger;

    // Constructor
    public Car(String licence, Account driver) {
        this.license = licence;
        this.driver = driver;

    }

    void printDataCar() {
        if(passegenger !=null){
            System.out.println("License: " + license + " Driver: " + driver.name + "Passengers: " + passegenger);
        }
        
    }

    public Integer getPassenger() {
        return passegenger;
    }

    public void setPassenger(Integer passenger) {
        if (passenger == 4) {
            this.passegenger = passenger;
        } else {
            System.out.println("Necesita asignar 4 pasajeros");
        }

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

}
