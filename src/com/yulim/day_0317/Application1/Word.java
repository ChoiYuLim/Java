package com.yulim.day_0317.Application1;

public class Word {
    private String letters;

    public Word(String letters) {
        this.letters = letters;
    }

    public boolean isVowel(int i) {
        return "aioueAIOUE".contains(letters.substring(i, i + 1));
    }

    
    
    public static void main(String[] args) {
        Word w = new Word("ajik");
        System.out.println(w.isVowel(2));
    }
}

