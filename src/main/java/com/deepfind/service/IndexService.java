package com.deepfind.service;

import com.deepfind.model.Document;
import com.deepfind.index.InvertedIndex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexService {
    @Autowired
    private InvertedIndex invertedIndex;

    public void addDocument(Document doc){
        invertedIndex.addDocument(doc);
    }
}
