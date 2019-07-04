package com.prasanta;/* This is a sample voting system of the Philippines
 * It illustrate how the should the vote is being counted
 * In this sample program there must only 12 senators to be voted each and everytime
 * So I made very complicated error handling about on it but as a result it works..
 * It is too long but as you go over the program it is simple and readable..
 * If there are questions or comments about this Voting System..
 * Just send a message at smashiton@yahoo.com
*/


import java.awt.event.*;
import java.awt.*;
import javax.swing.JOptionPane;
import java.applet.Applet;

// To run this program the classname must be the same with its filename 
public class VotingSystem3 extends Frame implements ActionListener, ItemListener
{
	
	//This are the variables i use in the program
	Label lbl1 =  new Label("CANDIDATES");
	
	Label president =  new Label("PRESIDENT");
	Choice	pres  = new Choice();
	
	Label vpresident = new Label("VICE-PRESIDENT");
	Choice  vpres = new Choice();

    Label senators  =  new Label("SENATORS");
	Checkbox  cnd1  =  new Checkbox("A");
	Checkbox  cnd2  =  new Checkbox("B");
	Checkbox cnd3   =  new Checkbox("C");
	Checkbox cnd4   =  new Checkbox("D");
	Checkbox cnd5   =  new Checkbox("E");
	Checkbox cnd6   =  new Checkbox("F");
	Checkbox cnd7   =  new Checkbox("G");
	Checkbox cnd8   =  new Checkbox("H");
	Checkbox cnd9   =  new Checkbox("I");
    Checkbox cnd10  =  new Checkbox("J");
    Checkbox cnd11  =  new Checkbox("K");
    Checkbox cnd12  =  new Checkbox("L");
    Checkbox cnd13  =  new Checkbox("M");
    Checkbox cnd14  =  new Checkbox("N");
    Checkbox cnd15  =  new Checkbox("O"); 
    Checkbox cnd16  =  new Checkbox("P");		

	Button smit = new Button("Submit");

	int vcnd1=0, vcnd2=0, vcnd3=0, vcnd4=0, vcnd5=0, vcnd6=0, vcnd7=0, vcnd8=0, vcnd9=0, vcnd10=0, vcnd11=0, vcnd12=0, vcnd13=0, vcnd14=0, vcnd15=0, vcnd16=0;
	public int tvcnd1=0, tvcnd2=0, tvcnd3=0, tvcnd4=0, tvcnd5=0, tvcnd6=0, tvcnd7=0, tvcnd8=0, tvcnd9=0, tvcnd10=0, tvcnd11=0, tvcnd12=0,  tvcnd13=0, tvcnd14=0, tvcnd15=0, tvcnd16=0;
	public int tlvcnd1=0, tlvcnd2=0, tlvcnd3=0, tlvcnd4=0, tlvcnd5=0, tlvcnd6=0, tlvcnd7=0, tlvcnd8=0, tlvcnd9=0, tlvcnd10=0, tlvcnd11=0, tlvcnd12=0,  tlvcnd13=0, tlvcnd14=0, tlvcnd15=0, tlvcnd16=0;
	
	int only12sen = 0;

	int vopres1=0, vopres2=0, vopres3=0;
	int tvopres1=0, tvopres2=0, tvopres3=0;
	int tlvopres1=0, tlvopres2=0, tlvopres3=0;
	
	int only1pres = 0;

	int vvpres1=0, vvpres2=0, vvpres3=0;
	int tvvpres1=0, tvvpres2=0, tvvpres3=0;
	int tlvvpres1=0, tlvvpres2=0, tlvvpres3=0;

	int only1vpres = 0;

	Label tally = new Label("TALLY OF VOTES");

	Label tallypres = new Label("PRESIDENT");
	Label rpres1 = new Label("Estrada");
	Label rpres2 = new Label("Arroyo");
	Label rpres3 = new Label("Lacson");
	
	Label tallyvpres = new Label("VICE-PRESIDENT");
	Label rvpres1 = new Label("Legarda");
	Label rvpres2 = new Label("De Castro");
	Label rvpres3 = new Label("Angara");

	Label tallysen = new Label("SENATORS");
	Label rcnd1 = new Label("A");
	Label rcnd2 = new Label("B");
	Label rcnd3 = new Label("C");
	Label rcnd4 = new Label("D");
	Label rcnd5 = new Label("E");
	Label rcnd6 = new Label("F");
	Label rcnd7 = new Label("G");
	Label rcnd8 = new Label("H");
	Label rcnd9 = new Label("I");
	Label rcnd10 = new Label("J");
	Label rcnd11= new Label("K");
	Label rcnd12 = new Label("L");
	Label rcnd13 = new Label("M");
	Label rcnd14 = new Label("N");	
	Label rcnd15 = new Label("O");
	Label rcnd16 = new Label("P");

	TextField nvpres1 =  new TextField(20);
	TextField nvpres2 =  new TextField(20);
	TextField nvpres3 =  new TextField(20);

	TextField nvvpres1 =  new TextField(20);
	TextField nvvpres2 =  new TextField(20);
	TextField nvvpres3 =  new TextField(20);

	TextField nvcnd1 =  new TextField(20);
	TextField nvcnd2 =  new TextField(20);
	TextField nvcnd3 =  new TextField(20);
	TextField nvcnd4 =  new TextField(20);
	TextField nvcnd5 =  new TextField(20);
	TextField nvcnd6 =  new TextField(20);
	TextField nvcnd7 =  new TextField(20);
	TextField nvcnd8 =  new TextField(20);
	TextField nvcnd9 =  new TextField(20);
	TextField nvcnd10 =  new TextField(20);
	TextField nvcnd11 =  new TextField(20);
	TextField nvcnd12 =  new TextField(20);
	TextField nvcnd13 =  new TextField(20);
	TextField nvcnd14 =  new TextField(20);
	TextField nvcnd15 =  new TextField(20);
	TextField nvcnd16 =  new TextField(20);

	Button cancel = new Button("Back");	
	
	VotingSystem3()
	{
		
		view();				
		
		add(lbl1);
		
		add(president); 
		pres.add("---------");
		pres.add("Arroyo");
		pres.add("Estrada");
		pres.add("Lacson");
		add(pres);		pres.addItemListener(this);
	
		
		add(vpresident);
		vpres.add("--------");
		vpres.add("Legarda");
		vpres.add("De Castro");
		vpres.add("Angara");
		add(vpres);		vpres.addItemListener(this);
		
		add(senators);		

		add(cnd1);		cnd1.addItemListener(this);
		add(cnd2);		cnd2.addItemListener(this);
		add(cnd3);		cnd3.addItemListener(this);
		add(cnd4);		cnd4.addItemListener(this);
		add(cnd5);		cnd5.addItemListener(this);
		add(cnd6);		cnd6.addItemListener(this);
		add(cnd7);		cnd7.addItemListener(this);
		add(cnd8);		cnd8.addItemListener(this);
		add(cnd9);		cnd9.addItemListener(this);
		add(cnd10);		cnd10.addItemListener(this);
		add(cnd11);		cnd11.addItemListener(this);
		add(cnd12);		cnd12.addItemListener(this);
		add(cnd13);		cnd13.addItemListener(this);
		add(cnd14);		cnd14.addItemListener(this);
		add(cnd15);		cnd15.addItemListener(this);
		add(cnd16);		cnd16.addItemListener(this);
		

		add(smit);		smit.addActionListener(this);

	addWindowListener(new WindowAdapter()
	{	
		public void windowClosing(WindowEvent e)
		{
				System.exit(0);
		}
	});

	
	}
		
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==smit)
		{	
			only12sen = vcnd1 + vcnd2 + vcnd3 + vcnd4 + vcnd5 + vcnd6 + vcnd7 + vcnd8 + vcnd9 + vcnd10 + vcnd11 + vcnd12 + vcnd13 + vcnd14 + vcnd15 + vcnd16;
			only1pres = vopres1 + vopres2 + vopres3;
			only1vpres = vvpres1 + vvpres2 + vvpres3; 
 			
			if(only12sen>12)  // It checks if there are more than 12 senators have been selected
			{

				JOptionPane.showMessageDialog(null,"Only 12 senators to be choosen");
				resetsen();
				errorsen();
				only12sen=0;
			}

			else if(only1pres>1) // It checks that there must be 1 president to be choose
			{
				JOptionPane.showMessageDialog(null,"Becareful to choose President. Select only once!!!");
				resetpres();
				errorpres();
				only1pres=0;
			}

			else if(only1vpres>1) // It checks that there must be 1 vice-president to be choose
			{
				JOptionPane.showMessageDialog(null,"Becareful to choose Vice-President. Select only once!!!");
				resetvpres();
				errorvpres();
				only1vpres=0;
			}

			else
			{
				SUB();
				resetsen();
				resetpres();
				resetvpres();
				unedit();
				cancel.setEnabled(true);
			}
		}
		    
			
	}
	
	public void itemStateChanged(ItemEvent x)
	{

		// It recognized if the checkbox have been choose					
	
		if(cnd1.getState()==true)
			 vcnd1 = 1;
			 		
		if(cnd2.getState()==true)
		  vcnd2 =  1; 
		  		
		if(cnd3.getState()==true)
		  vcnd3 = 1; 
		  		
		if(cnd4.getState()==true)
		    vcnd4 =  1;
					
		if(cnd5.getState()==true)
		   vcnd5 =   1; 
					
		if(cnd6.getState()==true)
		   vcnd6 =   1; 
			
		if(cnd7.getState()==true)
		   vcnd7 =  1; 
					
		if(cnd8.getState()==true)
		  vcnd8 =   1; 
					
		if(cnd9.getState()==true)
		  vcnd9 = 1; 
					
		if(cnd10.getState()==true)
		  vcnd10 =  1; 
					
		if(cnd11.getState()==true)
		  vcnd11 =  1; 
					
		if(cnd12.getState()==true)
		  vcnd12 =  1; 
					
		if(cnd13.getState()==true)
		   vcnd13 =  1; 
					
		if(cnd14.getState()==true)
		  vcnd14 = 1; 
			

		if(cnd15.getState()==true)
		   vcnd15 =  1;
					
		if(cnd16.getState()==true)
		  vcnd16 =   1;
			

		if(pres.getSelectedIndex()==1)
			vopres1 = 1;
		else if(pres.getSelectedIndex()==2)
			vopres2 = 1;
		else if(pres.getSelectedIndex()==3)
			vopres3 =  1;

		
	
		if(vpres.getSelectedIndex()==1)
			vvpres1 = 1;
		else if(vpres.getSelectedIndex()==2)
			vvpres2 = 1;
		else if(vpres.getSelectedIndex()==3)
			vvpres3 = 1; 
		
	} 

	void view()
	{
		setLayout(null);
		
		lbl1.setBounds(120,50,100,20);			
		
		president.setBounds(20,80,100,20);	
		pres.setBounds(130,80,100,20);

		vpresident.setBounds(20,120,100,20);
		vpres.setBounds(130,120,100,20);	

		senators.setBounds(120,150,100,20);
		cnd1.setBounds(20,180,100,20);
		cnd2.setBounds(20,200,100,20);
		cnd3.setBounds(20,220,100,20);
		cnd4.setBounds(20,240,100,20);
		cnd5.setBounds(20,260,100,20);
		cnd6.setBounds(20,280,100,20);
		cnd7.setBounds(20,300,100,20);
		cnd8.setBounds(20,320,100,20);
		cnd9.setBounds(160,180,100,20);
		cnd10.setBounds(160,200,100,20);
		cnd11.setBounds(160,220,100,20);
		cnd12.setBounds(160,240,100,20);
		cnd13.setBounds(160,260,100,20);
		cnd14.setBounds(160,280,100,20);
		cnd15.setBounds(160,300,100,20);
		cnd16.setBounds(160,320,100,20);
		
		smit.setBounds(100,350,100,20);
	}

	void unedit()
	{
		pres.setEnabled(false);
		vpres.setEnabled(false);
		
		cnd1.setEnabled(false);
		cnd2.setEnabled(false);
		cnd3.setEnabled(false);
		cnd4.setEnabled(false);
		cnd5.setEnabled(false);
		cnd6.setEnabled(false);
		cnd7.setEnabled(false);
		cnd8.setEnabled(false);
		cnd9.setEnabled(false);
		cnd10.setEnabled(false);
		cnd11.setEnabled(false);
		cnd12.setEnabled(false);
		cnd13.setEnabled(false);
		cnd14.setEnabled(false);
		cnd15.setEnabled(false);
		cnd16.setEnabled(false);

		smit.setEnabled(false);
		
	}


	void resetsen()
	{
		
		
		vcnd1=0;
		vcnd2=0;
		vcnd3=0;
		vcnd4=0;
		vcnd5=0;
		vcnd6=0;
		vcnd7=0;
		vcnd8=0;
		vcnd9=0;
		vcnd10=0;
		vcnd11=0;
		vcnd12=0;
		vcnd13=0;
		vcnd14=0;
		vcnd15=0;
		vcnd16=0;
	}

	void resetpres()
	{
		vopres1=0;
		vopres2=0;
		vopres3=0;
	}

	void resetvpres()
	{
	
		vvpres1=0;
		vvpres2=0;
		vvpres3=0;
	}
		
	



	public static void main(String args[])
	{
		VotingSystem3 counting = new VotingSystem3();
		 counting.setSize(300,500);
		 counting.setVisible(true);
	}


 
	public class Submit extends Frame implements ActionListener   
	{	
		
	Submit()
	 {
	submitview();
	//computation();
	submitresult();
	uneditresult();
	
	add(tally);
	
	add(tallypres);
	add(rpres1);	add(nvpres1);
	add(rpres2);	add(nvpres2);
	add(rpres3);	add(nvpres3);

	add(tallyvpres);
	add(rvpres1);	add(nvvpres1);
	add(rvpres2);	add(nvvpres2);
	add(rvpres3);	add(nvvpres3);
	
	add(tallysen);
	add(rcnd1);		add(nvcnd1);
	add(rcnd2);		add(nvcnd2);
	add(rcnd3);		add(nvcnd3);
	add(rcnd4);		add(nvcnd4);
	add(rcnd5);		add(nvcnd5);
	add(rcnd6);		add(nvcnd6);
	add(rcnd7);		add(nvcnd7);
	add(rcnd8);		add(nvcnd8);
	add(rcnd9);		add(nvcnd9);
	add(rcnd10);	add(nvcnd10);
	add(rcnd11);	add(nvcnd11);
	add(rcnd12);	add(nvcnd12);
	add(rcnd13);	add(nvcnd13);
	add(rcnd14);	add(nvcnd14);
	add(rcnd15);	add(nvcnd15);
	add(rcnd16);	add(nvcnd16);

	add(cancel);	cancel.addActionListener(this);
	
	addWindowListener(new WindowAdapter()
	{	
		public void windowClosing(WindowEvent e)
		{
				System.exit(0);
		}
	});
	

	 }

	void submitview()
	{
		setLayout(null);
		
		tally.setBounds(85,30,150,20);
		
		tallypres.setBounds(50,50,100,20);
		rpres1.setBounds(50,70,100,20);		nvpres1.setBounds(150,70,50,20);
		rpres2.setBounds(50,90,100,20);		nvpres2.setBounds(150,90,50,20);
		rpres3.setBounds(50,110,100,20);		nvpres3.setBounds(150,110,50,20);

		tallyvpres.setBounds(50,140,150,20);
		rvpres1.setBounds(50,160,100,20);	nvvpres1.setBounds(150,160,50,20);
		rvpres2.setBounds(50,180,100,20);    nvvpres2.setBounds(150,180,50,20);
		rvpres3.setBounds(50,200,100,20);	nvvpres3.setBounds(150,200,50,20);

		tallysen.setBounds(50,230,100,20);
		rcnd1.setBounds(50,250,100,20);		nvcnd1.setBounds(150,250,50,20);
		rcnd2.setBounds(50,270,100,20);		nvcnd2.setBounds(150,270,50,20);
		rcnd3.setBounds(50,290,100,20);		nvcnd3.setBounds(150,290,50,20);
		rcnd4.setBounds(50,310,100,20);		nvcnd4.setBounds(150,310,50,20);
		rcnd5.setBounds(50,330,100,20);		nvcnd5.setBounds(150,330,50,20);
		rcnd6.setBounds(50,350,100,20);		nvcnd6.setBounds(150,350,50,20);
		rcnd7.setBounds(50,370,100,20);		nvcnd7.setBounds(150,370,50,20);
		rcnd8.setBounds(50,390,100,20);		nvcnd8.setBounds(150,390,50,20);
		rcnd9.setBounds(50,410,100,20);		nvcnd9.setBounds(150,410,50,20);
		rcnd10.setBounds(50,430,100,20);	nvcnd10.setBounds(150,430,50,20);
		rcnd11.setBounds(50,450,100,20);	nvcnd11.setBounds(150,450,50,20);
		rcnd12.setBounds(50,470,100,20);	nvcnd12.setBounds(150,470,50,20);
		rcnd13.setBounds(50,490,100,20);	nvcnd13.setBounds(150,490,50,20);
		rcnd14.setBounds(50,510,100,20);	nvcnd14.setBounds(150,510,50,20);
		rcnd15.setBounds(50,530,100,20);	nvcnd15.setBounds(150,530,50,20);
		rcnd16.setBounds(50,550,100,20);	nvcnd16.setBounds(150,550,50,20);

		cancel.setBounds(100,590,100,20);		
	}

	void submitresult()
	{
		
		computation();
		nvpres1.setText(String.valueOf(tlvopres1));
		nvpres2.setText(String.valueOf(tlvopres2));
		nvpres3.setText(String.valueOf(tlvopres3));
		
		nvvpres1.setText(String.valueOf(tlvvpres1));
		nvvpres2.setText(String.valueOf(tlvvpres2));
		nvvpres3.setText(String.valueOf(tlvvpres3));		
	
		nvcnd1.setText(String.valueOf(tlvcnd1));
		nvcnd2.setText(String.valueOf(tlvcnd2));
		nvcnd3.setText(String.valueOf(tlvcnd3));
		nvcnd4.setText(String.valueOf(tlvcnd4));
		nvcnd5.setText(String.valueOf(tlvcnd5));
		nvcnd6.setText(String.valueOf(tlvcnd6));
		nvcnd7.setText(String.valueOf(tlvcnd7));
		nvcnd8.setText(String.valueOf(tlvcnd8));
		nvcnd9.setText(String.valueOf(tlvcnd9));
		nvcnd10.setText(String.valueOf(tlvcnd10));
		nvcnd11.setText(String.valueOf(tlvcnd11));
		nvcnd12.setText(String.valueOf(tlvcnd12));
		nvcnd13.setText(String.valueOf(tlvcnd13));
		nvcnd14.setText(String.valueOf(tlvcnd14));
		nvcnd15.setText(String.valueOf(tlvcnd15));
		nvcnd16.setText(String.valueOf(tlvcnd16));
	}	

	




	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==cancel);
			voteagain();
			errorsen();	
			errorpres();
			errorpres();
			errorvpres();
			cancel.setEnabled(false);
	}

	}

	void SUB()	
	{
	    Submit nwvoter = new Submit();
	    nwvoter.setSize(300,650);
        nwvoter.setVisible(true);
	   	
	}

	void errorsen()
	{
		
		cnd1.setState(false);
		cnd2.setState(false);
		cnd3.setState(false);
		cnd4.setState(false);
		cnd5.setState(false);
		cnd6.setState(false);
		cnd7.setState(false);
		cnd8.setState(false);
		cnd9.setState(false);
		cnd10.setState(false);
		cnd11.setState(false);
		cnd12.setState(false);
		cnd13.setState(false);
		cnd14.setState(false);
		cnd15.setState(false);
		cnd16.setState(false);

		
	}


	void voteagain()
	{
		pres.setEnabled(true);
		vpres.setEnabled(true);
		cnd1.setEnabled(true);
		cnd2.setEnabled(true);
		cnd3.setEnabled(true);
		cnd4.setEnabled(true);
		cnd5.setEnabled(true);
		cnd6.setEnabled(true);
		cnd7.setEnabled(true);
		cnd8.setEnabled(true);
		cnd9.setEnabled(true);
		cnd10.setEnabled(true);
		cnd11.setEnabled(true);
		cnd12.setEnabled(true);
		cnd13.setEnabled(true);
		cnd14.setEnabled(true);
		cnd15.setEnabled(true);
		cnd16.setEnabled(true);
		smit.setEnabled(true);
	}
	

	void computation()
	{
		if(vcnd2==1)
			tvcnd2++;
			tlvcnd2 = tvcnd2;

		if(vcnd1==1)
			tvcnd1++;
			tlvcnd1 = tvcnd1;
	
		if(vcnd3==1)
			tvcnd3++;
			tlvcnd3 = tvcnd3;
	
		if(vcnd4==1)
			tvcnd4++;
			tlvcnd4 = tvcnd4;

		if(vcnd5==1)
			tvcnd5++;
			tlvcnd5 = tvcnd5;

		if(vcnd6==1)
			tvcnd6++;
			tlvcnd6 = tvcnd6;

		if(vcnd7==1)
			tvcnd7++;
			tlvcnd7 = tvcnd7;

		if(vcnd8==1)
			tvcnd8++;
			tlvcnd8 = tvcnd8;

		if(vcnd9==1)
			tvcnd9++;
			tlvcnd9 = tvcnd9;
				
		if(vcnd10==1)
			tvcnd10++;
			tlvcnd10 = tvcnd10;

		if(vcnd11==1)
			tvcnd11++;
			tlvcnd11 = tvcnd11;

		if(vcnd12==1)
			tvcnd12++;
			tlvcnd12 = tvcnd12;

		if(vcnd13==1)
			tvcnd13++;
			tlvcnd13 = tvcnd13;
		
		if(vcnd14==1)
			tvcnd14++;
			tlvcnd14 = tvcnd14;
		
		if(vcnd15==1)
			tvcnd15++;
			tlvcnd15 = tvcnd15;
	
		if(vcnd16==1)
			tvcnd16++;
			tlvcnd16 = tvcnd16;
	
	
		if(vopres1==1)
			tvopres1++;
			tlvopres1 = tvopres1;
		
	    if(vopres2==1)
			tvopres2++;
			tlvopres2 = tvopres2;

	    if(vopres3==1)
			tvopres3++;
			tlvopres3 = tvopres3;

		if(vvpres1==1)
			tvvpres1++;
			tlvvpres1 = tvvpres1;	

	    if(vvpres2==1)
			tvvpres2++;
			tlvvpres2 = tvvpres2;	
	
	    if(vvpres3==1)
			tvvpres3++;
			tlvvpres3 = tvvpres3;	
	
		/*tlvcnd1 = tvcnd1 + vcnd1;
		tlvcnd2 = tvcnd2 + vcnd2;
		tlvcnd3 = tvcnd3 + vcnd3;
		tlvcnd4 = tvcnd4 + vcnd4;
		tlvcnd5 = tvcnd5 + vcnd5;
		tlvcnd6 = tvcnd6 + vcnd6;
		tlvcnd7 = tvcnd7 + vcnd7;
		tlvcnd8 = tvcnd8 + vcnd8;
		tlvcnd9 = tvcnd9 + vcnd9;
		tlvcnd10 = tvcnd10 + vcnd10;
		tlvcnd11 = tvcnd11 + vcnd11;
		tlvcnd12 = tvcnd12 + vcnd12;
		tlvcnd13 = tvcnd13 + vcnd13;
		tlvcnd14 = tvcnd14 + vcnd14;
		tlvcnd15 = tvcnd15 + vcnd15;
		tlvcnd16 = tvcnd16 + vcnd16; */

		
	}

	void errorpres()
	{
		pres.select(0);
	}

	void errorvpres()
	{
		vpres.select(0);
	}

	void uneditresult()
	{
		nvpres1.setEditable(false);
		nvpres2.setEditable(false);
		nvpres3.setEditable(false);

		nvvpres1.setEditable(false);
		nvvpres2.setEditable(false);
		nvvpres3.setEditable(false);

		nvcnd1.setEditable(false);
		nvcnd2.setEditable(false);
		nvcnd3.setEditable(false);
		nvcnd4.setEditable(false);
		nvcnd5.setEditable(false);
		nvcnd6.setEditable(false);
		nvcnd7.setEditable(false);
		nvcnd8.setEditable(false);
		nvcnd9.setEditable(false);
		nvcnd10.setEditable(false);
		nvcnd11.setEditable(false);
		nvcnd12.setEditable(false);
		nvcnd13.setEditable(false);
		nvcnd14.setEditable(false);
		nvcnd15.setEditable(false);
		nvcnd16.setEditable(false);
	}
}

	
/* This is not yet the complete  voting system I plan to made
 * I'm still going over to finish the over layout but I think it is the most important of the 
 * Voting System so I post it.
*/