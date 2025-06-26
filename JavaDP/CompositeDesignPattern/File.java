package JavaDP.CompositeDesignPattern;

public class File implements FileComponent {
    
    private String name;
    private String type;
    /**
     * Units measured in <b>KB</b>
     * <p>
     * If files exceed <b>1TB</b> then change variable type to <i>"long"</i>
     */
    private int size;

    public File(String name, String type) {
        this.name = name;
        this.size = 0;
        this.type = type;
    }

    public File(String name, String type, int size) {
        this.name = name;
        this.size = size;
        this.type = type;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public int getSize() {
        return this.size;
    }

    public void updateSize(int size) {
        this.size = size;
    }

    @Override
    public void print() {
        System.out.println("---" + this.getName() + this.getType() + "\t" + this.getSize() + "KB");
    }

    @Override
    public void print(int depth) {
        String spaces = "";

        for(int space = 0; space < depth; space++) {
            spaces += "-";
        }

        System.out.println(spaces + this.getName() + this.getType() + "\t" + this.getSize() + "KB");
    }
}
