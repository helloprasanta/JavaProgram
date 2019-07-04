package com.prasanta;

public class Student {

String name;
int age;
int rollNo;
public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public int getAge() {
return age;
}

public void setAge(int age) {
this.age = age;
}

public int getRollNo() {
return rollNo;
}

public void setRollNo(int rollNo) {
this.rollNo = rollNo;
}

public Student(String name, int age, int rollNo) {
super();
this.name = name;
this.age = age;
this.rollNo = rollNo;
}



}


package smartLibrary;

public class books {

int bookId;
String name;
String author;
String Title;
public books()
{

}
public int getBookId() {
return bookId;
}
public void setBookId(int bookId) {
this.bookId = bookId;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getAuthor() {
return author;
}
public void setAuthor(String author) {
this.author = author;
}
public String getTitle() {
return Title;
}
public void setTitle(String title) {
Title = title;
}

public books(int bookId, String name, String author, String title) {
super();
this.bookId = bookId;
this.name = name;
this.author = author;
Title = title;

}

}


package smartLibrary;

public class library {
Student st;
books bk;
int noOfCopies;
public Student getSt() {
return st;
}
public void setSt(Student st) {
this.st = st;
}
public books getBk() {
return bk;
}
public void setBk(books bk) {
this.bk = bk;
}
public int getNoOfCopies() {
return noOfCopies;
}
public void setNoOfCopies(int noOfCopies) {
this.noOfCopies = noOfCopies;
}
public library(Student st, books bk, int noOfCopies) {
super();
this.st = st;
this.bk = bk;
this.noOfCopies = noOfCopies;
}




}

package smartLibrary;

import java.util.ArrayList;

public class LibraryFunc {

public static ArrayList<library> lib=new ArrayList<library>();

public static void issueBook(Student st1,books b,int copies)
{
int count=0; boolean flag=false;
library entry;
if(lib.size()==0)
{
System.out.println("The book is issued to "+st1.getName());
entry= new library(st1, b, copies);
lib.add(entry);
System.out.println(lib.size());
flag=true;
}
else
{
for(int i=0;i<lib.size();i++)
{

if(lib.get(i).getSt().getRollNo()==st1.getRollNo() )
{
count+=lib.get(i).getNoOfCopies();
}
}
System.out.println(count);
if(count<5)
{
System.out.println("The book "+b.getTitle()+ " is issued to "+st1.getName());
entry=new library(st1, b, copies);
lib.add(entry);
flag=true;
}
else
{
System.out.println("maximum 5 books can be issued");
}
}
if(flag==false)
{
System.out.println("Student not found");
}
}

public static void searchBook(String title,ArrayList<books> bookList)
{
boolean flag=false;
for(books b:bookList)
{
if(b.getTitle().equalsIgnoreCase(title))
{
System.out.println("Books found..");
flag=true;
break;
}

}
if(flag==false)
System.out.println("Book not found");
}
}




import java.util.ArrayList;
package smartLibrary;


public class libraryApp {

/**
* @param args
*/


public static void main(String[] args) {
// TODO Auto-generated method stub
ArrayList<books> bookList1=new ArrayList<books>();
books b1=new books(1, "Java", "Siera and bates", "Head First");
books b2=new books(2, "Servlets", "Oreilly", "Start Servlets");
books b3=new books(3, "JSP", "Siera and bates", "Learn jsp");
books b4=new books(4, "CSS", "George W Bush", "Basics of CSS");
bookList1.add(b1);
bookList1.add(b2);
bookList1.add(b3);
bookList1.add(b4);
Student ct1=new Student("Tirtha",22, 2113 );
Student ct2=new Student("Satya",22, 2114 );
Student ct3=new Student("Sourav",22, 2115);
Student ct4=new Student("partho", 23,2116);
Student ct5=new Student("Arnab",23, 2117);
Student ct6=new Student("Shweta", 20,2118);
Student ct7=new Student("Manish", 22,2119);
switch(Integer.parseInt(args[0])) {
case 1:
LibraryFunc.issueBook(ct1,b1,2);
break;
case 2:
break;
case 3:
LibraryFunc.searchBook("Head Firsts",bookList1);
break;
default:
break;
}

}

}