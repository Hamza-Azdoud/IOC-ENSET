package metier;

import org.junit.Assert;
import org.junit.Test;

public class CalculeTest {
    private Calcul calcul;
    @Test
    public void testSomme(){
        calcul =new Calcul();
        double a =35;
        double b=9;
        double expected =44;
        double res =calcul.somme(a,b);
        Assert.assertTrue(res==expected);
    }
}
