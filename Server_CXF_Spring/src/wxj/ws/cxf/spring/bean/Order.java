package wxj.ws.cxf.spring.bean;

public class Order {
    private int id;
    private int no;
    private float price;
    
	public Order(int id, int no, float price) {
		super();
		this.id = id;
		this.no = no;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", no=" + no + ", price=" + price + "]";
	}
    
}
