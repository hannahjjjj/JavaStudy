package ch06.sec14;

public class ShopService {
	
	//6장 18번
	private static ShopService instance = new ShopService();
	
	private ShopService() {}
	
	public static ShopService getInstance() {
		return instance;
	}
}
