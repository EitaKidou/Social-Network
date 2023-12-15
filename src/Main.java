import Interface.Impl.DataBase;
import Model.Comment;
import Model.Post;
import Model.Profile;
import Model.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        User user = new User("sada", "adsw", "aswd");
//        Post post = new Post("dasd", "asdada", "Awsdad");
        Comment comment = new Comment("adascad", LocalDate.of(2021, 2, 23));
//        Profile profile = new Profile("asdw", LocalDate.of(2021, 2, 2), "awdad", "AWdad");
        DataBase dataBase = new DataBase();
        dataBase.saveUser(new User("adwd","wadf","wdadfw"));
        System.out.println(dataBase.findByUserId(2L));
        dataBase.updateUserProfile(2L,new Profile("awd",LocalDate.of(2023,2,3),"awdd","dwad"));
        dataBase.deleteUser();
        dataBase.saveProfile(2L,new Profile("ewdfe",LocalDate.of(2020,3,4),"wddawd","wadfwf"));
        dataBase.findProfileByUserId(2L);
        dataBase.deleteProfileByUserId(2L);
        dataBase.savePost(2L,new Post("adwdw","wdfef","ewfwef"));
        dataBase.getPostByUserId(2L);
        dataBase.searchPost("adwdw");
        dataBase.deletePostById(1L);
        dataBase.saveComment(2L,2L,comment);
        dataBase.findCommentByPostId(2L);
        dataBase.deleteComment(comment);
        dataBase.updateComment("adascad","awdaf");


    }
}