package com.digicore.Service;

import com.digicore.Model.Alphabet;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;


@Service
@RequiredArgsConstructor
public class MultiClickService {

    private final Alphabet alphabet;

    public String getClickMultiClickResult(String letter) {
        StringBuilder resultSet = new StringBuilder();

        for(int i=0; i < letter.length(); i++){

            //Todo: look for each characters and find the index
            String letterVal = String.valueOf(letter.charAt(i));
            HashMap<String, Integer> alphabetCharResult;
            String concatResult;

            //Todo: check for empty string/space/""/blank/tab -> space
            if(letterVal.isBlank()){
                String spaceOrTab = "SPACE";
                alphabetCharResult = alphabet.getAlphabet();
                concatResult = String.valueOf(alphabetCharResult.get(spaceOrTab));
            }else {
                String changeLetterToUpperCase = letterVal.toUpperCase();
                alphabetCharResult = alphabet.getAlphabet();
                concatResult = String.valueOf(alphabetCharResult.get(changeLetterToUpperCase));
            }
            //Todo: append result to string builder
            resultSet.append(concatResult);
        }
        return resultSet.toString();
    }

    public Object getAlphabetCiphers(){
        return alphabet.getAlphabet();
    }
}
