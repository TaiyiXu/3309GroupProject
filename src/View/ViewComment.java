package View;


import javax.naming.ldap.Control;

public class ViewComment {
    private Model.Comment comment;
    private Controller.CourseToolController controller;

    public void viewComment(Model.Comment comment, Controller.CourseToolController controller){
        this.setCommentModel(comment);//need set model function
        this.setController(controller);//need to set controller of this view
    }

    public Model.Comment getComment(){
        return comment;
    }

    public void setCommentModel(Model.Comment model){
        this.comment=comment;

    }

    public Controller.CourseToolController getController(){
        return controller;
    }

    public void setController(Controller.CourseToolController controller){
        this.controller=controller;
    }
}
