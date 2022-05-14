package com.digicore.Model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Data
@RequiredArgsConstructor
@Component
public class Alphabet {

    //Todo: this is a finite set
    public HashMap<String, Integer> getAlphabet() {
        HashMap<String, Integer> alphabet = new HashMap<>();
        alphabet.put("A", 2);
        alphabet.put("B",  22);
        alphabet.put("C",  222);
        alphabet.put("D", 3);
        alphabet.put("E",  33);
        alphabet.put("F",  333);
        alphabet.put("G", 4);
        alphabet.put("H", 44);
        alphabet.put("I", 444);
        alphabet.put("J",  5);
        alphabet.put("K",55);
        alphabet.put("L", 555);
        alphabet.put("M", 6);
        alphabet.put("N",  66);
        alphabet.put("O", 666);
        alphabet.put("P",  7);
        alphabet.put("Q",  77);
        alphabet.put("R",  777);
        alphabet.put("S", 7777);
        alphabet.put("T",  8);
        alphabet.put("U",  88);
        alphabet.put("V",  888);
        alphabet.put("W", 9);
        alphabet.put("X",  99);
        alphabet.put("Y", 999);
        alphabet.put("Z", 9999);
        alphabet.put("SPACE",  0);
        return alphabet;
    }
}
