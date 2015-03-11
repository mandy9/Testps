/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package e1;
import java.util.Iterator;

/**
 *
 * @author mandy
 */
public class L1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Cart o=new Cart();

		o.addProduct(new Product("lenovo",12,120));
		o.addProduct(new Product("dell",4,140));
					
   
    
                System.out.println ("Cart Total : "+o.getCartPriceTotal()); 
                System.out.println ("Discount :" + o.discount() );
		final Iterator<Product> it = o.getCartDetails().iterator();
		while(it.hasNext()){		
			System.out.println (it.next());
		}
	}

}
 
    

