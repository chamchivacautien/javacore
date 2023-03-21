/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day2.interfaces;

/**
 *
 * @author Long Nguyen
 */
public class News implements INews{
    private String title;
    private String author;
    private String publishDate;
    private String content;
    
    @Override
    public void display() {
        System.out.println(" Title: "+this.title+"\n Author: "+this.author+"\n "
                + "PublishDate: "+this.publishDate+"\n Content: "+this.content);
    }

    public News() {
    }
    

    public News(String title, String author, String publishDate, String content) {
        this.title = title;
        this.author = author;
        this.publishDate = publishDate;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    
    
    
}
