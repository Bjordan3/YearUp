import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main 
{

	public static void main(String[] args) throws IOException 
	{

		try 
		{
			FileReader FR = new FileReader
			("C:\\Users\\Brandon\\Desktop\\OOP_week15.txt");
			String C = "";
			int i;
			while ((i = FR.read()) != -1) 
			{
				char ch = (char)i;
				C = C + ch;
			}
			FR.close();
			System.out.println(C);
			String RC = replaceMyString(C);
			writeItBack(RC);

		} 
		catch (FileNotFoundException fr)
		{
			System.out.println("File not found.");
		}

	}

	private static void writeItBack(String tmpStr) throws IOException
	{
		FileWriter FR = new FileWriter
		("C:\\Users\\Brandon\\Desktop\\OOP_week15.txt");
		FR.write(tmpStr);
		FR.close();
	}

	private static String replaceMyString(String C) 
	{
		String tmp = C.replace("hedon", "dolor");
		System.out.println(tmp);
		return tmp;
	}

}