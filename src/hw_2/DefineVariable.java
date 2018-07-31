package hw_2;

import java.util.Scanner;

//HW_2_2
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
