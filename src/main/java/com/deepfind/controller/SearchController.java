package com.deepfind.controller;

import com.deepfind.dto.SearchRequest;
import com.deepfind.dto.SearchResponse;
import com.deepfind.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/search")
public class SearchController {

    @Autowired
    private SearchService searchService;

    @PostMapping
    public ResponseEntity<SearchResponse> search(@RequestBody SearchRequest request) {
        SearchResponse response = searchService.search(request.getQuery());
        return ResponseEntity.ok(response);
    }
}
