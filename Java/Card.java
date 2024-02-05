package Java;

import java.sql.Date;

class Card extends Payment {
    String number;
    Date date;
    String cvv;

    public Card(Integer id, String number, Date date, String cvv) {
        super(id);
        this.number = number;
        this.date = date;
        this.cvv = cvv;
    }

}
