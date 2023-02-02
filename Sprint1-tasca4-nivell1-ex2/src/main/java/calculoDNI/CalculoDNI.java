package calculoDNI;

public class CalculoDNI {

    public static char calculateLetter(double numberDNI){
        char letter = ' ';
        double remainder=0;
        double divisor = 23;

        remainder = numberDNI % divisor;
        String letters = "TRWAGMYFPDXBNJZSQVHLCKE";
        letter = letters.charAt((int)remainder);

        return letter;
    }


}
