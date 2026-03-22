package com.deepfind.dto;

import lombok.Data;

@Data
public class SearchRequest {
    private String query;
    private int page = 0;
    private int size = 10;
}
