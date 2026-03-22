package com.deepfind.util;

public class TextProcessor {

    public static String preprocess(String text) {
        // Remove stopwords, stemming etc.
        return text.toLowerCase().trim();
    }
}
