package Model;

import java.util.ArrayList;
import java.util.List;

public class Comment extends Subject {

    private List<Comment> comments = new ArrayList<Comment>();

    public void addComment(Comment comment) {
        comments.add(comment);
    }// add new page to the list

    public void setComment(String comment, int index) {// setting the comment at certain index

    }

    public List<Comment> getComment() {
        return comments;
    }//retrive the desired comment

    public void removeComment(int index) {
        //remove the comment at the index.
    }

    public void replyComment(String reply, int index) {
        //add the reply to the comment index.

    }
}
