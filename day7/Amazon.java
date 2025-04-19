package week4.day7;

public class Amazon extends CanaraBank{

	@Override
	public void cashOnDelivery() {
		System.out.println("Cash on delivery");
		
	}

	@Override
	public void upiPayments() {
		System.out.println("UPI Payment");
		
	}

	@Override
	public void cardPayments() {
		System.out.println("Card Payment");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("Card Payment");
		
	}
	
	public static void main(String[] args) {
		Amazon PayObj = new Amazon();
		PayObj.cardPayments();
		PayObj.cashOnDelivery();
		PayObj.internetBanking();
		PayObj.upiPayments();
		PayObj.recordPaymentDetails();
	}

}
