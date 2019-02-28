/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aikitrumm
 */
public class Counter {
    
    private int number;
    private boolean check;
            
    public Counter(int startingValue, boolean check) {
        this.number = startingValue;
        this.check = check;
    }
    
    public Counter(int startingValue) {
        this(startingValue, false);
    }
    
    public Counter(boolean check) {
        this(0, check);
    }
    
    public Counter() {
        this(0, false);
    }
    
    public int value() {
        return this.number;
    }
    
    public void increase() {
        this.number++;
    }
    
    public void increase(int increaseAmount) {
        if (increaseAmount >= 0) {
            this.number += increaseAmount;
        }
    }
    
    public void decrease() {
        if (this.number != 0 && check == false) {
            this.number--;    
        } else if (this.number != 0 && check == true) {
            this.number--;
        } else if (this.number == 0 && check != true) {
            this.number--;
        }
    }
    
    public void decrease(int decreaseAmount) {
        if (decreaseAmount <= 0) {
            this.number = this.number;
        } else if (this.number >= decreaseAmount) {
            this.number -= decreaseAmount;
        } else if (this.number <= decreaseAmount && check == true) {
            this.number = 0;
        } else if (this.number <= decreaseAmount && check == false) {
            this.number -= decreaseAmount;
        }
    }
}
