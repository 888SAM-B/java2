
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class rmiserver extends UnicastRemoteObject implements rmiint {

    public rmiserver() throws RemoteException {
        super();
    }

    public String display() throws RemoteException {
        return "Hello from RMI";
    }

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            rmiserver obj = new rmiserver();
            Naming.rebind("rmi://localhost:1099/Hello", obj);
            System.out.println("Server ready");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
