package Controller;

import Model.Comment;
import Model.Page;
import Model.File;

/*
Use the Model-View-Controller pattern to provide a skeleton implementation of your Lesson Tool system.
By skeleton implementation I mean that you don’t have to provide the detailed implementation of
each of the classes you identified in the previous stages.
Just one file per class without detailed implementation inside would be sufficient.
 */
public class CourseToolController {
    Model.Comment comment;
    Model.Page page;
    Model.File file;

    View.ViewComment viewComment;
    View.ViewFile viewFile;
    View.ViewPage viewPage;

    public CourseToolController(Model.Comment comment, Model.Page page, Model.File file, View.ViewComment viewComment, View.ViewPage viewPage, View.ViewFile viewFile) {
        this.comment = comment;
        this.page = page;
        this.file = file;

        this.viewComment = viewComment; //setting the viewComment
        this.viewComment.setController(this); //setting the controller to the viewComment
        this.viewComment.show(); //showing the viewComment

        this.viewPage = viewPage; //setting the viewPage
        this.viewPage.setPageController(this); //setting the controller to the viewPage
        this.viewPage.show(); //showing the viewPage

        this.viewFile = viewFile; //setting the viewFile
        this.viewFile.setFileController(this); //setting the controller to the viewFile
        this.viewFile.show(); //showing the viewFile

    }

    // actions for Comments
    public void newComment(Comment newComment) {
        // use to add new comment
        comment.addComment(newComment);
        this.viewComment.show();
    }

    public void editComment(Comment newComment, int index) {
        // changing the selected index of Comment list to new desired comment
        this.viewComment.show();
    }

    public void deleteComment(int index) {
        // deleting the selected comment.
        this.viewComment.show();
    }

    //actions for Pages
    public void newPage(Page pageName) {
        page.addPage(pageName);
        this.viewPage.show();
    }

    public void editPage() {
        // Code for editing the page
        this.viewPage.show();
    }

    public void deletePage() {
        // Code for deleting the page
        this.viewPage.show();
    }

    //actions for File
    public void newFile(File fileName) {
        // Code for adding new file
        this.viewFile.show();
    }

    public void editFile() {
        // Code for editing the file
        this.viewFile.show();
    }

    public void deleteFile() {
        // Code for deleting the file
        this.viewFile.show();
    }

}
