<?php

class Car{
    public $id;
    public $licence;
    public $driver;
    public $passenger;

    public function __construct($licence,$driver)
    {
        $this->licence=$licence;
        $this->driver=$driver;
    }

    public function PrintDataCar(){
        echo "Licence : $this->licence, conductor: {$this->driver->name}, document: {$this->driver->document}";
    }
}