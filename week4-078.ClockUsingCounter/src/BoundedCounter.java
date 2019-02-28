/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aikitrumm
 */
public class BoundedCounter {
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
