/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package e1;

/**
 *
 * @author mandy
 */
public class Product implements java.io.Serializable {
        public String pid;
	public String pname;
	public int qty;
	public double price;

    public Product(){}
	public Product( String pname, int qty, double price) {
		this.pname = pname;
		this.qty = qty;
		this.price = price;
	}


        
        public void setPid(String pid) {
		this.pid = pid; 
	}

	public void setPname(String pname) {
		this.pname = pname; 
	}

	public void setQty(int qty) {
		this.qty = qty; 
	}

	public void setPrice(double price) {
	
                         
            this.price = price; 
            
	}

	public String getPid() {
		return (this.pid); 
	}

	public String getPname() {
		return (this.pname); 
	}

	public int getQty() {
		return (this.qty); 
	}

	public double getPrice() {
		return (this.price); 
	}
        
        public String toString() {
		String sep = System.getProperty("line.separator");
		StringBuffer buffer = new StringBuffer();
		buffer.append(sep);
		buffer.append("----- Product Detail ----- ");
		buffer.append(sep);
    		buffer.append("\tpnames = ");
		buffer.append(pname);
		buffer.append(sep);
		buffer.append("\tqty total = ");
		buffer.append(qty);
		buffer.append(sep);
		buffer.append("\tprice total = ");
		buffer.append(price);
		buffer.append(sep);
		return buffer.toString();
	}

}

