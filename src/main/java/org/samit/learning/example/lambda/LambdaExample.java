package org.samit.learning.example.lambda;

public class LambdaExample {
	/*
	 * 	() -> {  
			//Body of no parameter lambda  
		}  
		
		One Parameter Syntax
		
		(p1) -> {  
			//Body of single parameter lambda  
		}  
		
		Two Parameter Syntax
		
		(p1,p2) -> {  
			//Body of multiple parameter lambda  
		}  
	 * */
	
	public static void main(String[] args) {
		int width=10;
		
		//non lambda way
		Drawable d=new Drawable(){  
            public void draw(){System.out.println("Drawing "+width);}  
        };
        
        d.draw();
        
        //lambda way
        Drawable d2=()->{  
            System.out.println("Drawing "+width);  
        };
        
        d2.draw();
        
        Sayable s=()->{  
            return "I have nothing to say.";  
        };
        
        System.out.println(s.say());
        s.hi();
        
        Math m = (a, b) -> {
        	return (a+b);
        };
        
        System.out.println(m.add(10, 15));
        
	}
}
