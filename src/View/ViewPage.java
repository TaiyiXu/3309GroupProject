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

    public void update() {
        this.show();
    }

    public void show() {
        // Display page
    }

    public Model.Page getPageModel() {
        return page;
    }

    public void setPageModel(Page page) {
        this.page = page;
        this.page.registerObserver(this);
    }

    public Controller.CourseToolController getPageController() {
        return controller;
    }

    public void setPageController(CourseToolController controller) {
        this.controller = controller;
    }
}
