# Ranking Logic

---

## Overview

Ranking determines the order in which search results are returned.

---

## Current Approach

DeepFind currently uses term frequency for ranking.

Documents with higher occurrences of the search term are ranked higher.

---

## Example

Query: "java"

Doc1: "java java spring" → score = 2  
Doc2: "java backend" → score = 1  

Doc1 will rank above Doc2.

---

## Limitations

- Common words may dominate results
- Does not consider importance of terms across documents

---

## Future Improvement: TF-IDF

TF-IDF improves ranking by considering both:

- Term Frequency (TF): how often a term appears in a document
- Inverse Document Frequency (IDF): how rare the term is across all documents

Formula:

score = TF × log(N / DF)

Where:
- N = total number of documents
- DF = number of documents containing the term

---

## Benefit of TF-IDF

- Rare and meaningful terms get higher importance
- Improves relevance of search results

---

## Goal

To move from basic frequency-based ranking to a more accurate relevance-based system.
