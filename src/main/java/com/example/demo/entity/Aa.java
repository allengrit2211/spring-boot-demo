package com.example.demo.entity;

import java.io.Serializable;
  
public class Aa implements Serializable{
    private static final long serialVersionUID = 1L;  
    private String id;  
    private String name;  
    Aa(){
          
    }  
    public String getId() {  
        return id;  
    }  
    public void setId(String id) {  
        this.id = id;  
    }  
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  

    @Override  
    public String toString() {  
        return "Aa [id=" + id + ", name=" + name + "]";
    }  
      
}  