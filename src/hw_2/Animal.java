package hw_2;

//HW_2
//tesk 1
public class Animal {
    private String speciesName;
    public Double weight;
    protected Integer limbsNumber;

    public static void main(String[] args) {
        //tesk 3
        Animal animal = new Animal();
        animal.speciesName = "tarakan";
        animal.limbsNumber = 6;
        animal.weight = 0.003;

        //task 2
        animal.go(11);
        animal.say("Hi peoples");
        animal.printInfo();
    }

    private void printInfo() {
        System.out.println(toString());
    }

    private void say(String speech) {
        System.out.println(speciesName + " say '" + speech + "'");
    }

    private void go(int stepNumber) {
        System.out.println(speciesName + " make " + stepNumber + " steps");
    }

    @Override
    public String toString() {
        return "hw_2.Animal{" +
                "speciesName='" + speciesName + '\'' +
                ", weight=" + weight +
                ", limbsNumber=" + limbsNumber +
                '}';
    }
}
