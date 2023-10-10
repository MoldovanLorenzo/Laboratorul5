package folder;
import java.util.Scanner;
public class CititorTastatura {
    private String message;
    private String source;
    Scanner sc = new Scanner(System.in);

    public CititorTastatura()
    {
    }

    public CititorTastatura(String message, String source) {
        this.message = message;
        this.source = source;
    }

    public void citesteTastatura() {
        message=sc.nextLine();

    }
}
