from payment import Payment

class Card(Payment):

    number = str
    date   = str
    cvv    = str

    def __init__(self, id,number,date,cvv):
        super().__init__(id)
        self.number    = number
        self.date      = date
        self.cvv       = cvv