import java.util.Comparator;

/**
 * Compare
 */
 class Compare implements Comparator {

    int age;
    String name;
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @return the age
     */
    public int getage() {
        return age;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @param age the age to set
     */
    public void setage(int age) {
        this.age = age;
    }
public static void main(String[] args) {
    class AgeComparator {  
        
//public static void main(String[] args) {
        public int compare(Object o1,Object o2){  
        Compare s1=(Compare)o1;  
        Compare s2=(Compare)o2;  
          
        if(s1.age==s2.age)  
        return 0;  
        else if(s1.age>s2.age)  
        return 1;  
        else  
        return -1;  
        }  
        }   
    }
@Override
public int compare(Object o1, Object o2) {
	return 0;
}
}

