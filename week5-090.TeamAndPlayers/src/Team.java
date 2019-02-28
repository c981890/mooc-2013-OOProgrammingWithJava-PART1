
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
public class Team {
    private String name;
    private ArrayList<Player> members;
    private int maxSize;
    
    public Team(String name) {
        this.name = name;
        this.members = new ArrayList<Player>();
        this.maxSize = 16;
    }

    public String getName() {
        return name;
    }
    
    public void addPlayer(Player person) {
        if (this.members.size() < this.maxSize) {
            this.members.add(person);            
        }
    }
    
    public void printPlayers() {
        for (Player member : members) {
            System.out.println(member.toString());
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public int size() {
        return this.members.size();
    }
    
    public int goals() {
        int result = 0;
        for (Player member : members) {
            result += member.goals();
        }
        return result;
    }
}
