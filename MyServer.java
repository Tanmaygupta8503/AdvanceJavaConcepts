import java.net.*;
import java.io.*;
class MyServer{
	public static void main(String args[]) throws Exception{
		ServerSocket ss = new ServerSocket(3333);
		Socket s = ss.accept();

		DataInputStream din = new DataInputStream(s.getInputStream()); // from network
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // from user
		DataOutputStream dout = new DataOutputStream(s.getOutputStream()); // for network
		String str = "", str2 = "";
		while(!str.equals("stop")){
			str = din.readUTF();
			System.out.println("Client Says: " + str);
			str2 = br.readLine();
			dout.writeUTF(str2);
			dout.flush();
		}
		din.close();
		s.close();
		ss.close();
	}
}
			
		
		
		