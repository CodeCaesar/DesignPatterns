package JavaDP.CompositeDesignPattern;

import java.util.ArrayList;

public class FileFolder implements FileComponent {
    
    private String name;
    private ArrayList<String> files = new ArrayList<String>();

    public FileFolder(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    
    public void addFile(FileComponent file) {
        this.files.add(name);
    }
}
