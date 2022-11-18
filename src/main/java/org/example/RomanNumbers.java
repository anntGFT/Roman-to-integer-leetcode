package org.example;

public class RomanNumbers {
    public RomanNumbers() {
    }

    public int convertRomanNumbersToIntegers(String romanNumber) {
        int result = 0;
        int currentNumber = 0;
        int previousNumber = 0;

        for (int i = romanNumber.length()-1; i >= 0; i--) {
            switch(romanNumber.charAt(i)) {
                case 'I': currentNumber = 1;
                break;
                case 'V': currentNumber = 5;
                break;
                case 'X': currentNumber = 10;
                break;
                case 'L': currentNumber = 50;
                break;
                case 'C': currentNumber = 100;
                break;
                case 'D': currentNumber = 500;
                break;
                case 'M': currentNumber = 1000;
                break;
            }
            if (currentNumber < previousNumber){
                result -= currentNumber;
            }else{
                result += currentNumber;
                previousNumber = currentNumber;
            }
        }
        return result;
    }
}
