package com.deepfind.index;

import com.deepfind.model.Document;
import com.deepfind.model.SearchResult;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.*;
@Component
public class InvertedIndex {
private Map<String , List<Integer>> index = new HashMap<>();
public void addDocument(Document doc){
    String[] words  = doc.getContent().toLowerCase().split("\\s+");
    for(String Word : words){
        index.computeIfAbsent(Word , k -> new ArrayList<>()).add(doc.getId());
    }
}
public List<SearchResult> search(String query){
    List<SearchResult> results = new ArrayList<>();
    List<Integer> docs = index.getOrDefault(query.toLowerCase(), new ArrayList<>());
    for(Integer docId : docs){
        results.add(new SearchResult(docId , 1.0));
    }
    return results;
}
}
