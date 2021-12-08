package View;


import javax.naming.ldap.Control;

public class ViewComment extends Model.Observer {
    private Model.Comment comment;
    private Controller.CourseToolController controller;

    public void viewComment(Model.Comment comment, Controller.CourseToolController controller) {
        this.comment = comment;//need set model function
        this.comment.registerObserver(this);
        this.controller = controller;//need to set controller of this view
    }

    public void update() {
        this.show();
    }

    public void show() {
        // Display comment
    }

    public Model.Comment getComment() {
        return comment;
    }

    public void setCommentModel(Model.Comment model) {
        this.comment = comment;
        this.comment.registerObserver(this);

    }

    public Controller.CourseToolController getController() {
        return controller;
    }

    public void setController(Controller.CourseToolController controller) {
        this.controller = controller;
    }
}
