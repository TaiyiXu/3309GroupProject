package Model;

import java.util.ArrayList;
import java.util.List;

public class Page {
    List<Page> pages= new ArrayList<Page>();

    public void addPage(Page newpage){
        pages.add(newpage);
    }

    public void setPage(){
    }

    public List<Page> getPages(){
        return pages;
    }

    public void removePage(){

    }
}
