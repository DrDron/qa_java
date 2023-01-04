
import com.example.Feline;
import com.example.Lion;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;


import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedLionTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();
    @Rule
    public final ExpectedException exception = ExpectedException.none();
    String sex;
    boolean hasMane;
    boolean isNegativeTest;
    @Mock
    Feline feline;

    public ParameterizedLionTest(String sex, boolean hasMane, boolean isNegativeTest){
    this.sex = sex;
    this.hasMane = hasMane;
    this.isNegativeTest = isNegativeTest;
    }
    @Parameterized.Parameters
    public static Object[][] getLionTestData() {
        return new Object[][] {
                {"Самец", true, false},
                {"Самка", false, false},
                {"Самкамец", false, true}
        };
    }

    @Test
    public void doesHaveManeReturnsCorrespondingValue() throws Exception {
        if(isNegativeTest){
            exception.expect(Exception.class);}
        Lion lion = new Lion(sex, feline);
        assertEquals(lion.doesHaveMane(), hasMane);
    }

}
