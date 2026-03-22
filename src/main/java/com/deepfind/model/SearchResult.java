package com.deepfind.model;

import lombok.Data;
public class SearchResult {
private int docId;
private double score;

    public SearchResult(int docId, double score) {
        this.docId = docId;
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public int getDocId() {
        return docId;
    }
}
