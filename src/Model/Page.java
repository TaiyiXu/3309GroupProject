package Model;

import java.util.ArrayList;
import java.util.List;

public class Page extends Subject {
    private List<Page> pages = new ArrayList<Page>();

    public void addPage(Page newPage) {
        pages.add(newPage);
    }

    public void setPage() {
    }

    public List<Page> getPages() {
        return pages;
    }

    public void removePage(Page page) {
        pages.remove(page);
    }
}
