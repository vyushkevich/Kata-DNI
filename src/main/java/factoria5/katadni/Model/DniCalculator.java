package factoria5.katadni.Model;

public class DniCalculator {
    private final char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
                                   'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
                                   'C', 'K', 'E'};

    public boolean isValidDni(String input) {
        try {
            int number = Integer.parseInt(input);
            return number >= 0 && number <= 99999999;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public char calculateDniLetter(int dniNumber) {
        int remainder = dniNumber % 23;
        return letras[remainder];
    }
}
