package com.satya.test;

/*enum Code{  
    one,two,three,four,five;  
    public static void codeState(Code code){  
      switch(code){  
         case one:  
           System.out.println(Code.one);  
           break;  
        case two:  
           System.out.println(Code.two);  
           break;  
       case three :  
           System.out.println(Code.one);  
           break;  
    }   
 }  
}  

public class ClassTest{  
 
     public static void main(String... str){  
         Code code = Code.three;  
         Code.codeState(code);  
     }  

}  */


/*class A1 {  
    int i = 10;  
      
    public void demo(){  
        System.out.println("Inside class A");  
    }  
}  
  
class B1 extends A1{  
    int i = 20;  
    public void demo(){  
        System.out.println("Inside class B");  
    }  
}  
public class ClassTest {  
  
    public static void main(String[] args) {  
        A1 a = new B1();  
        System.out.println(a.i);  
        a.demo();  
    }  
} */



/*public class ClassTest  
{  
 public static void main(String[] args)  
 {  
   double volatile = 21+3.775;  
   System.out.println(volatile);  
  }  
}  */


/*public class ClassTest {  
	   static int k = 1;  
	   {  
	      k = k * 2;  
	    }  
	   public static void main(String args[]){   
		   ClassTest m = new ClassTest();  
	      System.out.println(k);  // 2
	   }  
	}  */


/*class VarArgs{  
    public void testMethod(short num1){  
       System.out.println("Java 4");  
    }  
    public void testMethod(short... num1){  
       System.out.println("Java 5");  
    }   
    public static void main(String... str){  
       new VarArgs().testMethod(3);  //change method short to int     
    }  
}  */



/*public  class ClassTest{  
    private static Integer count;  
    public static void main(String... str){  
        
           System.out.println("Static variable default value is "+count);  
        
    }  
}  */  ///default is null


/*public class ClassTest {  
    public static void main(String... str){   
       Double double = str[0];  
       System.out.println("Command Line Argument :" + double );  
}  
}*/


/*public class ClassTest {  
    public static void main(String[] args){  
        String switchVal = null;  
        switch(switchVal){  
            case "null" : System.out.println("Null");  
            case "monday": System.out.println("Monday");  
            case "tuesday": System.out.println("Tuesday");  
            case "wednesday": System.out.println("Wednesday");  
            case "thursday": System.out.println("Thursday");  
            case "friday": System.out.println("Friday");  
            case "saturday": System.out.println("Saturday");  
            case "sunday": System.out.println("Sunday");  
             
        }  
    }  
}  */


/*public class ClassTest{  
    public void ClassTest(){  
        System.out.println("Constructor1");  
    }  
    public ClassTest(){  
        System.out.println("Constructor2");  
    }  
    public static void main(String[] args){  
    	ClassTest t5 = new ClassTest();  
   }  
}  */



/*public class ClassTest extends Asasasa{  
	ClassTest() throws Exception{  
        System.out.println("Main Class");  
    }  
    public static void main(String args[]) throws Exception{  
    	ClassTest t = new ClassTest();  
   }  
}  
class Asasasa{  
	Asasasa() throws Exception{  
         System.out.println("A Class");  
     }  
}  */



/*public class ClassTest {  
    public void m1() {System.out.print("A.m1,");}  
    protected void m2() {System.out.print("A.m2,");}  
    private void m3() {System.out.print("A.m3,");}  
    void m4() {System.out.print("A.m4,");}  
}  
class B {  
    public static void main(String[] args) {  
    	ClassTest a = new ClassTest();  
    a.m1(); // 1  
    a.m2(); // 2  
    a.m3(); // 3  
    a.m4(); // 4  
    }  
  
}  */  ///correct



/*public class ClassTest {  
	   static{  
	      System.out.println("Static");  
	   }  
	  {  
	      System.out.println("Instance");  
	   }  
	   public void Test1(){  
	      System.out.println("Constructor");  
	   }  
	   public static void main(String[] args) {  
		   ClassTest t = null;  
	   }  
	}  */ //  static block will be executed 

 




/*public class ClassTest {  
	   static{  
	      System.out.println("Static");  
	   }  
	  {  
	      System.out.println("Instance");  
	   }  
	   public void ClassTest(){  
	      System.out.println("Constructor");  
	   }  
	   public static void main(String[] args) {  
		   ClassTest t = null;  
	   }  
	}*/  // static


