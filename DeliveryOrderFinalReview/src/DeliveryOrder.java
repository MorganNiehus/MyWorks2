import java.text.*;
public class DeliveryOrder {
	
	private String address;
	private long phone;
	private double cost;
	
	public DeliveryOrder(String address, long phone, double cost){
		this.address = address;
		this.phone = phone;
		this.cost = cost;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setPhone(long phone){
		this.phone = phone;
	}
	
	public String toString(){
		NumberFormat df = NumberFormat.getCurrencyInstance();
		String value;
		value = "Address: " + address + "\nPhone: " + phone + "\nCost: " + df.format(cost);
		return value;
	}

}
