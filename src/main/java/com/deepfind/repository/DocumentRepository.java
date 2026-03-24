package com.deepfind.repository;

import com.deepfind.model.Document;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class DocumentRepository {
    private Map<Integer , Document> storage =  new HashMap<>();

    public void save(Document doc){
        storage.put(doc.getId(), doc);
    }
    public Document findbyId(int id){
        return storage.get(id);
    }
}
