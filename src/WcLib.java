public class WcLib{
  public int getByteCount(String text){
  	return text.length();
  }

  public int getLineCount(String text){
  	return text.split("\n").length;
  }
}
