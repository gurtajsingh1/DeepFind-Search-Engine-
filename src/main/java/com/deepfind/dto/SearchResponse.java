package com.deepfind.dto;

import com.deepfind.model.SearchResult;
import lombok.Data;
import java.util.List;

@Data
public class SearchResponse {
    private List<SearchResult> results;
    private long total;
    private int page;
}
