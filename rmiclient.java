import java.rmi.*;
public class rmiclient {
    public static void main(String[] args) {
        try {
            rmiint obj = (rmiint) Naming.lookup("rmi://localhost/Hello");
            System.out.println(obj.display());
        } catch (Exception e) {
            
        }
    }
}
