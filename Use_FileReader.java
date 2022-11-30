package file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Use_FileReader {
public static void main(String[] args) throws IOException {
	File fi=new File("abc/abc.txt");
	FileReader fr=new FileReader(fi);
	int ch=fr.read();
	//System.out.println(ch);
	while(ch !=-1)
	{
		System.out.println((char)ch);
		ch=fr.read();
		
	}
	}
}
