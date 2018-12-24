package com.calc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class NumerologyCalculator {
	NumerologyCalculator() {
		setValues();
	}

	static Map<Integer, List<String>> numberMap = new HashMap<Integer, List<String>>();

	//static List<String> inputList = new ArrayList<String>();

	public int calculateNumerology(String name) {
			int val = 0;
			String[] nameArr = name.split("");
			for (Map.Entry<Integer, List<String>> entry : numberMap.entrySet()) {

				for (String ch : nameArr) {
					if (entry.getValue().contains(ch.toUpperCase()))
						val += entry.getKey();
				}
			}

			System.out.println(name + " value -" + val);
			return val;
	}
	
	public int getSummatedVal(int input) {
		int totalVal = 0;
		
		String inputStr = String.valueOf(input);
		
		String[] inputArr = inputStr.split("");
		
		for(String in : inputArr) {
			totalVal += Integer.valueOf(in);
		}
		
		return totalVal;
		
	}

	private  void setValues() {

		List<String> oneList = new ArrayList<String>();
		oneList.add("A");
		oneList.add("I");
		oneList.add("J");
		oneList.add("Q");
		oneList.add("Y");

		numberMap.put(1, oneList);

		List<String> twoList = new ArrayList<String>();
		twoList.add("B");
		twoList.add("K");
		twoList.add("R");

		numberMap.put(2, twoList);

		List<String> threeList = new ArrayList<String>();
		threeList.add("C");
		threeList.add("G");
		threeList.add("L");
		threeList.add("S");

		numberMap.put(3, threeList);

		List<String> fourList = new ArrayList<String>();
		fourList.add("D");
		fourList.add("M");
		fourList.add("T");

		numberMap.put(4, fourList);

		List<String> fiveList = new ArrayList<String>();
		fiveList.add("E");
		fiveList.add("X");
		fiveList.add("H");
		fiveList.add("N");

		numberMap.put(5, fiveList);

		List<String> sixList = new ArrayList<String>();
		sixList.add("U");
		sixList.add("V");
		sixList.add("W");

		numberMap.put(6, sixList);

		List<String> sevenList = new ArrayList<String>();
		sevenList.add("O");
		sevenList.add("Z");

		numberMap.put(7, sevenList);

		List<String> eightList = new ArrayList<String>();
		eightList.add("F");
		eightList.add("P");

		numberMap.put(8, eightList);
	}

}
