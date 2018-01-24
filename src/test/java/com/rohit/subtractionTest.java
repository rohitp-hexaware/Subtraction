import com.rohit.subtraction;
import org.junit.Test;

public class subtractionTest{
    @Test
    public void subTest(){
        subtraction s=new subtraction();
        int result=s.subtract(15,6);
        System.out.println("Result is" + result);
        }
}


