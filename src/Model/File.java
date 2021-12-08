package Model;

import java.util.ArrayList;
import java.util.List;

public class File extends Subject {

    private List<File> files = new ArrayList<File>();

    public void addFile(File file) {
        files.add(file);
    }//adding new file to the list

    public void setFile(File file, int index) {// updating the desired file
    }

    public List<File> getFile() {
        return files;
    }// returning the files

    public void removeFile(File file) {
        files.remove(file);
    }// deteling the files from the list
}
