import java.util.*;
  abstract class C1 {
             abstract void f1();
	     abstract void f2();
  };
  /*this is default class*/ 
  abstract class C2 extends C1 {
          
          void f1() {
                     System.out.println("f1-C2-orignal");
		}
  };
 class C3 extends C2  {
            
          void f1 ()  {
              		super.f1 ();
	      		System.out.println("f1-c3-overriden");
            }
           void f2 () {
                       System.out.println("c2-c3");
             }
           void f3 () {
			System.out.println ("f3-C3-SPECIALLY DEFINED");
		} 
 };
  class ss
    {
        public static void main(String args[])
           {
            C3 o3=new C3();
             o3.f1();
             o3.f2();
             o3.f3();
             C2 o2=new C3();
             o2.f1();
	     o2.f2();
            C1 o1=new C3();
             o1.f1();
             o1.f2();
            // o1.f3();
         }
 };
