package com.main.tasks.fileWordCount;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {

	public String ReadFile(String filePath) {
		
		String returnValue = readLineByLineJava8(filePath);
		
		
		return returnValue;
	}
	
	private String readLineByLineJava8(String filepath)  {
		StringBuilder contentBuilder = new StringBuilder();
		try(Stream<String> stream = Files.lines(Paths.get(filepath), StandardCharsets.UTF_8))
		{
			stream.forEach( s -> contentBuilder.append(s).append(" ")); // the last space is needed for space between lines
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return contentBuilder.toString();
	}
}
