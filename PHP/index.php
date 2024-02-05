<?php
require_once('Car.php');
require_once("UberX.php");
require_once('Account.php');

$uberX = new UberX("ade454",new Account("andres herrera", "ui556"),"chevrolet", "Spark");

//$car = new Car("ade454",new Account("andres herrera", "ui556"));

$uberX->PrintDataCar();