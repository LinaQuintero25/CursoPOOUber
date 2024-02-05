class Card extends Payment{
    constructor(id,number,date,cvv){
        super(id)
        this.number=number;
        this.date=date;
        this.cvv=cvv;
    }
}