package com.deepfind.controller;

import com.deepfind.dto.SearchRequest;
import com.deepfind.dto.SearchResponse;
import com.deepfind.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/deepfind/search")
public class SearchController {

    @Autowired
    private SearchService searchService;

    @GetMapping
    public List<SearchResult> search(@RequestParam String q) {
        return searchService.search(q);
    }
}