package com.deepfind.index;

import java.util.*;

public class InvertedIndex {
    private final Map<String, Set<Long>> index = new HashMap<>();

    public void addTerm(String term, Long docId) {
        index.computeIfAbsent(term, k -> new HashSet<>()).add(docId);
    }

    public Set<Long> getDocs(String term) {
        return index.getOrDefault(term, Set.of());
    }
}
