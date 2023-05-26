package CollectionPract;

import java.util.*;

public class VectorPractice {

	public static void main(String[] args) {

		Vector v1 = new Vector();
		v1.add("yadadri");
		v1.add("temple");
		v1.add("development");
	  	
		 System.out.println(v1);
		 
	   Vector v2 = new Vector();
	 
	   v2.add("kcr");
	   v2.add("ktr");
	  // v2.add("yadadri");
	   
	 /*  for (int i=0; i<v2.size(); i++) {
		   v1.add(v2.get(i));
	   } */
	   
	   Vector v3 = new Vector();
		 
	   v3.add("ktr");
	   v3.add("kcr");
	   
	  v1.addAll(0, v2);
	//  v1.addAll(v2);
	  System.out.println(v1);
	  	    
	  	
	  	   // System.out.println(v1.get(2));
	  	     
	  	  //  v1.remove(1);
	  	    //System.out.println(v1);
	  	  //  v1.removeAll(v2);
	  	   // System.out.println(v1);
	  	    
	  	  //  System.out.println(v1.contains("ktr"));
	  	   // System.out.println(v1.containsAll(v2));
	  	//  System.out.println(v1.containsAll(v3));
	  
          v1.set(1, "dad");
          System.out.println(v1);
          System.out.println(v1.get(1)); 
    
    //      System.out.println(v1.indexOf("yadadri"));
          System.out.println(v1.lastIndexOf("yadadri"));
          System.out.println(v1.firstElement());
          System.out.println(v1.lastElement());


	}
}
