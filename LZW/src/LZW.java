import java.io.*;

public class LZW 
{
	String input;
	BufferedReader fileReader;
	BufferedReader fileWriter;
	
	public LZW(String input) 
	{
		this.input = input;
	}
	
	/**
	 * @return It will only write to the toFile
	 */
	public void compress(String fromFile, String toFile)
	{
		fileReader = new Reader();
		fileWriter = new Reader();
		
		
	}
}
