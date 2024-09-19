import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

class ValidateCommand extends Exception {
	ValidateCommand(String message){
		super(message);
	}
}

public class Main {


	public static void main(String[] args) {

		String uri = args[0];

		URL url = null;

		try {
			url = new URL(uri);
			InputStream in = new BufferedInputStream(url.openStream());
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			byte[] buf = new byte[1024];
			int n = 0;
			while (-1!=(n=in.read(buf))){
				out.write(buf, 0, n);
			}
			out.close();
			in.close();
			byte[] response = out.toByteArray();
			FileOutputStream fos = new FileOutputStream("/home/julia/project/java&kotlin/java-manuall/download/result.jpg");
			fos.write(response);
			fos.close();
		} catch (Exception e){
			System.out.println(e.toString());
		}

	}
}
