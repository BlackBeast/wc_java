public class WcLib{
  public int getByteCount(String text){
  	if(text == null) return 0;
  	return text.length();
  }

  public int getLineCount(String text){
  	if(text == null) return 0;
  	return text.split("\n").length;
  }

  public int getWordCount(String text){
  	if(text == null) return 0;
  	return text.trim().split("\\s+").length;
  }

  public int[] countAll(String text){
  	int[] result = new int[3];
  	result[0] = getLineCount(text);
  	result[1] = getWordCount(text);
  	result[2] = getByteCount(text);

  	return result;
  }
}
