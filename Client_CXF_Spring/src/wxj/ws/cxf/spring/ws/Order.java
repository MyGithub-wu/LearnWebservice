
package wxj.ws.cxf.spring.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>order complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="order"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="no" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "order", propOrder = {
    "id",
    "no",
    "price"
})
public class Order {

    protected int id;
    protected int no;
    protected float price;

    /**
     * 获取id属性的值。
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * 获取no属性的值。
     * 
     */
    public int getNo() {
        return no;
    }

    /**
     * 设置no属性的值。
     * 
     */
    public void setNo(int value) {
        this.no = value;
    }

    /**
     * 获取price属性的值。
     * 
     */
    public float getPrice() {
        return price;
    }

    /**
     * 设置price属性的值。
     * 
     */
    public void setPrice(float value) {
        this.price = value;
    }

	@Override
	public String toString() {
		return "Order [id=" + id + ", no=" + no + ", price=" + price + "]";
	}
   
}
