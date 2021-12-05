package View;


import Controller.CourseToolController;
import Model.Page;

public class ViewPage {
    private Model.Page page;
    private Controller.CourseToolController controller;

    public void viewPage(){
        this.setPageModel(page);
        this.setPageController(controller);
    }


    public Model.Page getPageModel(){
        return page;
    }

    public void setPageModel(Page page) {
        this.page=page;
    }

    public Controller.CourseToolController getPageController(){
        return controller;
    }

    public void setPageController(CourseToolController controller) {
        this.controller=controller;
    }
}
