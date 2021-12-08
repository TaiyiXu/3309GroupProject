package Model;

import java.util.ArrayList;
import java.util.List;

public class File extends Subject {

    private List<File> files = new ArrayList<File>();

    public void addFile(File file) {
        files.add(file);
    }

    public void setFile() {

    }

    public List<File> getFile() {
        return files;
    }

    public void removeFile(File file) {
        files.remove(file);
    }
}
