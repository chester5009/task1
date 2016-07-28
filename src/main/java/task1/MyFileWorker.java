package task1;

import java.util.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;
import java.lang.*;
public class MyFileWorker{

	public MyFileWorker(){

	}

	public List<String> equalElements(List<String> data1,List<String> data2,int mode){
		List<String> final_list=new ArrayList();
		for(String el1: data1){
			for (String el2: data2) {
				if(mode==0){
					if(this.isStringsEquals(el1,el2)==true) final_list.add(el1);
				}else if(mode==1){
					if(this.isStrsEqWithOutCase(el1,el2)==true) final_list.add(el1);
				}
				

			}
		}
		return final_list;
	}

	public void writeInFile(String name,List<String> data){
		try{
			FileOutputStream writer=new FileOutputStream(name);
			for (String one: data) {
				byte[] buffer=one.getBytes();
				writer.write(buffer,0,buffer.length);

				buffer=new String("\n").getBytes();
				writer.write(buffer,0,buffer.length);
			}
		}catch (IOException e) {
			System.out.println("Error write in file");
		}
	}

	public Boolean isStringsEquals(String s1,String s2){
		Boolean b=new String(s1).equals(s2);
		return b;
	}

	public Boolean isStrsEqWithOutCase(String s1,String s2){

		Boolean b;
		String ss1=s1.toLowerCase();
		String ss2=s2.toLowerCase();
		//Character.toLowerCase(ss1.charAt(0));
		//Character.toLowerCase(ss2.charAt(0));
		b=isStringsEquals(ss1,ss2);
		return b;
		
	}

	public List<String> getLinesList(String path){
		List<String> lines=null;
		try{
			 lines= Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);

		}catch (IOException e) {
			System.out.println("Error file");
		}
		return lines;
	}
}