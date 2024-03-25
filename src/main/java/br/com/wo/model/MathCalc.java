package br.com.wo.model;

import br.com.wo.exceptions.UnsupportedMathOperationException;

public class MathCalc {

    public static void validationNumber(String numberOne, String numberTwo) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
    }

    public static void validationNumber(String number) {
        if (!isNumeric(number)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
    }

    public static Double convertToDouble(String strNumber) {
        if (strNumber == null) return 0D;
        String formatString = strNumber.replaceAll(",", ".");
        if (isNumeric(formatString)) return Double.parseDouble(formatString);
        return 0D;
    }

    public static boolean isNumeric(String strNumber) {
        if (strNumber == null) return false;
        String formatString = strNumber.replaceAll(",", ".");
        return formatString.matches("[-+]?[0-9]*\\.?[0-9]+");
    }

    public static Double sum(String numberOne, String numberTwo) {
        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }

    public static Double subtraction(String numberOne, String numberTwo) {
        return convertToDouble(numberOne) - convertToDouble(numberTwo);
    }

    public static Double multiplication(String numberOne, String numberTwo) {
        return convertToDouble(numberOne) * convertToDouble(numberTwo);
    }

    public static Double division(String numberOne, String numberTwo) {
        return convertToDouble(numberOne) / convertToDouble(numberTwo);
    }

    public static Double rootQuad(String number) {
        return Math.sqrt(convertToDouble(number));
    }

    public static Double average(String numberOne, String numberTwo) {
        return (convertToDouble(numberOne) + convertToDouble(numberTwo)) / 2.0;
    }
}
