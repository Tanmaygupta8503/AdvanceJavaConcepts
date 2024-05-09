import java.io.*;
import java.net.*;
class MyClient{
	public static void main(String args[]) throws Exception{
		Socket s = new Socket("10.8.0.151",3333);
		DataInputStream din = new DataInputStream(s.getInputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		String str = "", str2 = "";
		while(!str.equals("stop")){
			str=br.readLine();
			dout.writeUTF(str);
			dout.flush();
			str2 = din.readUTF();
			System.out.println("Tanmay Says: " + str2);				
		}
		dout.close();
		s.close();

	}
}