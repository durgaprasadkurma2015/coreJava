package $13Networking;

public class $1Networking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Example of using java.net package for networking
		try {
			// Create a URL object
			java.net.URL url = new java.net.URL("https://www.google.com/");
			
			// Open a connection to the URL
			java.net.URLConnection connection = url.openConnection();
			
			// Read data from the URL
			try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(connection.getInputStream()))) {
				String line;
				while ((line = reader.readLine()) != null) {
					System.out.println(line);
				}
			}
		} catch (java.io.IOException e) {
			System.out.println("IOException: " + e.getMessage());
		}
		
		// Example of using java.net.Socket for client-server communication
		
		try (java.net.Socket socket = new java.net.Socket("localhost", 8080)) {
			java.io.PrintWriter out = new java.io.PrintWriter(socket.getOutputStream(), true);
			java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(socket.getInputStream()));
			
			// Send a message to the server
			out.println("Hello, Server!");
			
			// Read the response from the server
			String response = in.readLine();
			System.out.println("Response from server: " + response);
		} catch (java.io.IOException e) {
			System.out.println("IOException: " + e.getMessage());
		}
		
		// End of main method

	}

}
