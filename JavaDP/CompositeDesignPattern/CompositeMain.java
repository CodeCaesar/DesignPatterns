package JavaDP.CompositeDesignPattern;

public class CompositeMain {
    
    public static void main(String[] args) {
        FileFolder diskC = new FileFolder("Disk C");
        FileFolder programFiles = new FileFolder("Program Files");
        FileFolder steam = new FileFolder("Steam");
        File portal = new File("Portal", ".exe");
        File portal2 = new File("Portal 2", ".exe");
        File halfLife2 = new File("Half-Life 2", ".exe");

        FileFolder rockstarGames = new FileFolder("Rockstar Games");
        File gtav = new File("GTA V", ".exe");
        File rdr2 = new File("Red Dead Redemption 2", ".exe");

        FileFolder xbox = new FileFolder("Xbox");
        File minecraft = new File("Minecraft", ".exe");
        File halo = new File("Halo", ".exe");

        FileFolder images = new FileFolder("Images");
        File dog = new File("dog", ".png");
        File cat = new File("cat", ".png");
        File romanEmpireMap = new File("Roman Empire map", ".jpg");
        File cartoonTrebuchet = new File("cartoon trebuchet", ".gif");
    }
}
