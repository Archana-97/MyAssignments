package week4.day7;

public class JavaConnection implements DatabseConnection {
	

	public static void main(String[] args) {
		JavaConnection connectionStatus = new JavaConnection();
		connectionStatus.connect();
		connectionStatus.disconnect();
		connectionStatus.executeUpdate();

	}

	@Override
	public void connect() {
		System.out.println("Database connected");

	}

	@Override
	public void disconnect() {
		System.out.println("Database disconnected");
	}

	@Override
	public void executeUpdate() {
		System.out.println("Execution status");
	}

}
