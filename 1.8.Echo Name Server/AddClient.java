import java.rmi.*;
public class AddClient {
public static void main(String args[]) { 
try {
// Get reference to the remote object
String addServerURL = "rmi://" + args[0] + "/AddServer"; 
AddServerIntf addServerIntf =
(AddServerIntf) Naming.lookup(addServerURL);
System.out.println("Your Name is : " + args[1]); 
String d1 =(args[1]);
System.out.println(":) " + addServerIntf.hel(d1));
} 
catch (Exception e) { System.out.println("Exception: "+ e);
}}}

// Terminal 1 
// javac *.java 
// rmiregistry
// Terminal 2
// java AddServer
// Terminal 3 
// java AddClient 127.0.0.1 hello