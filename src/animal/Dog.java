package animal;



public class Dog extends Animal implements Treatable {
    private boolean hasFoulBreath;

    public Dog(String name, int age) {
        super(name, age);
    }

    public boolean hasFoulBreath() {
        return hasFoulBreath;
    }

    public void setHasFoulBreath(boolean hasFoulBreath) {
        this.hasFoulBreath = hasFoulBreath;
    }

    @Override
    public void treatAnimal() {
        setHasFoulBreath(false);
        setIsClean(true);
    }
}