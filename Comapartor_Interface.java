/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hrana
 */
import java.util.*;

class Students 
{
    String name,address;
    int rollno;

    Students(String name,String address,int rollno)
    {
    this.name=name;
    this.address=address;
    this.rollno=rollno;
    }
}

class Rollno implements Comparator
{
    public int compare(Object o1,Object o2)
    {
    Students s1=(Students)o1;
    Students s2=(Students)o2;

    if(s1.rollno==s2.rollno)
    {
    return 0;
    }

    else if(s1.rollno>s2.rollno)
    {
    return 1;
    }

    else
    {
    return -1;
    }
   }
 }

class Name implements Comparator
{
    public int compare(Object o1,Object o2)
    {
    Students s1=(Students)o1;
    Students s2=(Students)o2;

    return s1.name.compareTo(s2.name);  
    }
}


public class Comapartor_Interface 
{
    public static void main(String args[])
    {
        ArrayList<Students> al=new ArrayList();
        al.add(new Students("harsh rana","barauli",12));
        al.add(new Students("rohit rana","barauli",15));
        al.add(new Students("abhi rana","barauli",5));
        al.add(new Students("dev rana","barauli",25));
        al.add(new Students("sagar rana","barauli",8));

        Collections.sort(al,new Rollno());
        System.out.println("Sorting By Rollno : ");
        for(Students var:al)
        {
        Students s=(Students)var;
        
        System.out.println(s.name+" "+s.address+" "+s.rollno);
        }

        Collections.sort(al,new Name());
        System.out.println("Sorting By Name : ");
        for(Students var:al)
        {
        Students s=(Students)var;
       
        System.out.println(s.name+" "+s.address+" "+s.rollno);
        }
        }

}
