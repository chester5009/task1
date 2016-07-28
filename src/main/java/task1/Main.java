package task1;
import java.util.*;
import java.lang.*;
import task1.MyFileWorker;

class Main{

	
	public static void main(String[] args) {
		
		MyFileWorker worker=new MyFileWorker();

		List<String> file1=worker.getLinesList("file1.txt");
		List<String> file2=worker.getLinesList("file2.txt");
		
		//List<String> res1=worker.equalElements(file1,file2);
		//worker.writeInFile("out1.txt",res1);
		
		
		
		//System.out.println(file1.get(0));
		//System.out.println(file1.get(file1.size()-1));
		
		List<String> res1=worker.equalElements(file1,file2,0);
		List<String> res2=worker.equalElements(file1,file2,1);
		worker.writeInFile("out1.txt",res1);
		worker.writeInFile("out2.txt",res2);
		System.out.println(new String("aaa").equals(new String("Aaa")));
	}
}