package animal;

public class Monkey {
    class monkey extends Animal implements Treatable {
        private boolean isHyperActive;

        public monkey(String name, int age) {
            super(name, age);
        }

        public boolean isHyperActive() {
            return isHyperActive;
        }

        public void setHyperActive(boolean hyperActive) {
            isHyperActive = hyperActive;
        }

        @Override
        public void treatAnimal() {
            setHyperActive(false);
            setIsClean(true);
        }}}
