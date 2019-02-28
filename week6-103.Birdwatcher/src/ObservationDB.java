
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
public class ObservationDB {

    private ArrayList<Bird> birds;

    public ObservationDB() {
        this.birds = new ArrayList<Bird>();
    }

    public void addBird(String name, String latinName) {
        this.birds.add(new Bird(name, latinName));
    }

    public void statistics() {
        for (Bird member : this.birds) {
            System.out.println(member.toString());
        }
    }

    public void addObservation(ObservationDB db, String name) {
        for (Bird member : this.birds) {
            if (member.getName().equals(name)) {
                member.setObservation();
            }
        }
    }

    public Boolean doesItExist(ObservationDB db, String name) {
        for (Bird member : this.birds) {
            if (member.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void findShow(ObservationDB db, String name) {
        for (Bird member : this.birds) {
            if (member.getName().equals(name)) {
                System.out.println(member.toString());
            }
        }
    }
}
