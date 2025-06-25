package JavaDP.CompositeDesignPattern;

public class File implements FileComponent {
    
    private String name;
    private int size; // in KB, if files exceed 1TB then change variable type to "long"

    public File(String name) {
        this.name = name;
        this.size = 0;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setNmae(String name) {
        this.name = name;
    }

    public void updateSize(int size) {
        this.size = size;
    }
}
