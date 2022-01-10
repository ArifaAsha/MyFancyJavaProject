/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Student {
    private static Student instance=null;
	
	private int id;
    private String name;
    private String batch;
    
    private Student(int id, String name, String batch){
        this.id = id;
        this.name = name;
        this.batch = batch;
    }
	
	public static Student getStudent(int id, String name, String batch)
	{
		if(instance==null)
			instance = new Student(id,name,batch);
		return instance;
	}
}