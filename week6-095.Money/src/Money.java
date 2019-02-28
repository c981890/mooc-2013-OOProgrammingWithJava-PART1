
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        Money newAdded = new Money(this.euros + added.euros, this.cents + added.cents);
        return newAdded;
    }

    public boolean less(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }
        return false;
    }

    public Money minus(Money decremented) {

        Money newDecremented = new Money(0, 0);
        int ownedCents = this.euros * 100 + this.cents;
        int decrementedCents = decremented.euros * 100 + decremented.cents;

        int minusCents = ownedCents - decrementedCents;

        if (minusCents < 0) {
            return newDecremented;
        }
        int euros = 0;
        euros += minusCents / 100;
        int cents = 0;
        cents = minusCents%100;
        
        Money result = new Money(euros, cents);
        return result;
    }

}
