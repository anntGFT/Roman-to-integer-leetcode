import org.example.RomanNumbers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RomanNumbersTest {

    RomanNumbers romanNumbers;

    @BeforeAll
    public void setup(){
        romanNumbers = new RomanNumbers();
    }

    @Test
    public void assertThatLetter_I_IsEqualTo1(){
        String romanNumber = "I";
        assertEquals(1, romanNumbers.convertRomanNumbersToIntegers(romanNumber));
    }


    @Test
    public void assertThatLetter_X_IsEqualTo10(){
        String romanNumber = "X";
        assertEquals(10, romanNumbers.convertRomanNumbersToIntegers(romanNumber));
    }

    @Test
    public void assertThatLetter_C_IsEqualTo100(){
        String romanNumber = "C";
        assertEquals(100, romanNumbers.convertRomanNumbersToIntegers(romanNumber));
    }

    @Test
    public void assertThatLetter_M_IsEqualTo1000(){
        String romanNumber = "M";
        assertEquals(1000, romanNumbers.convertRomanNumbersToIntegers(romanNumber));
    }

    @Test
    public void assertThatLetters_III_AreEqualTo3(){
        String romanNumber = "III";
        assertEquals(3, romanNumbers.convertRomanNumbersToIntegers(romanNumber));
    }

    @Test
    public void assertThatLetters_LVIII_AreEqualTo58(){
        String romanNumber = "LVIII";
        assertEquals(58, romanNumbers.convertRomanNumbersToIntegers(romanNumber));
    }

    @Test
    public void assertThatLetters_IV_IsEqualTo4(){
        String romanNumber = "IV";
        assertEquals(4, romanNumbers.convertRomanNumbersToIntegers(romanNumber));
    }

    @Test
    public void assertThatLetters_MCMXCIV_IsEqualTo1994(){
        String romanNumber = "MCMXCIV";
        assertEquals(1994, romanNumbers.convertRomanNumbersToIntegers(romanNumber));
    }
}
