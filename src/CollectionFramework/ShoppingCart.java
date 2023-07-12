package CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;

//Business Class
public class ShoppingCart {
    HashSet<String> Product=new HashSet<>();
    LinkedHashSet<String> CartItems=new LinkedHashSet<>();
    {//Non-Static Block
        Product.add("TV");
        Product.add("MOBILE");
    }
    public void ShowProduct(){
        System.out.println("Product Name");
        System.out.println("------------------------------");
        for (String s:Product){
            System.out.println(s);
        }
    }
    public void addToCart(String name){
        boolean found=Product.contains(name);
        if (found){
            CartItems.add(name);
            System.out.println("Product Add Successfully");
        }else {
            System.out.println("Product Not Found");
        }
    }
    public void ViewCart(){
        System.out.println("Product Name");
        System.out.println("--------------------------");
        for (String s:CartItems){
            System.out.println(s);
        }
    }
    public void removeCart(String item){
        boolean found=CartItems.contains(item);
        if (found){
            CartItems.remove(item);
            System.out.println("Item Removed Successfully");
        }else {
            System.out.println("First Add To Cart");
        }
    }
}
