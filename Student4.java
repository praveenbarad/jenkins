class Student4{  
    
    String name;  
    //creating a parameterized constructor  
    Student4(String n){  
    
    name = n;  
    }  
    //method to display the values  
    void display(){System.out.println(name);}  
   
    public static void main(String args[]){  
    //creating objects and passing values  
    Student4 s1 = new Student4("Karan");  
    Student4 s2 = new Student4("Aryan");  
    //calling method to display the values of object  
    s1.display();  
    s2.display();  
   }  
}  
