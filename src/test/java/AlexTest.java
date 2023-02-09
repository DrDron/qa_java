import com.example.Alex;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class AlexTest {
    @Mock
    Feline feline;
    @Test
    public void doesHaveMainReturnTrue() throws Exception {
        Alex alex = new Alex(feline);
        assertTrue(alex.doesHaveMane());
    }
    @Test
    public void getFriendsReturnsTrueFriends() throws Exception {
        Alex alex = new Alex(feline);
        assertEquals(Arrays.asList("Марти Зебра", "Глория Бегемот", "Мелман Жираф"), alex.getFriends());
    }
    @Test
    public void getKittensReturnsZero() throws Exception {
        Alex alex = new Alex(feline);
        assertEquals(0,alex.getKittens());
    }
    @Test
    public void getPlaceOfLivingReturnsNYZoo() throws Exception{
        Alex alex = new Alex(feline);
        assertEquals("Нью-Йоркский зоопарк",alex.getPlaceOfLiving());
    }
}
