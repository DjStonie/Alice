package dk.alice.alice.Models;

public class Letter{

    private char Char;
    private long Occurrences;
    private double Procent;

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


    public char getChar() {
        return Char;
    }

    public void setChar(char aChar) {
        Char = aChar;
    }




    public Letter(char c) {
        setChar(c);
        setOccurrences(1);
    }
}