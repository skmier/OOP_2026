package practice5.Problem3;

import java.io.Serializable;

public class Book implements Serializable{
    private static final long serialVersionUID = 1L;
    private String title;
    private String author;
    transient int visitCount;

    public Book(String title,String author,int visitCount){
        this.title = title;
        this.author = author;
        this.visitCount = visitCount;
    }

    @Override
    public String toString() {
        return "Title: " + title + " Author: "+ author + " Visits: " + visitCount;
    }
}