/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author utkarsh
 */
import java.awt.*;
import java.applet.*;


public class collegeappnext extends Applet {
    Button c1,c2,c3,c4,c5,c6 ;
    public void init()
    {
        setBackground(Color.pink);
	        

		
		 Button c1= new Button("Amity School Of Engineering and Technology");
		 Button c2=new Button("bharti Vidyapeeth Institute Of Technology");
		 Button c3=new Button("Guru Teg Bahadur institute of Technology");
                 Button c4=new Button("Maharaja Agrasen Institute of Technology");
                 Button c5=new Button("Maharaja Surajmal Institute of Technology");
                 Button c6=new Button("University school Of engineering and Technology");
		 add(c1);
		 add(c2);
                 add(c3);
                 add(c4);
                 add(c5);
                 add(c6);
}
}