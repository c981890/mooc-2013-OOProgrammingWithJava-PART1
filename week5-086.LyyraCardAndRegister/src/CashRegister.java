
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros
        this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        double priceEconomical = 2.50;
        
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        
        if (cashGiven >= priceEconomical) {
            this.cashInRegister += priceEconomical;
            economicalSold++;
            return cashGiven - priceEconomical;
        }
        return cashGiven;            
    }

    public boolean payEconomical(LyyraCard card) {
    // the price of the economical lunch is 2.50 euros
    double priceEconomical = 2.50;
    
    // if the balance of the card is at least the price of the lunch:
    //    the amount of sold lunches is incremented by one
    //    the method returns true
    if (card.balance() >= priceEconomical) {
        economicalSold++;
        card.pay(priceEconomical);
        return true;
    }
    // if not, the method returns false
    return false;
    }
        
    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        double priceGourmet = 4.00;
        
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        if (cashGiven >= priceGourmet) {
            this.cashInRegister += priceGourmet;
            gourmetSold++;
            return cashGiven - priceGourmet;
        }

        // if not enough money given, all is returned and nothing else happens
        return cashGiven;
    }
    
    public boolean payGourmet(LyyraCard card) {
    // the price of the gourmet lunch is 4.00 euros
    double priceGourmet = 4.00;
    
    // if the balance of the card is at least the price of the lunch:
    //    the amount of sold lunches is incremented by one
    //    the method returns true
    if (card.balance() >= priceGourmet) {
        gourmetSold++;
        card.pay(priceGourmet);
        return true;
    }    
    // if not, the method returns false
    return false;
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
