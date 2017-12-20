package DesignPattern.oo.behavioral.observer.marketSubscription;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FashionMarket market = new FashionMarket();		
User u1 = new User(market);
User u2 = new User(market);
User u3 = new User(market);
User u4 = new User();
u1.setUserName("user 1");
u2.setUserName("user 2");
u3.setUserName("user 3");
u4.setUserName("user 4");

market.dressAvaliable();
	}

}
