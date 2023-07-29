import entity.MusicPlayer;
import entity.WebBrowser;
import entity.PhoneDevice;

public class Iphone implements MusicPlayer, WebBrowser, PhoneDevice{

    //Internet browser
    public void addPage() {
        System.out.println("Adding page...");
    }
    public void refreshPage() {
        System.out.println("Updating page...");
    }
    public void displayPage() {
        System.out.println("Showing page...");
    }

    // Music player
    public void selectMusic() {
        System.out.println("Selecting music...");
    }
    public void play() {
        System.out.println("Playing music...");
    }
    public void pause() {
        System.out.println("Paused music.");
    }

    // Telephone
    public void answer() {
        System.out.println("Answer the call");
    }
    public void call() {
        System.out.println("Calling...");
    }

    public static void main(String[] args) {
        System.out.println("CELULAR LIGADO");

    }
}
