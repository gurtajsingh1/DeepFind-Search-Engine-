package com.deepfind.dto;

import com.deepfind.model.SearchResult;

import java.util.List;

public class SearchResponse {
   private List<SearchResult> results;

   public SearchResponse(List<SearchResult> results){
       this.results = results;
   }
   public List<SearchResult> getResults(){
       return results;
   }
}
