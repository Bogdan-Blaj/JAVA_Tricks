package com.main.tasks.fileWordCount;

public class MainFileWordCount {

	FileReader process = new FileReader();
	FileStatistics statistics = new FileStatistics();
	private String filepath = "/Users/user/Desktop/Development/JAVA/JAVA_Tricks/JAVA_Topics/src/com/main/input.txt";
	
	
	public void MainFileWordCountAccessPoint() {
		// get String from file
		// String == Class(path)
		String words = process.ReadFile(filepath);
		statistics.getStatistics(words);
		
	}
	
	public void SetFilepath(String s) {
		this.filepath = s;
	}
}
