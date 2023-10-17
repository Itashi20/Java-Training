package com.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SongsApp {
	List<Songs>al=new ArrayList<Songs>();
public void addSongs(String lineToParse) {
	String[] tokens=lineToParse.split("/");
	Songs userSong=new Songs(tokens[0],tokens[1],tokens[2],tokens[3]);
	al.add(userSong);
}
public void getSongs() throws CustomException {
	
		File file=new File("songs.txt");
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(file));
		
		String line=null;
		boolean isFileNotEmpty=false;
		while((line=reader.readLine())!=null) {
			addSongs(line);
			isFileNotEmpty=true;
		}
		
		if(!isFileNotEmpty) {
			System.out.println("exception");
			throw new CustomException("song Not Found");
		}
		
		} catch (IOException e) {
			
			
			
		}
			
	
}

public void show() {
	try {
		getSongs();
	} catch (CustomException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	System.out.println(al);
}



//task1

public void display() {
//	 al.forEach((item) -> {
//         System.out.println(item);
//     });
	
	al.stream().map(m->m).forEach(s->System.out.println(s.getAlbumName()+" "+s.getSingerName()+" "+s.getRating()+" "+s.getGenre()));
}
//	 public void displayrating() {
//		 al.stream().filter(i->i.getRating().equals("high")).forEach(s->System.out.println(s.getSingerName()));
//	 }

public void displayrating() {
	List<Songs>s=al.stream().filter(i->i.getRating().equals("high")).map(m->m).collect(Collectors.toList());
	System.out.println(s);
}
	 



public void sortlist() {
	 List<Songs> s=al.stream().sorted((s1,s2)->s1.getSingerName().compareTo(s2.getSingerName())).map(m->m).collect(Collectors.toList());
	 System.out.println(s);
}

}
//end of line -1
