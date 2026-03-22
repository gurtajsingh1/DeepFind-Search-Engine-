# DeepFind Search Engine

A mini search engine built using Spring Boot.
This project is part of my learning journey into backend development and search systems.

The idea is simple: start with basic keyword search and gradually build towards something closer to a real search engine.

---

## What it does

* Search documents using keywords
* Uses an inverted index for faster lookups
* Returns matching documents with basic ranking

More features will be added step by step.

---

## Project Structure

```
DeepFind-Search-Engine/
│
├── src/main/java/com/deepfind/
│   ├── DeepFindApplication.java
│   │
│   ├── controller/
│   │   └── SearchController.java
│   │
│   ├── service/
│   │   ├── SearchService.java
│   │   └── IndexService.java
│   │
│   ├── repository/
│   │   └── DocumentRepository.java
│   │
│   ├── model/
│   │   ├── Document.java
│   │   └── SearchResult.java
│   │
│   ├── dto/
│   │   ├── SearchRequest.java
│   │   └── SearchResponse.java
│   │
│   ├── index/
│   │   └── InvertedIndex.java
│   │
│   ├── util/
│   │   ├── Tokenizer.java
│   │   └── TextProcessor.java
│   │
│   ├── crawler/
│   │   └── WebCrawler.java
│   │
│   ├── config/
│   │   └── AppConfig.java
│   │
│   └── exception/
│       └── GlobalExceptionHandler.java
│
├── src/main/resources/
│   └── application.properties
│
└── pom.xml
```

---

## API

```
GET /api/v1/deepfind/search?q=your_query
```

Example:

```
/api/v1/deepfind/search?q=java
```

---

## How it works (basic idea)

* Text is split into words
* Words are stored in a map → word → list of documents
* When a query comes in, it looks up the word and returns matching docs

---

## Current status

Working on:

* indexing
* search API

Planned next:

* better ranking
* multi-word queries
* web crawler

---

## How to run

* Clone the repo
* Open in IDE
* Run `DeepFindApplication`
* Hit the API from browser or Postman

---

## Notes

This is not a production-ready search engine.
It's being built step by step to understand how things work internally.

---

## Why this project

Wanted to build something that connects:

* DSA (maps, searching)
* backend (Spring Boot)
* system design basics

---

## Author

Built while learning and experimenting.
