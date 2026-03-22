package com.deepfind.util;

import java.util.Arrays;
import java.util.List;

public class Tokenizer {

    public static List<String> tokenize(String text) {
        return Arrays.stream(text.toLowerCase().split("\\W+"))
                .filter(word -> !word.isEmpty())
                .toList();
    }
}
