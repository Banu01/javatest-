/**
 * Hashmap
 */
import java.util.HashMap;
public class Hashmap {

    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
hm.put(2, "hai");
hm.put(4,"hello");
hm.put(7,"welcome");
System.out.println(hm.size());
System.out.println(hm.remove("hello"));
System.out.println(hm);

for (Integer i:hm.keySet())
{
System.out.println(i);
}
    

for(String j:hm.values())
{
    System.out.println(j);
}

    }













}