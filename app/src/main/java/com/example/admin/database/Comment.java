package com.example.admin.database;

/**
 * Created by Admin on 8/22/2015.
 */
public class Comment {
    private long id;
    private String comment;

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getComment(){
        return comment;
    }

    public void setComment(String comment){
        this.comment = comment;
    }

    // Will be used by Arrayadapter in the listview
    @Override
    public String toString(){
        return comment;
    }
}
