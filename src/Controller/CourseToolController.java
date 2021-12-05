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

    public CourseToolController(Model.Comment comment, Model.Page page, Model.File file, View.ViewComment viewComment, View.ViewFile viewFile, View.ViewPage viewPage){
        this.comment=comment;
        this.page=page;
        this.file=file;

        this.viewComment=viewComment;//setting the controller of the
        this.viewComment.setController(this);

        this.viewPage=viewPage;
        this.viewPage.setPageController(this);

        this.viewFile=viewFile;
        this.viewFile.setFileController(this);

    }
    // actions for Comments
    public void newComment(Comment newComment){// use to add new comment to
        comment.addComment(newComment);
    }
    
    public void editComment(Comment newComment, int index){// changing the selected index of Comment list to new desired comment
        
    }

    public void deleteComment(int index){// deleting the selected comment.

    }

    //actions for Pages
    public void newPage(Page pageName){
        page.addPage(pageName);
    }

    public void editPage(){

    }

    public void deletePage(){

    }

    //actions for File
    public void newFile(){

    }

    public void editFile(){

    }

    public void deleteFile(){

    }

}
