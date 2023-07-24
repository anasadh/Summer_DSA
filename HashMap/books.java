package Summer_DSA.HashMap;
import java.util.*;

import DSA_Master.DSA.Hashmap;

class book{
    int id,quantity;
    String name,author,publisher;
    public book(int id, String name, String author, String publisher, int quantity){
        this.id = id;
        this.name = name;
        this.author = author;    
        this.publisher = publisher;    
        this.quantity = quantity;    
    }
}

public class books {

    public static void main(String[] args) {
        
        Map<Integer,book> map = new HashMap<Integer,book>();

        book b1 = new book(100,"let us c","ana","mika",3);
        book b2 = new book(101,"let us java","Shivu","miku",3);

        map.put(1, b1);
        map.put(2, b2);

        for(Map.Entry<Integer,book> entry : map.entrySet()){
            int key = entry.getKey();
            book b = entry.getValue();
            System.out.println(key + " "+ b.id+ " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}
