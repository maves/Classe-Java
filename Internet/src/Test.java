import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

public class Test {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		try {
			 URL u = new URL("http://www.android.com/user.html");
			 System.out.println("The protocol is " + u.getProtocol());
			 System.out.println("The host is " + u.getHost());
			 System.out.println("The port is " + u.getPort());
			 System.out.println("The file is " + u.getFile());
			 System.out.println("The anchor is " + u.getRef());
			}
			catch (MalformedURLException e) { 
				System.out.println(e);
				String ciao = "ciao";
			}
		
		System.out.println();
		
		String dom = "www.sun.com";
		
		try {
			InetAddress loc=InetAddress.getByName(dom);
			System.out.println("IP di "+dom+" : "+loc.getHostAddress());
			}
		catch (UnknownHostException e)
			{System.out.println("Dominio non esiste "+dom);
			}
		
		try {
			InetAddress loc=InetAddress.getLocalHost();
			System.out.println("IP locale: "+loc.getHostAddress());
			System.out.println("Nome locale: "+loc.getHostName());
		}
//		catch (UnknownHostException e)
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		};
		
		//////////////////////////////////////////////

		System.out.println();
		
		try {
//			URL u = new URL("http://www.expo.it/");
			URL u = new URL("http://www.microsoft.it/");
			URLConnection uc = u.openConnection();
			uc.connect();
			String key = null;
			
			for (int n = 1; (key = uc.getHeaderFieldKey(n)) != null; n++) {
				System.out.println(key + ": " + uc.getHeaderField(key));
			}
			
		} catch (IOException e) {
			System.err.println(e);
		}
		
		System.out.println("\nfine");
		
	}

}
