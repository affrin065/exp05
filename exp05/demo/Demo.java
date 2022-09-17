/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;

/**
 *
 * @author affrin
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         subdemo obj=new subdemo();
        real obj1=new real();
        obj.display();
        obj1.display();
    }
}
class subdemo
{
    int a=10;
    void display()
    {
        System.out.println("this is subdemo context");
       
    }
   
   
}
class real extends subdemo{
    protected void display()
    {
        System.out.println("the value of a is "+a);
    }
}

        
