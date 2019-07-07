import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MessageUtilTest {

   
  @Test
  public void testPrintMessage() {      
    MessageUtil messageUtil = new MessageUtil("Robert");
    assertEquals("Robert", messageUtil.printMessage());
  }

  @Test
  public void testSalutationMessage() {
    MessageUtil messageUtil = new MessageUtil("Robert");
    assertEquals("Hi! Robert", messageUtil.salutationMessage());
  }
}

