package Model;

import java.util.ArrayList;
import java.util.List;

public class Comment {

    List<Comment> comments= new ArrayList<Comment>();

    public void addComment(Comment comment){
        comments.add(comment);
    }

    public void setComment(String comment , int index){

    }

    public List<Comment> getComment(){
        return comments;
    }

    public void removeComment(int index){

    }

    public void replyComment(String reply, int index){
        //add the reply to the comment index.

    }
}
