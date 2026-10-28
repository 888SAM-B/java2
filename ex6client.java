import java.io.*;
import java.net.*;
public class ex6client {
    public static void main(String[] args) throws Exception{
        
        Socket s = new Socket("localhost",3333);
        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1="",str2="";
        while (!str2.equals("stop")){
           
            str2=br.readLine();
            out.writeUTF(str2);
            out.flush();
            str1=in.readUTF();
            System.out.println("Client Says :"+str1);
        }
        in.close();
        s.close();
        
        
    }
}
