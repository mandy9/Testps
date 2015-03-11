/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package e1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author mandy
 */
public class Cart {
    private Map<String, Product> map;
//    public Cart() {}
    
    public Cart()
    { map = new HashMap<String, Product>();
    }

       
    public Collection<Product> getCartDetails(){
		return map.values();
	}
    
    public int productCount(){
		return map.size();
	}
    
    public boolean addProduct(Product p){
		if(map.containsKey(p.getPid())){
			Product p1 = map.get(p.getPid());
                        p1.setPname(p1.getPname()+ " , " + p.getPname());
			p1.setPrice(p1.getPrice()+p.getPrice());
			p1.setQty(p1.getQty()+p.getQty());
			return true;	
		}
		map.put(p.getPid(),p);
		return false;
	}
    
    
    public double getCartPriceTotal() {
    double price = 0.0d;
    Iterator<Product> iterator = getCartDetails().iterator();
    while(iterator.hasNext()){
      price+= iterator.next().getPrice();
      
         }
    return price;
  }
    
    /* functia de discount, ia cantitatea finala a produselor, iar daca aceasta este 
    mai mare decat 15, se va aplica un discount reprezentat de pretul impartit la 6 */
    
    public double discount()
    { 
        double newprice = 0;
        Product p=new Product();
        Product p1 = map.get(p.getPid());
        if (p1.getQty() > 15)
            newprice= (p1.getPrice()) / 6;
    return newprice;
    }

}
