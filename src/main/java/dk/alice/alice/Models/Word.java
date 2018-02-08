package dk.alice.alice.Models;

public class Word {

    private String word;
    private long Occurrences;
    private double Procent;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public double getProcent() {
        return Procent;
    }

    public void setProcent(double procent) {
        Procent = procent;
    }

    public long getOccurrences() {
        return Occurrences;
    }

    public void setOccurrences(long occurrences) {
        Occurrences = occurrences;
    }

    public Word(String word) {
        this.setWord(word);
        setOccurrences(1);
    }

}
