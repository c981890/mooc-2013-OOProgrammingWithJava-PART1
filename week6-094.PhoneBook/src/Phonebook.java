
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
public class Phonebook {
    private ArrayList<Person> members;
    
    public Phonebook() {
        this.members = new ArrayList<Person>();
    }
    
    public void add(String name, String number) {
        // Person member = new Person(name, number);
        this.members.add(new Person(name, number));
    }
    
    public void printAll() {
        for (Person member : this.members) {
            System.out.println(member.toString());
        }
    }
    
    public String searchNumber(String name) {
        for (Person member : this.members) {
            if (member.getName().contains(name)) {
                return member.getNumber();
            }
        }
        return "number not known";
    }
}
