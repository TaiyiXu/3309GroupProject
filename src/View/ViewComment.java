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
    }//showing the updated files

    public void show() {
        // Display comment
    }

    public Model.Comment getComment() {
        return comment;
    }//shwoing the comment

    public void setCommentModel(Model.Comment model) {//setup the model of this view
        this.comment = comment;
        this.comment.registerObserver(this);

    }

    public Controller.CourseToolController getController() {
        return controller;
    }//getting the controller

    public void setController(Controller.CourseToolController controller) {
        this.controller = controller;
    }//seting the controller
}
