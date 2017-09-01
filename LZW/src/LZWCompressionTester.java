
public class LZWCompressionTester {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		for (char i = 'a'; i <= 'z'; i++)
		{
			sb.append(i);
		}
		LZW lzw = new LZW(sb.toString());
		String fromFile = "testcase.txt";
		String toFile = "compressed.txt";
		lzw.compress(fromFile, toFile);
		System.out.println("Compressed file should be: 0 1 2 26, 28, 27, 29, 32, 27");
	}

}
