package JavaDP.CompositeDesignPattern;

import java.util.ArrayList;

public class FileFolder implements FileComponent {
    
    private String name;
    private ArrayList<FileComponent> files = new ArrayList<FileComponent>();

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
        this.files.add(file);
    }

    @Override
    public void print(int depth) {
        String spaces = "";

        for(int space = 0; space < depth; space++) {
            spaces += "-";
        }

        System.out.println(spaces + getName());

        for(FileComponent file : this.files) {
            file.print(depth+1);
        }
    }

    @Override
    public void print() {
        System.out.println(getName());

        for(FileComponent file : this.files) {
            file.print(1);
        }
    }
}
