# DeepFind - Search Engine

DeepFind is a mini search engine built using Java and Spring Boot.  
The project focuses on implementing core search engine concepts such as indexing, query processing, and ranking from scratch.

Instead of relying on external tools, this project is designed to understand how search systems work internally.

---

## Features

- Keyword-based search
- Multi-word query support
- AND / OR query handling
- Basic ranking based on term frequency
- In-memory inverted index
- REST API for search

---

## Tech Stack

- Java
- Spring Boot
- REST APIs

---

## API

### Search Endpoint

GET /api/v1/deepfind/search?q=java

### Example Queries

- `java`
- `java AND spring`
- `java OR python`

---

## How It Works

1. User sends a query
2. Query is processed and tokenized
3. Search is performed on the inverted index
4. Matching documents are retrieved
5. Results are ranked and returned

---

## Project Structure

controller/     → Handles API requests  
service/        → Business logic  
index/          → Core search engine logic  
model/          → Data models  
util/           → Utility classes  

---

## Future Improvements

- TF-IDF based ranking
- Phrase search support
- Database integration
- Web crawler for real data
- Caching for performance
- Integration with Elasticsearch

---

## Motivation

The goal of this project is to build a strong understanding of:

- How search engines index data
- How queries are processed
- How ranking determines relevance

This project prioritizes learning fundamentals over using pre-built solutions.
