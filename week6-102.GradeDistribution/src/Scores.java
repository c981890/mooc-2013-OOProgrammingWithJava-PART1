
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aikitrumm
 */
public class Scores {

    private ArrayList<Grade> members;

    public Scores() {
        this.members = new ArrayList<Grade>();
    }

    public void add(int number) {
        this.members.add(new Grade(number));
    }

    public void printAll() {
        for (Grade member : this.members) {
            System.out.println(member);
        }
    }

    public void printStars(int number) {
        if (number == 0) {
            for (Grade member : this.members) {
                if ((Integer.parseInt(member.toString()) >= 0) && (Integer.parseInt(member.toString()) <= 29)) {
                    System.out.print("*");

                }

            }
        } else if (number == 1) {
            for (Grade member : this.members) {
                if ((Integer.parseInt(member.toString()) >= 30) && (Integer.parseInt(member.toString()) <= 34)) {
                    System.out.print("*");

                }

            }
        } else if (number == 2) {
            for (Grade member : this.members) {
                if ((Integer.parseInt(member.toString()) >= 35) && (Integer.parseInt(member.toString()) <= 39)) {
                    System.out.print("*");

                }

            }
        } else if (number == 3) {
            for (Grade member : this.members) {
                if ((Integer.parseInt(member.toString()) >= 40) && (Integer.parseInt(member.toString()) <= 44)) {
                    System.out.print("*");

                }

            }
        } else if (number == 4) {
            for (Grade member : this.members) {
                if ((Integer.parseInt(member.toString()) >= 45) && (Integer.parseInt(member.toString()) <= 49)) {
                    System.out.print("*");

                }

            }
        } else if (number == 5) {
            for (Grade member : this.members) {
                if ((Integer.parseInt(member.toString()) >= 50) && (Integer.parseInt(member.toString()) <= 60)) {
                    System.out.print("*");

                }

            }
        }
        
    }
    
    public void acceptanceScore() {
        int accepted = 0;
        for (Grade member : this.members) {
            if ((Integer.parseInt(member.toString()) >= 30) && (Integer.parseInt(member.toString()) <= 60))
                accepted++;
        }
        System.out.println("accepte " + accepted);
        int allScores = 0;
        for (Grade member : this.members) {
            if ((Integer.parseInt(member.toString()) >= 0) && (Integer.parseInt(member.toString()) <= 60))
                allScores++;
        }
        System.out.println("allscores" + allScores);
        
        if (allScores > 0) {
            double result = 100 * ((double)accepted / allScores);
            System.out.println("Acceptance percentage: " + result);
        } else {
            double result = 100;
            System.out.println("Acceptance percentage: " + result);
        }
        
        
    }
}
