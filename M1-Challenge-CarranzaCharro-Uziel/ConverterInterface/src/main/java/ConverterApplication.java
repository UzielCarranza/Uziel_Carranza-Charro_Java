import java.util.Scanner;

public class ConverterApplication {

    public static void main(String[] args) {
        ConverterIf converterIf = new ConverterIf();
        System.out.println("------------  Converter If ------------");
        System.out.println(converterIf.convertMonth(5));
        System.out.println(converterIf.convertMonth(13));
        System.out.println(converterIf.convertDay(1));
        System.out.println(converterIf.convertDay(0));
        System.out.println();

        ConverterSwitch converterSwitch = new ConverterSwitch();
        System.out.println("------------ Converter Switch ------------");
        System.out.println(converterSwitch.convertMonth(1));
        System.out.println(converterSwitch.convertMonth(0));
        System.out.println(converterSwitch.convertDay(7));
        System.out.println(converterSwitch.convertDay(9));
    }

}
