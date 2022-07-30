
package com.rest.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Books implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long bokksId;
    private String name;
    private String content;
    private String author;
    private int pages;

    public Books(long bokksId, String name, String content, String author, int pages) {
        this.bokksId = bokksId;
        this.name = name;
        this.content = content;
        this.author = author;
        this.pages = pages;
    }

    public Books() {
    }

    public long getBokksId() {
        return bokksId;
    }

    public void setBokksId(long bokksId) {
        this.bokksId = bokksId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Books{" + "bokksId=" + bokksId + ", name=" + name + ", content=" + content + ", author=" + author + ", pages=" + pages + '}';
    }
    
    
    
}
