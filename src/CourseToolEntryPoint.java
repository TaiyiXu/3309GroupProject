public class CourseToolEntryPoint {
    public static void main(String[] args) {
        Model.Comment c = new Model.Comment();
        Model.Page p = new Model.Page();
        Model.File f = new Model.File();

        View.ViewComment vc = new View.ViewComment();
        View.ViewPage vp = new View.ViewPage();
        View.ViewFile vf = new View.ViewFile();

        Controller.CourseToolController ctc = new Controller.CourseToolController(c, p, f, vc, vp, vf);
    }
}
