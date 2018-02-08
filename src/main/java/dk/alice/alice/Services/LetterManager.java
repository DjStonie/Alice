package dk.alice.alice.Services;

import dk.alice.alice.Models.Letter;

import java.util.HashMap;

public class LetterManager {

    private long totalLetters;
    public static HashMap<Character,Letter> letters = new HashMap<>();
    private static LetterManager instance;

    public static LetterManager getInstance(){
        if (instance==null){
            instance=new LetterManager();
        }
        return instance;
    }
    public long getTotalLetters() {
        return totalLetters;
    }

    public void setTotalLetters(long totalLetters) {
        this.totalLetters = totalLetters;
    }

    public void countLetter(char c){
        setTotalLetters(getTotalLetters()+1);
        if (letters.containsKey(c)){
            letters.get(c).setOccurrences(letters.get(c).getOccurrences()+1);
        }else{
            letters.put(c,new Letter(c));
        }
    }

    public HashMap<Character,Letter> getAllLetters(){
        calcProcent();
        return letters;
    }


    public void calcProcent(){
        for (Letter l : letters.values()){
            System.out.println(l.getOccurrences()+" total "+getTotalLetters()+" procent "+(((double)l.getOccurrences()/(double)totalLetters)*100));
            l.setProcent(((double) l.getOccurrences()/(double)totalLetters)*100);

        }
    }

}
