import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Banu
 */
public class Banu {

    int id,price;
    String name;
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return id+name+price;
    }
    public static void main(String[] args) {
   
 ArrayList<Banu> al=new ArrayList<Banu>();
 Banu b1=new Banu();


b1.setId(2);
b1.setName("xxx");
b1.setPrice(200);
al.add(b1);

Banu b2=new Banu();
b2.setId(6);
b2.setName("xxxyyyy");
b2.setPrice(100);
al.add(b2);

//al.stream().map(x->x.getId()+x.getPrice()).forEach(System.out::println);
System.out.println("names");
List<Integer> s=al.stream().map(x->x.getId()).collect(Collectors.toList());
System.out.println(s);

System.out.println("action");
        long rr = al.stream().filter(k -> k.getPrice() < 200).count();
System.out.println(rr);

    }

}