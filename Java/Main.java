package Java;
class Main{
    public static void main(String[] args) {
        System.out.println("Hola MUndo");
        Car car = new Car("RET123", new Account("Andres Herrera", "10493718"));
        //car.license ="RET123";
        //car.driver="Andres Herrera";
        //car.passegenger = 4;
        car.printDataCar();


        Car car2 = new Car("YHG789",new Account("Andrea Herrera", "7898"));
        //car2.license = "YHG789";
        //car2.driver="Andrea Herrera";
       // car2.passegenger=3;
        car2.printDataCar();


        UberX  uberX= new UberX("RET123", new Account("Andres Herrera", "10493718"),"chevrolet","clio");
        //car.license ="RET123";
        //car.driver="Andres Herrera";
        uberX.setPassenger(3);
        uberX.printDataCar();

        

        
    }
}
    
