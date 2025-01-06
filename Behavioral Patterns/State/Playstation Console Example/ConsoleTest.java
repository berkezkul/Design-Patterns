public class ConsoleTest {
    public static void main(String[] args) {
        GameConsole console = new GameConsole();

        // Konsolu aç
        console.pressPowerButton(); // "Console is powering ON..."

        // Oyun başlat
        console.pressPlayButton(); // "Starting the game..."

        // Menüye dön
        console.pressMenuButton(); // "Exiting the game and returning to the menu..."

        // Konsolu kapat
        console.pressPowerButton(); // "Console is powering OFF..."

    }
}
