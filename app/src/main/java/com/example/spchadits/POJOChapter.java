package com.example.spchadits;

public class POJOChapter {
    private Integer author_id;
    private Integer book_id;
    private Integer chapter_id;
    private String title_indonesian;
    private String title_arabic;

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

    public Integer getChapter_id() {
        return chapter_id;
    }

    public void setChapter_id(Integer chapter_id) {
        this.chapter_id = chapter_id;
    }

    public String getTitle_indonesian() {
        return title_indonesian;
    }

    public void setTitle_indonesian(String title_indonesian) {
        this.title_indonesian = title_indonesian;
    }

    public String getTitle_arabic() {
        return title_arabic;
    }

    public void setTitle_arabic(String title_arabic) {
        this.title_arabic = title_arabic;
    }
}
