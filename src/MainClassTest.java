import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetLocalNumber() {
        MainClass mainClass = new MainClass();
        Assert.assertEquals("Возвращаемое значение getLocalNumber не равно 14!", 14, mainClass.getLocalNumber());
    }

    @Test
    public void testGetClassNumber() {
        MainClass mainClass = new MainClass();
        Assert.assertTrue("Возвращаемое значение getClassNumber не больше 45!", mainClass.getClassNumber() > 45);
    }

    @Test
    public void testGetClassString() {
        MainClass mainClass = new MainClass();
        Assert.assertTrue("Возвращаемое значение getClassString не содержит hello или Hello!", mainClass.getClassString().contains("Hello") || mainClass.getClassString().contains("hello"));
    }
}
