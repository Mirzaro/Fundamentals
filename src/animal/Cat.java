package animal;

public class Cat extends Animal implements Treatable {
    private boolean hasLongNails;

    public Cat(String name, int age) {
        super(name, age);
    }

    public boolean hasLongNails() {
        return hasLongNails;
    }

    public void setHasLongNails(boolean hasLongNails) {
        this.hasLongNails = hasLongNails;
    }

    @Override
    public void treatAnimal() {
        setHasLongNails(false);
        setIsClean(true);
    }
}
