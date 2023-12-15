package Model;

import java.time.LocalDate;

public class Post {
    public static int idd=0 ;
    public int id;
    private String image;
    private String description;
    private String created;

    public Post( String image, String description, String created) {
        this.id = ++idd;
        this.image = image;
        this.description = description;
        this.created = created;
    }

    public static int getIdd() {
        return idd;
    }

    public static void setIdd(int idd) {
        Post.idd = idd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                ", created='" + created + '\'' +
                '}';
    }
}
