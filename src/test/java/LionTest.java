//тест класса львов
import com.example.Feline;
import com.example.Lion;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void GetKittens() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void DoesHaveMan() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void GetFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, lion.getFood());
    }

    @Test()
    public void constructorThrowsExceptionOnUnsupportedSex() {
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Lion lion = new Lion("Котенок", feline);
            lion.doesHaveMane();
        });
        assertEquals("Данный пол отсутствует. Просим использовать доступные - самец или самка", exception.getMessage());
    }
}