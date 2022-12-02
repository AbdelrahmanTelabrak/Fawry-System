package first_sprint;

import java.util.ArrayList;

import order.Order;

public class Client extends User{
	
	protected double walletBalance;
	protected ArrayList<Order> ordersList ;

//	private Admin admin;
    boolean state;
    public void update(boolean state) {
	    
    }
    
	public Client(String email, String type, String password, String username, double walletBalance) {
		super(email, type, password, username);
		this.walletBalance = walletBalance;
		ordersList = new ArrayList<>();
	}

	public double getWalletBalance() {
		return walletBalance;
	}

	@Override
	public String toString() {
		return "Client [walletBalance=" + walletBalance + ", username=" + username + ", email=" + email + ", password="
				+ password + ", type=" + type + "]";
	}
	

	public void addOrder(Order order) {
		ordersList.add(order);
	}

	public ArrayList<Order> getOrdersList() {
		return ordersList;
	}
	
}
