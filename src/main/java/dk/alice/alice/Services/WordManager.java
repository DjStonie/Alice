package dk.alice.alice.Services;

import dk.alice.alice.Models.Word;

import java.util.HashMap;

public class WordManager {

    private long totalWords;
    public static HashMap<String,Word> words = new HashMap<>();
    private static WordManager instance;

    public static WordManager getInstance(){
        if (instance==null){
            instance=new WordManager();
        }
        return instance;
    }

    public long getTotalWords() {
        return totalWords;
    }

    public void setTotalWords(long totalWords) {
        this.totalWords = totalWords;
    }

    public void countword(String word){
        setTotalWords(getTotalWords()+1);
        if (words.containsKey(word)){
            words.get(word).setOccurrences(words.get(word).getOccurrences()+1);
        }else{
            words.put(word,new Word(word));
        }
    }

    public HashMap<String,Word> getAllWords(){
        calcProcent();
        return words;
    }


    public void calcProcent(){
        for (Word l : words.values()){
            l.setProcent(l.getOccurrences()/totalWords);
        }
    }
}
