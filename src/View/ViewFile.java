package View;

import Controller.CourseToolController;
import Model.File;

public class ViewFile extends Model.Observer {
    private Model.File file;
    private Controller.CourseToolController controller;

    public void viewFile(Model.File file, Controller.CourseToolController controller) {//constructor to initiate the Model and Controller.
        this.file = file;
        this.file.registerObserver(this);
        this.controller = controller;
    }

    public void update() {
        this.show();
    }//show the files

    public void show() {
        // Display the file
    }

    public void setFileModel(File file) {// setup model for this view
        this.file = file;
        this.file.registerObserver(this);
    }

    public Model.File getFileModel() {
        return file;
    }//get the files

    public void setFileController(CourseToolController controller) {
        this.controller = controller;
    }//setting conrtoller

    public Controller.CourseToolController getController() {
        return controller;
    }
}
