package kyu6;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import com.example.kyu6.CreatePhoneNumber;

public class CreatePhoneNumberTest {

    @Test
    public void tests() {
        assertEquals("(123) 456-7890", CreatePhoneNumber.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}