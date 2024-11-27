package factoria5.katadni.Model;

public class DniCalculator {

    // Массив с буквами для расчета DNI
    private final char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
                                   'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
                                   'C', 'K', 'E'};

    // Метод для проверки валидности DNI
    public boolean isValidDni(String input) {
        // Проверка, что входное значение состоит из цифр и имеет длину 8
        if (input == null || input.length() != 8) {
            return false;
        }
        
        try {
            int number = Integer.parseInt(input); // Преобразуем строку в число
            return number >= 0 && number <= 99999999; // Проверка на допустимые пределы
        } catch (NumberFormatException e) {
            return false; // Если вход не является числом
        }
    }

    // Метод для расчета буквы DNI по числу
    public char calculateDniLetter(int dniNumber) {
        if (dniNumber < 0 || dniNumber > 99999999) {
            throw new IllegalArgumentException("DNI number must be between 0 and 99999999");
        }
        int remainder = dniNumber % 23;
        return letras[remainder]; // Возвращаем букву по остатку от деления
    }
}
