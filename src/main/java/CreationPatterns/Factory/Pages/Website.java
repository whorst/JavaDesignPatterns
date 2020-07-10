package CreationPatterns.Factory.Pages;

import java.util.ArrayList;
import java.util.List;

//The entry point of our factory pattern
public abstract class Website {

    protected List<Page> pages = new ArrayList<>();

    public Website(){
        this.createWebsite();
    }

    protected abstract void createWebsite();

    public List<Page> getPages() {
        return pages;
    }
}
