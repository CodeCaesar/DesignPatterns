package JavaDP.CompositeDesignPattern;

public class CompositeMain {
    
    public static void main(String[] args) {
        FileFolder diskC = new FileFolder("Disk C");
        FileFolder programFiles = new FileFolder("Program Files");
        diskC.addFile(programFiles);
        FileFolder steam = new FileFolder("Steam");
        programFiles.addFile(steam);
        File portal = new File("Portal", ".exe", 2_000_000);
        steam.addFile(portal);
        File portal2 = new File("Portal 2", ".exe", 8_000_000);
        steam.addFile(portal2);
        File halfLife2 = new File("Half-Life 2", ".exe", 3_560_000);
        steam.addFile(halfLife2);

        FileFolder rockstarGames = new FileFolder("Rockstar Games");
        programFiles.addFile(rockstarGames);
        File gtav = new File("GTA V", ".exe", 114_000_000);
        rockstarGames.addFile(gtav);
        File rdr2 = new File("Red Dead Redemption 2", ".exe", 105_000_000);
        rockstarGames.addFile(rdr2);

        FileFolder xbox = new FileFolder("Xbox");
        programFiles.addFile(xbox);
        File minecraft = new File("Minecraft", ".exe", 12_300_000);
        xbox.addFile(minecraft);
        File halo = new File("Halo", ".exe", 7_360_000);
        xbox.addFile(halo);

        FileFolder images = new FileFolder("Images");
        diskC.addFile(images);
        File dog = new File("dog", ".png", 67);
        images.addFile(dog);
        File cat = new File("cat", ".png", 53);
        images.addFile(cat);
        File romanEmpireMap = new File("Roman Empire map", ".jpg", 631);
        images.addFile(romanEmpireMap);
        File cartoonTrebuchet = new File("cartoon trebuchet", ".gif", 121);
        images.addFile(cartoonTrebuchet);

        diskC.print();
    }
}
