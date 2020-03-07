package _02_More_Algorithms;

import java.util.ArrayList;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}

	public static Object countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				return i;
			}
		}
		return null;
	}

	public static double findTallest(List<Double> peeps) {
		Double tallest = 0.0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > tallest) {
				tallest = peeps.get(i);
			}
		}
		return tallest;
	}

	public static Object containsSOS(List<String> message2) {
		// TODO Auto-generated method stub
		for (int i = 0; i < message2.size(); i++) {
			if (message2.get(i).indexOf("... --- ...") != -1) {
				return true;
			}
		}
		return false;
	}

	public static Object findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		int longestloc = 0;
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > words.get(longestloc).length()) {
				longestloc = i;
			}
		}
		return words.get(longestloc);
	}

	public static List<String> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		int iShortest = -1;
		ArrayList<Double> unsortSequence = new ArrayList<>(results);

		ArrayList<Double> sortedSequences = new ArrayList<Double>();
		for (int j = 0; j < results.size(); j++) {
			Double shortest = results.get(0);
			for (int i = 0; i < unsortSequence.size(); i++) {

				if (unsortSequence.get(i) <= shortest) {
					shortest = results.get(i);
					iShortest = i;
				}
			}
			sortedSequences.add(unsortSequence.get(iShortest));
			unsortSequence.remove(iShortest);
		}
		return null;
	}

	
	public static Object contains(List<String> message2, String str) {
		// TODO Auto-generated method stub
		for (int i = 0; i < message2.size(); i++) {
			if (message2.get(i).indexOf(str) != -1) {
				return true;
			}
		}
		return false;
	}
	public static Object sortDNA(List<String> unsortedSequences) {
		// TODO Auto-generated method stub
		int iShortest = -1;
		ArrayList<String> unsortSequence = new ArrayList<>(unsortedSequences);

		ArrayList<String> sortedSequences = new ArrayList<String>();
		for (int j = 0; j < unsortedSequences.size(); j++) {
			int shortest = unsortSequence.get(0).length();
			for (int i = 0; i < unsortSequence.size(); i++) {

				if (unsortSequence.get(i).length() <= shortest) {
					shortest = unsortSequence.get(i).length();
					iShortest = i;
				}
			}
			sortedSequences.add(unsortSequence.get(iShortest));
			unsortSequence.remove(iShortest);
		}
		return sortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		// TODO Auto-generated method stub
		
		
		boolean sorted = false;
		while(!sorted) {
			sorted = true;
			

			for (int i = 0; i < words.size()-1; i++) {
				if(words.get(i).compareTo(words.get(i+1)) > 0) {
					String mem = words.get(i);
					words.set(i, words.get(i+1));
					words.set(i + 1, mem);
					sorted = false;
				}
			}
			
		}
	
		return words;
	}


}
