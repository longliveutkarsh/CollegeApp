/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author utkarsh
 */
import java.applet.*;
import java.awt.event.*;
import java.awt.*;


public class collegeapp extends Applet implements  ActionListener{
    CheckboxGroup cg1;
    Checkbox BTECH, BBA, LLB;
    
      
    public void init() {
        setBackground(Color.pink);

    cg1=new CheckboxGroup();
    BTECH= new Checkbox("B.Tech                                                                    ",cg1,false);
     BBA= new Checkbox( "B.B.A                                                                      ",cg1,false);
     LLB= new Checkbox( "L.L.B                                                                      ",cg1,false);
     
     add(BTECH);
     
     add(BBA);
     add(LLB);
      Button n= new Button(" Next");
              add(n);
    // BTECH.addItemListener(this);
    // BBA.addItemListener(this);
    // LLB.addItemListener(this);
     
    }
    /*public Collegeapp()
    {
        

         n.addActionListener(new ActionListener(){
    	  
           public void actionPerformed(ActionEvent ae)
           {
               Frame f= new Frame();
               
               // f.setLayout(null);
                
               
		 Button c1= new Button("Amity School Of Engineering and Technology");
		 Button c2=new Button("bharti Vidyapeeth Institute Of Technology");
		 Button c3=new Button("Guru Teg Bahadur institute of Technology");
                 Button c4=new Button("Maharaja Agrasen Institute of Technology");
                 Button c5=new Button("Maharaja Surajmal Institute of Technology");
                 Button c6=new Button("University school Of engineering and Technology");
		 f.add(c1);
		 f.add(c2);
                 f.add(c3);
                 f.add(c4);
                 f.add(c5);
                 f.add(c6);
                 f.setVisible(true);
            
           }
       
           }
                );
    }
  /*  public static void main (String g[])throws InstantiationException, IllegalAccessException
	{ 
           Collegeapp s=new Collegeapp();
           
	// stu.setSize(new Dimension(500,500));
	 //stu.setTitle("student registration");
	 s.setVisible(true);
        
	}
    
   /* @Override
    public void itemStateChanged(ItemEvent e) {
      repaint(); 
    }
*/
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
       //To change body of generated methods, choose Tools | Templates.
    }
 
}

