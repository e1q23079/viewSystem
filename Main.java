public class Main {
    public static void main(String[] args) {

        View view = new View(180, 180);

        // Hide window title
        view.setUndecorated(true);

        // Set window location
        view.setLocation(550, 0);

        // Pin window to the front
        view.setAlwaysOnTop(true);

        // Show Image
        view.showImage(view.setFile());

        // Show Window
        view.setVisible(true);

    }
}