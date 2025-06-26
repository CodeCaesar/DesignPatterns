package JavaDP.CompositeDesignPattern;

public class CompositeMain {
    
    public static void main(String[] args) {
        FileFolder diskC = new FileFolder("Disk C");
        FileFolder programFiles = new FileFolder("Program Files");
        diskC.addFile(programFiles);
        FileFolder steam = new FileFolder("Steam");
        programFiles.addFile(steam);
        File portal = new File("Portal", ".exe");
        steam.addFile(portal);
        File portal2 = new File("Portal 2", ".exe");
        steam.addFile(portal2);
        File halfLife2 = new File("Half-Life 2", ".exe");
        steam.addFile(halfLife2);

        FileFolder rockstarGames = new FileFolder("Rockstar Games");
        programFiles.addFile(rockstarGames);
        File gtav = new File("GTA V", ".exe");
        rockstarGames.addFile(gtav);
        File rdr2 = new File("Red Dead Redemption 2", ".exe");
        rockstarGames.addFile(rdr2);

        FileFolder xbox = new FileFolder("Xbox");
        programFiles.addFile(xbox);
        File minecraft = new File("Minecraft", ".exe");
        xbox.addFile(minecraft);
        File halo = new File("Halo", ".exe");
        xbox.addFile(halo);

        FileFolder images = new FileFolder("Images");
        diskC.addFile(images);
        File dog = new File("dog", ".png");
        images.addFile(dog);
        File cat = new File("cat", ".png");
        images.addFile(cat);
        File romanEmpireMap = new File("Roman Empire map", ".jpg");
        images.addFile(romanEmpireMap);
        File cartoonTrebuchet = new File("cartoon trebuchet", ".gif");
        images.addFile(cartoonTrebuchet);

        diskC.print();
    }
}
