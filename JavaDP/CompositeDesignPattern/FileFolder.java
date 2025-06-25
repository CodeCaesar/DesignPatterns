package JavaDP.CompositeDesignPattern;

public class FileFolder implements FileComponent {
    
    private String name;

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
}
