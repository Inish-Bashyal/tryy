/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author inishbashyal
 */
public class Arithmetic {
    private int first;
    private int second;
    
    public Arithmetic(int first, int second){
    this.first = first;
    this.second=second;
    }
    
    public int add(){
    return this.first+this.second;
    }
    
    public int mul(){
        return this.first*this.second;
    }
}
