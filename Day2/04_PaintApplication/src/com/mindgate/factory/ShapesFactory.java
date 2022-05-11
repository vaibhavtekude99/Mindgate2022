package com.mindgate.factory;

import com.mindgate.pojo.Circle;
import com.mindgate.pojo.Shapes;
import com.mindgate.pojo.Sqaure;
import com.mindgate.pojo.Triangle;

public class ShapesFactory {
    
     
     public static Shapes getShapes(int choice)
     {
    	 Shapes shapes=null;
    	 switch(choice)
    	 {
			case 1: {
				shapes = new Circle();
				break;
			}
			case 2: {
				shapes = new Triangle();
				break;
			}
			case 3: {
				shapes = new Sqaure();
				break;
    	   }

    	 }
    	 return shapes;
     }
}
