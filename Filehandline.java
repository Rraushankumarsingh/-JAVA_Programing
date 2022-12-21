import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filehandline 
{
public static void main(String[] args) throws IOException, InterruptedException
{
	File f=new File("file.txt");
	FileReader fr=new FileReader(f);
	BufferedReader br=new BufferedReader(fr);
	
	int i=0;
	FileWriter fw=new FileWriter("file1.txt");
	BufferedWriter bf=new BufferedWriter(fw);
	while((i=fr.read())!=-1)
	{
		Thread.sleep(100);
		System.out.print((char)i);
		fw.write(i);
	}
	
	fw.close();
	bf.close();
	br.close();
	fr.close();
}
}
