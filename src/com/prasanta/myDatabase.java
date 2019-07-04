package com.prasanta;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.sql.*;
public class myDatabase extends Applet implements ActionListener, ItemListener
{
String nm,add,msg;
int rn;
Label rlbl,nlbl,blbl,clbl,colbl,albl,glbl,elbl;
TextField rtf,ntf,btf,ctf,cotf,contf,etf;
Choice dc,mc,yc;
Checkbox chb;
Button db,sb,cb;
CheckboxGroup lngGrp=null;
public void init()
{
setLayout(null);
lngGrp=new CheckboxGroup();
setBackground(Color.yellow);
rlbl=new Label("Roll No. :");
nlbl=new Label("Name :");
blbl=new Label("Branch :");
clbl=new Label("City :");
colbl=new Label("Contect No. :");
elbl=new Label("E-mail :");
albl=new Label("Age :");
glbl=new Label("Gender :");
add(rlbl);
add(nlbl);
add(blbl);
add(clbl);
add(colbl);
add(albl);
add(glbl);
add(elbl);
rtf=new TextField(" ",10);
ntf=new TextField(" ",15);
btf=new TextField(" ",15);
ctf=new TextField(" ",15);
contf=new TextField("+91",3); //no action
cotf=new TextField(" ",10);
etf=new TextField(" ",20);
add(rtf); //add in Applet
add(ntf); //.......
add(btf); //....... 
add(ctf); //......
add(contf);
add(cotf); 
add(etf);
//........
dc=new Choice();
dc.addItem("01");
dc.addItem("02");
dc.addItem("03");
dc.addItem("04");
dc.addItem("05");
dc.addItem("06");
dc.addItem("07");
dc.addItem("08");
dc.addItem("09");
dc.addItem("10");
dc.addItem("11");
dc.addItem("12");
dc.addItem("13");
dc.addItem("14");
dc.addItem("15");
dc.addItem("16");
dc.addItem("17");
dc.addItem("18");
dc.addItem("19");
dc.addItem("20");
dc.addItem("21");
dc.addItem("22");
dc.addItem("23");
dc.addItem("24");
dc.addItem("25");
dc.addItem("26");
dc.addItem("27");
dc.addItem("28");
dc.addItem("29");
dc.addItem("30");
dc.addItem("31");
add(dc); //add in Applet
mc=new Choice();
mc.addItem("Jan");
mc.addItem("Feb");
mc.addItem("Mar");
mc.addItem("Aprl");
mc.addItem("May");
mc.addItem("Jun");
mc.addItem("July");
mc.addItem("Aug");
mc.addItem("Sep");
mc.addItem("Oct");
mc.addItem("Nov");
mc.addItem("Dec");
add(mc); //add in Applet
yc=new Choice();
yc.addItem("1990");
yc.addItem("1991");
yc.addItem("1992");
yc.addItem("1993");
yc.addItem("1994");
yc.addItem("1995");
yc.addItem("1996");
yc.addItem("1997");
yc.addItem("1998");
yc.addItem("1999");
yc.addItem("2000");
yc.addItem("2001");
yc.addItem("2002");
yc.addItem("2003");
yc.addItem("2004");
yc.addItem("2005");
yc.addItem("2006");
yc.addItem("2007");
yc.addItem("2008");
yc.addItem("2009");
yc.addItem("2010");
yc.addItem("2011");
yc.addItem("2012");
add(yc); //Add in applet
// Creat Checkbox
Checkbox male=new Checkbox("Male",lngGrp,false);
Checkbox female=new Checkbox("Female",lngGrp,false);
add(male);
add(female);
chb=new Checkbox("Are you agree");
add(chb);
db=new Button("Done");
sb=new Button("Skip");
cb=new Button("Cancel");
add(db);
add(sb);
add(cb);
// Set Layout
rlbl.setBounds(50,50,80,25);
nlbl.setBounds(50,100,80,20);
blbl.setBounds(50,150,80,25);
clbl.setBounds(50,200,80,25);
colbl.setBounds(50,250,80,25);
elbl.setBounds(50,300,80,25);
albl.setBounds(50,350,80,25);
glbl.setBounds(50,400,80,25);
rtf.setBounds(160,50,80,25);
ntf.setBounds(160,100,150,25);
btf.setBounds(160,150,150,25);
ctf.setBounds(160,200,150,25);
contf.setBounds(160,250,30,25);
cotf.setBounds(190,250,100,25);
etf.setBounds(160,300,200,25);
dc.setBounds(160,350,50,25);
mc.setBounds(220,350,70,25);
yc.setBounds(300,350,70,25);
chb.setBounds(160,450,100,25);
male.setBounds(160,400,80,25);
female.setBounds(240,400,100,25);
db.setBounds(80,500,100,30);
sb.setBounds(240,500,100,30);
cb.setBounds(400,500,100,30);
//addActionListener
rtf.addActionListener(this);
ntf.addActionListener(this);
btf.addActionListener(this);
ctf.addActionListener(this);
cotf.addActionListener(this);
etf.addActionListener(this);
db.addActionListener(this);
sb.addActionListener(this);
cb.addActionListener(this);

//add ItemListener
dc.addItemListener(this);
mc.addItemListener(this);
yc.addItemListener(this);
chb.addItemListener(this);

}
// Action Started
public void actionPerformed(ActionEvent ae)
{
String str1=ae.getActionCommand();
if(str1.equals("Done"))
{
try
{
rn=Integer.parseInt(rtf.getText());
nm=(String)(ntf.getText());
add=(String)(ctf.getText());
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con = DriverManager.getConnection("Jdbc:Odbc:db1");
Statement st = con.createStatement();
String str = "INSERT INTO Students1 (Roll_No,Name,City)VALUES("+rn+",'"+nm+"','"+add+" ')";
st.execute(str);
con.close();
//System.out.println(+i+"Query Completed");
msg="Query Completed";
}
catch(Exception e)
{
e.printStackTrace(); //msg="+e";//System.out.print("Error:-"+e);
}
setBackground(Color.red);
}
}
public void itemStateChanged(ItemEvent ie)
{
String str2=(String)ie.getItem();
if(str2.equals("01"))
{
setBackground(Color.cyan);
}
}
public void paint(Graphics g)
{
g.drawString(msg,50,475);
}
}
/*<applet code="myDatabase.java" width=600 height=600></applet>*/