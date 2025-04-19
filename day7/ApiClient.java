package week4.day7;

public class ApiClient {
	
	public void sendRequest(String endPoint)
	{
		System.out.println("Request send succesfully " + endPoint);
	}
	
	private void sendRequest(String endPoint, String requestBody, boolean requestStatus) {
		System.out.println(endPoint);
		System.out.println(requestBody);
		System.out.println(requestStatus);

	}

	public static void main(String[] args) {
		ApiClient clientObj = new ApiClient();
		clientObj.sendRequest("API Send");
		clientObj.sendRequest("API Send", "Request Successfull", false);

	}

}
