package com.deepfind.service;

import com.deepfind.model.Document;
import com.deepfind.index.InvertedIndex;
import org.springframework.stereotype.Service;

@Service
public class IndexService {

    private final InvertedIndex invertedIndex;

    public IndexService(InvertedIndex invertedIndex) {
        this.invertedIndex = invertedIndex;
    }

    public void indexDocument(Document document) {
        // Add document to inverted index
    }
}
