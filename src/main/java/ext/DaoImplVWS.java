package ext;
/**
 * @AZDOUD
 **/
import dao.IDao;
import org.springframework.stereotype.Component;

@Component
public class DaoImplVWS implements IDao {

    @Override
    public double getData() {
        System.out.println("Version web service ");
        double temp = 54;
        return temp;
    }
}
