from car import Car

class UberVan(Car):
    typeCarAccepted = []
    seatsMaterial   = []

    def __init__(self, license, driver, typeCardAccepted,seatsMaterial):
        super().__init__(license, driver)
        self.typeCarAccepted  = typeCardAccepted
        self.seatsMaterial    = seatsMaterial
