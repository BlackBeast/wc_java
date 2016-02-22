import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class WcLibTest {
  private WcLib wc;

  @Before
  public void setUp(){
    wc = new WcLib();
  }

  // tests for wc -c option
  @Test
  public void get_byte_count_of_empty_string(){
    String testString = "";
    int byteCount = wc.getByteCount(testString);
    assertEquals(0,byteCount);
  }

  @Test
  public void get_byte_count_of_single_line_string(){
    String testString = "This sentence is to test the byte length.";
    int byteCount = wc.getByteCount(testString);
    assertEquals(41,byteCount);
  }

  @Test
  public void get_byte_count_of_multi_line_string(){
    String testString = "This sentence is to test the byte length.\nBy the way this is multi line.";
    int byteCount = wc.getByteCount(testString);
    assertEquals(72,byteCount);
  }

  // tests for wc -l  option
  @Test
  public void get_line_count_of_empty_string(){
    String testString ="";
    int lineCount = wc.getLineCount(testString);
    assertEquals(1,lineCount);
  }

  @Test
  public void get_line_count_of_single_line_string(){
    String testString = "This sentence is to test the byte length.";
    int lineCount = wc.getLineCount(testString);
    assertEquals(1,lineCount);
  }

  @Test
  public void get_line_count_of_multi_line_string(){
    String testString = "This sentence is to test the byte length.\nBy the way this is multi line.";
    int lineCount = wc.getLineCount(testString);
    assertEquals(2,lineCount);
  }
}