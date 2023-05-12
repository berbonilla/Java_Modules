public class anotherApp extends App{
    private static double f;
    private static double c;
    private static double k;

    static void inputTemp() {
        System.out.print("\nInput what temp measurement will be used (F for Fahrenheit | C for Celsius |  K for Kelvin) : ");
        inputM = sc.next().toLowerCase().charAt(0);
        if (inputM == 'f'){
            System.out.print("Input Temperature: ");
            setTempF(sc.nextDouble());
            convertTempt(f);
        }
        else if (inputM == 'c'){
            System.out.print("Input Temperature: ");
            setTempC(sc.nextDouble());
            convertTempt(c);
        }
        else if (inputM == 'k') {
            System.out.print("Input Temperature: ");
            setTempK(sc.nextDouble());
            convertTempt(k);
        }
        else {
            System.out.println("Invalid Input!");
        }
    }


    static void convertTempt(double inpTempVal){
        if (inputM == 'f') {
            setTempC(((f - 32) * 5)/ 9);
            setTempK((((f - 32) * 5) / 9) + 273.15);
        } else if (inputM == 'c') {
            setTempF((c * 9)/5 + 32);
            setTempK(c + 273.15);
        }
        else if (inputM == 'k'){
            setTempC(k-273.15);
            setTempF(((k-273.15) * 9) / 5 + 32);
        }
    }

    static void showTemp(){
        System.out.printf("\nThe Temperature in Celius is :%.2f",c);
        System.out.printf("\nThe Temperature in Fahrenheit is :%.2f" ,f);
        System.out.printf("\nThe Temperature in Kelvin is :%.4f", k);
    }
    
    static void setTempC(double Cel) {
        c = Cel;
    }

    static void setTempF(double Fahr){
        f = Fahr;
    }

    static void setTempK(double Kel) {
        k = Kel;
    }

    double getTempC() {
        return c;
    }

    double setTempF() {
        return f;
    }

    double setTempK() {
        return k;
    }

}


