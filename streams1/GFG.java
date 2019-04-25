/**
 * Hashcode
//  */
// public class Hashcode {
//     int id;
//     String name;
    
//     public Hashcode(int i, String string) {
//         this.id=id;
//         this.name=name;
//     }

//     /**
//      * @return the id
//      */
//     public int getId() {
//         return id;
//     }
// /**
//  * @param id the id to set
//  */
// public void setId(int id) {
//     this.id = id;
// }
// /**
//  * @return the name
//  */
// public String getName() {
//     return name;
// }
// /**
//  * @param name the name to set
//  */
// public void setName(String name) {
//     this.name = name;
// }


// @Override
// public String toString() {
//     return id+name;
// }

//     public static void main(String[] args) {
        
// Hashcode mm=new Hashcode(2,"jai");
// Hashcode mmm=new Hashcode(2,"jai");
// if(mm.equals(mmm))
// {
//     System.out.println("equal");

// }else{
//     System.out.println("not equal");
// }

//  System.out.println(mm+" "+mmm);
//      }
// }






  
class Geek  
{ 
      
    public String name; 
    public int id; 
          
    Geek(String name, int id)  
    { 
              
        this.name = name; 
        this.id = id; 
    } 
     @Override
    public boolean equals(Object obj) 
    { 
 if(this == obj) 
    return true; 
          
     if(obj == null || obj.getClass()!= this.getClass()) 
            return false; 
          
        // type casting of the argument.  
        Geek geek = (Geek) obj; 
        return (geek.name == this.name && geek.id == this.id); 
    } 
      
    @Override
    public int hashCode() 
    { 
           return this.id; 
    } 
      
} 
  
//Driver code 
class GFG 
{ 
       public static void main (String[] args) 
    { 
       
        Geek g1 = new Geek("aa", 1); 
        Geek g2 = new Geek("aa", 1); 
          
      
        // if(g1.hashCode() == g2.hashCode()) 
        // { 
  
            if(g1 == g2) 
                System.out.println("Both Objects are equal. "); 
            else
                System.out.println("Both Objects are not equal. "); 
      
        } 
    //     else
    //     System.out.println("Both Objects are not equal. ");  
    // }  
} 