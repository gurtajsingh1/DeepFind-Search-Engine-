package com.deepfind.util;

import java.util.Arrays;
import java.util.List;

public class Tokenizer {
    public static List<String> tokenize(String text){
        return Arrays.asList(text.toLowerCase().split("\\s+"));
    }
}
