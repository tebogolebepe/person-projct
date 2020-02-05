import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void hello() {

        Person p1 = new Person("Tebogo", 26,"female",new  String[]{"read","singing"});
        String test = p1.hello();

        Assert.assertEquals(test, "Hello my name is Tebogo and i am 26 years old female .My interest are read and singing");
    }
}