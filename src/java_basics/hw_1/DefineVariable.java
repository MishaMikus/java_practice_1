package java_basics.hw_1;

/*
2. Define any int variable and create program , which print variable less then 10(if it is true) or variable more then 10(if it is true)
*/
import java.util.Scanner;

public class DefineVariable {
    public static void main(String[] args) {
        //1.from arguments
        if (args != null && args.length > 0) {
            Integer definedValue = Integer.parseInt(args[0]);
            outputInfoAboutDefinedValue(definedValue);
        } else {
            //2.from console input devices
            System.out.println("Please input definedValue using you input device");
            System.out.print("definedValue=");
            Integer definedValue = Integer.parseInt(new Scanner(System.in).nextLine());
            outputInfoAboutDefinedValue(definedValue);
        }
    }

    private static void outputInfoAboutDefinedValue(Integer definedValue) {
        if (definedValue > 10) {
            System.out.println("definedValue[" + definedValue + "]>10");
        } else {
            System.out.println("definedValue[" + definedValue + "]<=10");
        }
    }
}
