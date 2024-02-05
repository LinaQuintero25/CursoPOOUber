package Java;

import java.util.ArrayList;
import java.util.Map;
import java.util.ArrayList;

class UberVan  extends Car {
    
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsmaterial;


    //Constructor
    public UberVan(String licensse, Account driver, Map<String, Map<String,Integer>> typeCarAcceptedMap
    ,ArrayList<String> seatsmaterial){
        //llamo al constructor de la clase padre Car
        super(licensse, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsmaterial=seatsmaterial;
    }
    
}
