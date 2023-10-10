import java.util.Scanner;
package folder;

public class Manager {
    private String cool_message;
    Scanner sc = new Scanner(System.in);

    public Manager(CititorTastatura cititor) {
    }

    public String afiseazaMesaj() {
        return cool_message;
    }

    public String citesteMesaj() {
        cool_message=sc.nextLine();
    }

}