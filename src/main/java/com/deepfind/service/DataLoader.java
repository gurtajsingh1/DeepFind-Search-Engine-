package com.deepfind.service;

import com.deepfind.index.InvertedIndex;
import com.deepfind.model.Document;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Component
public class DataLoader {
@Autowired
    private InvertedIndex invertedIndex;

@PostConstruct
    public void loadData(){
    invertedIndex.addDocument(new Document(1,"SpringBoot"));
    invertedIndex.addDocument(new Document(2,"backend development"));
    invertedIndex.addDocument(new Document(3," python fast api"));
}
}
