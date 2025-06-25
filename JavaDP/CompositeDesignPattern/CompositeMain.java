package JavaDP.CompositeDesignPattern;

public class CompositeMain {
    
    public static void main(String[] args) {
        FileFolder diskC = new FileFolder("Disk C");
        FileFolder programFiles = new FileFolder("Program Files");
        FileFolder steam = new FileFolder("Steam");
        File portal = new File("Portal");
        File portal2 = new File("Portal 2");
        File halfLife2 = new File("Half-Life 2");

        FileFolder rockstarGames = new FileFolder("Rockstar Games");
        File gtav = new File("GTA V");
        File rdr2 = new File("Red Dead Redemption 2");

        FileFolder xbox = new FileFolder("Xbox");
        File minecraft = new File("Minecraft");
        File halo = new File("Halo");
    }
}
