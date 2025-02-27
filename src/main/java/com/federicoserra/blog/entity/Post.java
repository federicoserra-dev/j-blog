package com.federicoserra.blog.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;


@Entity
@Table(name = "posts")
public class Post implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column
    private String content;

    @Column
    private Timestamp pubblicationDate;

    @Column
    private Timestamp lastUpdateDate;

    @Column
    private int authorID;

    @Column
    private String status;



    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPubblicationDate(Timestamp pubblicationDate) {
        this.pubblicationDate = pubblicationDate;
    }

    public void setLastUpdateDate(Timestamp lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Timestamp getPubblicationDate() {
        return pubblicationDate;
    }

    public Timestamp getLastUpdateDate() {
        return lastUpdateDate;
    }

    public int getAuthorID() {
        return authorID;
    }

    public String getStatus() {
        return status;
    }
}
