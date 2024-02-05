from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola Mundo")
    car = Car("AMS121",Account("andres Herrrera","7789"))
    # car.license ="AMS121"
    #car.driver = "andres Herrrera"
    print(vars(car))
    print(vars(car.driver))

   