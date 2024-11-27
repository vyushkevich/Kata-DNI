package factoria5.katadni.Model;

public class DniCalculator {
    
    private final char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
                                   'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
                                   'C', 'K', 'E'};

    public boolean isValidDni(String input) {
        if (input == null || input.length() != 8) {
            return false;
        }
        
        try {
            int number = Integer.parseInt(input); 
            return number >= 0 && number <= 99999999; 
        } catch (NumberFormatException e) {
            return false; 
        }
    }

    public char calculateDniLetter(int dniNumber) {
        if (dniNumber < 0 || dniNumber > 99999999) {
            throw new IllegalArgumentException("DNI number must be between 0 and 99999999");
        }
        int remainder = dniNumber % 23;
        return letras[remainder]; 
    }
}
