import com.example.Feline;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class FelineTest {
    Feline feline = new Feline();

    @Test
    public void eatMeatReturnsPredatorMeal() throws Exception {
        assertEquals(Arrays.asList("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamilyReturnsFeline()  {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensWithoutParamsReturnsDefaultValue()  {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensWithParamsReturnsHandedValue()  {
        assertEquals(2, feline.getKittens(2));
    }





}
