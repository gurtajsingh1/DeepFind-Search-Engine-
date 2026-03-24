# Index Design

---

## Overview

DeepFind uses an inverted index as its core data structure for efficient search.

---

## Basic Structure

word → list of document IDs

Example:

java → [1, 2]  
spring → [1]

---

## Improved Structure

word → {docId → frequency}

Example:

java → {1:2, 2:1}

This allows ranking based on how frequently a term appears in a document.

---

## Why Inverted Index?

- Fast lookup for search terms
- Efficient storage for large text data
- Widely used in real-world search engines

---

## Limitations

- Does not support phrase search directly
- Does not store word positions

---

## Future Enhancement

### Positional Index

word → {docId → [positions]}

Example:

java → {1:[1,5], 2:[2]}

This will allow:
- Phrase search
- Better ranking accuracy
