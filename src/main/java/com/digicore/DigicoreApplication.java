package com.digicore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@SpringBootApplication
public class DigicoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigicoreApplication.class, args);

//		String letter = "a";
//		HashMap<String, Integer> result = getAlphabet();
//		System.out.println("Target--"+result.get(letter.toUpperCase()));
//
//		String setLetter = "Please let me know your name";
//		String data = getSingleLetterClick(setLetter);
//		System.out.println("data---"+data);
	}


//	public static HashMap<String, Integer> getAlphabet() {
//		HashMap<String, Integer> alphabet = new HashMap<>();
//		alphabet.put("A", 2);
//		alphabet.put("B",  22);
//		alphabet.put("C",  222);
//		alphabet.put("D", 3);
//		alphabet.put("E",  33);
//		alphabet.put("F",  333);
//		alphabet.put("G", 4);
//		alphabet.put("H", 44);
//		alphabet.put("I", 444);
//		alphabet.put("J",  5);
//		alphabet.put("K",55);
//		alphabet.put("L", 555);
//		alphabet.put("M", 6);
//		alphabet.put("N",  66);
//		alphabet.put("O", 666);
//		alphabet.put("P",  7);
//		alphabet.put("Q",  77);
//		alphabet.put("R",  777);
//		alphabet.put("S", 7777);
//		alphabet.put("T",  8);
//		alphabet.put("U",  88);
//		alphabet.put("V",  888);
//		alphabet.put("W", 9);
//		alphabet.put("X",  99);
//		alphabet.put("Y", 999);
//		alphabet.put("Z", 9999);
//		alphabet.put("SPACE",  0);
//		return alphabet;
//	}

//	public static String getSingleLetterClick(String letter){
//		StringBuilder resultSet = new StringBuilder();
//
//		for(int i=0; i < letter.length(); i++){
//
//			System.out.println("AlPHA--"+letter.charAt(i));
////			System.out.println("LetterCount--"+resultSet);
//			String letterVal = String.valueOf(letter.charAt(i));
//			System.out.println("String-AlPHA--"+letterVal.isEmpty()+" String-AlPHA1--"+letterVal.isBlank());
//			HashMap<String, Integer> result;
//			String concactResult;
//			//check for empty string or space " " or blank
//			if(letterVal.isBlank()){
//				String spaceOrTab = "SPACE";
//				result = getAlphabet();
//				System.out.println("SPACE-ANS--"+result.get(spaceOrTab));
//				concactResult = String.valueOf(result.get(spaceOrTab));
//			}else {
//				String changeLetterToUpperCase = letterVal.toUpperCase();
//				result = getAlphabet();
//				System.out.println("Target-ANS--"+result.get(changeLetterToUpperCase));
//				concactResult = String.valueOf(result.get(changeLetterToUpperCase));
//			}
//
////			String values = result.get(letter.charAt(i)).toString();
////			resultSet.append(letter.charAt(i));
//			resultSet.append(concactResult);
//			System.out.println("LetterCount--"+resultSet);
//
//
//		}
//		System.out.println("LetterResult--"+resultSet);
//		return resultSet.toString();
//	}
}
