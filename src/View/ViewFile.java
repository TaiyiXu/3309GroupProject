package View;

import Controller.CourseToolController;
import Model.File;

public class ViewFile {
    private Model.File file;
    private Controller.CourseToolController controller;

    public void viewFile(Model.File file,Controller.CourseToolController controller){//constructor to initaite the Model and Controller.
        this.setFileController(controller);
        this.setFileModel(file);
    }

    public void setFileModel(File file) {
        this.file=file;
    }

    public Model.File getFileModel(){
        return file;
    }

    public void setFileController(CourseToolController controller) {
        this.controller=controller;
    }

    public Controller.CourseToolController getController(){
        return controller;
    }
}
