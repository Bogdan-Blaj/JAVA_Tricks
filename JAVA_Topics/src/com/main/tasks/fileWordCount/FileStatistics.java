package com.main.tasks.fileWordCount;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FileStatistics {

	public String getStatistics(String data) {
		String[] array = data.split("\\s+");
		
		Normalise(array);
		return new String();
	}
	
	private void Normalise(String[] s) {

		for ( int i = 0; i < s.length; i++) {
			s[i] = s[i].toLowerCase();
		}
		
		GetWordMap(s);
	}
	
	private void GetWordMap(String[] array) {
		int counter = 0;
		Map <String, Integer> map = new HashMap<String, Integer>();
		
		for (String s: array) {
			if (map.containsKey(s) == false) {
				map.put(s, 1);
			}
			else {
				map.put(s, map.get(s) + 1);
			}
			counter++;
		}
		PrintMap(map,counter);
	}
	
	private void PrintMap(Map<String, Integer> map, int counter) {
		LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();
		// use Comparator.reverseOrder() for descending values
		
		map.entrySet()
			.stream()
			.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
			.forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));	
		
		System.out.println("Words in the Text " + reverseSortedMap);
		
	}
}
