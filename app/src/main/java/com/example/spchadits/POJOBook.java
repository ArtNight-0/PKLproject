package com.example.spchadits;

public class POJOBook {
    private Integer author_id;
    private Integer book_id;
    private String book_indonesian;
    private String book_arabic;

    public Integer getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public String getBook_indonesian() {
        return book_indonesian;
    }

    public void setBook_indonesian(String book_indonesian) {
        this.book_indonesian = book_indonesian;
    }

    public String getBook_arabic() {
        return book_arabic;
    }

    public void setBook_arabic(String book_arabic) {
        this.book_arabic = book_arabic;
    }
}
