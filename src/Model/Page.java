package Model;

import java.util.ArrayList;
import java.util.List;

public class Page extends Subject {
    private List<Page> pages = new ArrayList<Page>();

    public void addPage(Page newPage) {
        pages.add(newPage);
    }// ading new page to the list
    public void setPage() {//updating the page
    }

    public List<Page> getPages() {
        return pages;
    }// retrive page

    public void removePage(Page page) {
        pages.remove(page);
    } // remove pages
}
