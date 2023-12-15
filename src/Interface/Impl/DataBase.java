package Interface.Impl;

import Model.Comment;
import Model.Post;
import Model.Profile;
import Model.User;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DataBase {
    private List<User> users = new ArrayList<>();
    private List<Profile> profiles = new LinkedList<>();
    private List<Post> posts = new ArrayList<>();
    private List<Comment> comments = new LinkedList<>();

    public void saveUser(User user) {
        users.add(user);
        System.out.println(users);
    }

    public User findByUserId(Long id) {
        for (User user : users) {
            if (user.getId()==id) {
                return user;

            }
        }
        return null;
    }

        public void updateUserProfile(Long userId, Profile profile) {
            for (int i = 0; i < profiles.size(); i++) {
                if (profiles.get(i).getId() == userId) {
                    profiles.set(i, profile);
                    break;
                }
            }
            System.out.println(profile);
    }

    public void deleteUser() {
        users.clear();
        System.out.println(users);
    }
    public void saveProfile(Long userId, Profile profile) {

        profiles.add(profile);
    }

    public Profile findProfileByUserId(Long userId) {
        for (Profile profile : profiles) {
            if (profile.getId() == userId) {
                return profile;
            }
        }
        return null;
    }

    public void deleteProfileByUserId(Long userId) {
        for (Profile profile : profiles) {
            if (profile.getId() == userId) {
                profiles.remove(profile);
                break;
            }
        }
    }
    public void savePost(Long userId, Post post) {
        posts.add(post);
        System.out.println("Post saved for user with ID: " + userId + ", Post ID: " + post.getId());
    }


    public List<Post> getPostByUserId(Long userId) {
        List<Post> userPosts = new ArrayList<>();
        for (Post post : posts) {
            if (post.getId() == userId) {
                userPosts.add(post);
            }
        }
        return userPosts;
    }


    public List<Post> searchPost(String query) {
        List<Post> result = new ArrayList<>();
        for (Post post : posts) {
            if (post.getDescription().contains(query)) {
                result.add(post);
            }
        }
        return result;
    }


    public void deletePostById(Long id) {
        posts.removeIf(post -> post.getId() == id);
        System.out.println("Post with ID " + id + " deleted.");
    }

    public  Comment findCommentByPostId(Long postId) {
        for (Comment comment : comments) {
            if (comment.getId() == postId) {
                return comment;
            }
        }
        return null; // Если комментарий для заданного поста не найден
    }

    public  void saveComment(Long postId, Long userId, Comment comment) {
        comments.add(comment);
        System.out.println("Comment saved for post with ID: " + postId + " and user with ID: " + userId);
    }

    public  void updateComment(String oldContent, String newText) {
        for (Comment comment : comments) {
            if (comment.getText().equals(oldContent)) {
                comment.setText(newText);
                System.out.println("Comment updated with content: " + oldContent);
                return;
            }
        }
        System.out.println("Comment with content " + oldContent + " not found");
    }

    public  void deleteComment(Comment comment) {
        comments.remove(comment);
        System.out.println("Comment deleted with content: " + comment.getText());
    }

    public  List<Comment> getComments() {
        return comments;
    }

}
