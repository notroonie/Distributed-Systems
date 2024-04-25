import java.rmi.*;
import java.rmi.registry.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class C1 {
    public static void main(String[] args) {
        try {
            ServerImpl serverImpl = new ServerImpl(LocalTime.parse(args[1], DateTimeFormatter.ofPattern("HH:mm:ss")));
            Naming.rebind(args[0], serverImpl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// terminal 1:
// javac *.java
// rmiregistry
// terminal 2:
// java C1 c1 03:25:00
// terminal 3:
// java C1 c2 03:00:00
// terminal 4:
// java C1 c3 02:55:00
// terminal 5:
// java MainClock c1 c2 c3
