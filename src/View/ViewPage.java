package View;


import Controller.CourseToolController;
import Model.Page;

public class ViewPage extends Model.Observer {
    private Model.Page page;
    private Controller.CourseToolController controller;

    public void viewPage(Model.Page page, Controller.CourseToolController controller) {
        this.page = page;
        this.page.registerObserver(this);
        this.controller = controller;
    }

    public void update() {//getting pages
        this.show();
    }

    public void show() {
        // Display page
    }

    public Model.Page getPageModel() {
        return page;
    }// get the page model

    public void setPageModel(Page page) {//setup model for this page
        this.page = page;
        this.page.registerObserver(this);
    }

    public Controller.CourseToolController getPageController() {
        return controller;
    }//setting controler of this page

    public void setPageController(CourseToolController controller) {
        this.controller = controller;
    }
}
