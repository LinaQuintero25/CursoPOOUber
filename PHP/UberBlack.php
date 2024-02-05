<?php
require_once('Car.php');
class UberBlack extends Car{
public $typeCarAcceoted;
public $seatMaterial;
    public function __construct($license,$driver,$typeCarAcceoted,$seatMaterial)
    {
          //Conctructor de la clase padre
          parent::__construct($license,$driver);
          $this->typeCarAcceoted=$typeCarAcceoted;
          $this->seatMaterial=$seatMaterial;
    }
}