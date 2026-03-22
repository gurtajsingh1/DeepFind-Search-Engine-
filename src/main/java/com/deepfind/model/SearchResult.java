package com.deepfind.model;

import lombok.Data;

@Data
public class SearchResult {
    private Long id;
    private String title;
    private String snippet;
    private double score;
}
