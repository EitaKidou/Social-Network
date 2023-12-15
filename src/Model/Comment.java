package Model;

import java.time.LocalDate;

public class Comment {
    public static int idd=0 ;
    public int id;
    private String text;
    private LocalDate comment_date;

    public Comment(String text, LocalDate comment_date) {
        this.id = ++idd;
        this.text = text;
        this.comment_date = comment_date;
    }

    public static int getIdd() {
        return idd;
    }

    public static void setIdd(int idd) {
        Comment.idd = idd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getComment_date() {
        return comment_date;
    }

    public void setComment_date(LocalDate comment_date) {
        this.comment_date = comment_date;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", comment_date=" + comment_date +
                '}';
    }
}
