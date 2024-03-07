//тест доп.задания
import com.example.Alex;
import com.example.Feline;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class AlexTest {
    private String sex = "Самец";
    @Mock
    Feline feline;

    @Test
    public void GetKittens() throws Exception {
        Alex alex = new Alex(sex, feline);
        Assert.assertEquals(0, alex.getKittens());
    }

    @Test
    public void GetFriends() throws Exception {
        Alex alex = new Alex(sex, feline);
        List<String> expected = List.of("Мелман", "Глория", "Марти");
        Assert.assertEquals(expected, alex.getFriends());
    }

    @Test
    public void GetPlaceOfLiving() throws Exception{
        Alex alex = new Alex(sex, feline);
        Assert.assertEquals("Нью-Йорский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void MethodClassLionGetHaveMane() throws Exception{
        Alex alex = new Alex(sex, feline);
        assertTrue(alex.doesHaveMane());
    }
}