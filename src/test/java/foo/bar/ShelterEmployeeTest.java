package foo.bar;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

public class ShelterEmployeeTest {

    private ShelterEmployee employee;

    @Mock
    private Cat cat;

    @Before
    public void setup() {
        employee = new ShelterEmployee();
        cat = mock(Cat.class);
    }

    @Test
    public void feedsHungryCat() {
        when(cat.getFishEaten()).thenReturn(2);

        employee.feed(cat);

        verify(cat).feed();
    }

    @Test
    public void doesNotOverfeedCat() {
        when(cat.getFishEaten()).thenReturn(7);

        employee.feed(cat);

        verify(cat, never()).feed();
    }

}