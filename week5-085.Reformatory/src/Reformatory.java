public class Reformatory {
    private int weightMeasured;

    public int weight(Person person) {
        // return the weight of the person        
        weightMeasured++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    
    public int totalWeightsMeasured() {
        return weightMeasured; 
    }
}
