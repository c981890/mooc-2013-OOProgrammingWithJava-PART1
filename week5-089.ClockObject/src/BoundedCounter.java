
public class BoundedCounter {
    // copy here the class BoundedCounter from last weeks assignment 78
    private int value;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
    }
    
    public void next() {
        if (this.value == this.upperLimit) {
            this.value = 0;
        } else {
            this.value++;
        }
    }
    
    public String toString() {
        return "" + String.format("%02d", this.value);
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int newValue) {
        if (newValue >= 0 && newValue <= this.upperLimit) {
            this.value = newValue;
        }
    }
}

