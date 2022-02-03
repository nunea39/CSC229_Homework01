
package com.mycompany.csc229_homework01;

/**
 * 
 * @author Andry Nunez
 */
public class Course { 
    
    int ID;
    String name;
    int code;
    
    // default constructor
    public Course(){ 
        ID = 0;
        name = "";
        code = 0;
    }
    
    /**
     * overloaded constructor with 3 parameters
     * 
     * @param num1 instance variable for int ID
     * @param str  instance variable for string name
     * @param num2 instance variable for int code
     */
    public Course(int num1, String str, int num2){
            ID = num1;
            name = str;
            code = num2;
    }
    
    /**
     * 
     * @return returns students ID number 
     */
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    /**
     * 
     * @return returns students name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * 
     * @return returns students code number
     */
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    
    public static void main (String[] args)
    {
        
        Course course1 = new Course(123, "John", 100); // creates an object from class Course
        System.out.println("ID: " + course1.getID());
        System.out.println("Name: " + course1.getName());
        System.out.println("Code: " + course1.getCode());
        
    }
    
    
}
