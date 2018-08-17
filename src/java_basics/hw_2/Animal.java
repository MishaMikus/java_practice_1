package java_basics.hw_2;

/*
1. Describe a class (Animal), use :
	- access and non-access (if need) modifiers
2. Create a few methods (methods should print some information at list):
	- method 'go' with enter parameter like amount of steps
	- method 'say' with enter parameter what to say
	- method 'print Information' with nothing to enter, but must print all information about abject
3. Create an Object of class Animal
*/

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
        return "java_basics.hw_2.Animal{" +
                "speciesName='" + speciesName + '\'' +
                ", weight=" + weight +
                ", limbsNumber=" + limbsNumber +
                '}';
    }
}
