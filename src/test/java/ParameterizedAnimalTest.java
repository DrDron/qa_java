import com.example.Animal;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedAnimalTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();
    @Rule
    public final ExpectedException exception = ExpectedException.none();

    String animalKind;
    List<String> expectedMeal;
    boolean isNegativeTest;
    public ParameterizedAnimalTest(String animalKind, List<String> expectedMeal, boolean isNegativeTest){
        this.animalKind = animalKind;
        this.expectedMeal = expectedMeal;
        this.isNegativeTest = isNegativeTest;
    }
    @Parameterized.Parameters
    public static Object[][] getAnimalTestData() {
        return new Object[][] {
                {"Травоядное", Arrays.asList("Трава", "Различные растения"), false},
                {"Хищник", Arrays.asList("Животные", "Птицы", "Рыба"), false},
                {"Хищноядное", Arrays.asList(""), true}
        };
    }
    @Test
    public void getFoodReturnsCorrespondingValue() throws Exception {
        if(isNegativeTest){
            exception.expect(Exception.class);}
        Animal animal = new Animal();
        assertEquals(expectedMeal, animal.getFood(animalKind));
    }
}
