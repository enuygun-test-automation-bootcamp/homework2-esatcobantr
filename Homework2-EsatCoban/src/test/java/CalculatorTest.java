import  org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//Gerekli importlari yaptiktan sonra JUnit testini test klasoru icinde gerceklestirdim.
public class CalculatorTest {
    @Test
    //add fonksiyonu icinde assertEquals kullanimi ile Calculator fonksiyonumu test ettim.
    //Birinci ve ikinci degiskenlere 2 degerleri verilince beklenen degerin 4 oldugunu belirttim ve test basariyla gerceklesti.
    void add(){
        Calculator firstCalculator = new Calculator();
        assertEquals(4, ((Calculator) firstCalculator).add(2, 2));
    }
}
