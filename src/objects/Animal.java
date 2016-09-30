package objects;

/**
 * Created by jpmc on 9/29/2016.
 */
public class Animal {

    private String animalName;
    private int animalLegs;
    private boolean animalCanRun;



    public String animalIdentity(){
        return "Animal Identity is: \nName:"+animalName+"\nLegs:"+animalLegs+"\nCan Run: "+animalCanRun+"\n";
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalLegs() {
        return animalLegs;
    }

    public void setAnimalLegs(int animalLegs) {
        this.animalLegs = animalLegs;
    }

    public boolean isAnimalCanRun() {
        return animalCanRun;
    }

    public void setAnimalCanRun(boolean animalCanRun) {
        this.animalCanRun = animalCanRun;
    }
}
