package dk.alice.alice.Services;

import org.springframework.stereotype.Service;

@Service("textAnalysis")
public class TextAnalysis {

    public static TextAnalysis getInstance() {
        if(instance==null){
            instance = new TextAnalysis();
        }
        return instance;
    }

    private static TextAnalysis instance;
    public void analysis(String ana){
        ana=ana.toLowerCase();
        for (String check : ana.split(" ")){
            if (!check.equalsIgnoreCase("")){
                check = check.replaceAll("[^a-zA-Z]","");
                WordManager.getInstance().countword(check);
                for (char letter : check.toCharArray()){
                    LetterManager.getInstance().countLetter(letter);
                }
            }
        }
    }

}
