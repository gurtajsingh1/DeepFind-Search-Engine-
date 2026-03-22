package com.deepfind.service;

import com.deepfind.index.InvertedIndex;
import com.deepfind.model.SearchResult;
import com.deepfind.dto.SearchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService {
@Autowired
    private InvertedIndex invertedIndex;
public List<SearchResult> search(String query){
    return invertedIndex.serach(query);}

}
