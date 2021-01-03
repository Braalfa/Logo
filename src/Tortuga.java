/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author leona
 */

import SemanticErrorManager.SemanticException;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Tortuga {
    Image image;
    Integer posx = 405;
    Integer posy = 211;
    Integer posx1 = 0;
    Integer posy1 = 0;
    Integer angulo =0;
    Color color = Color.BLACK;
    public Tortuga(){
        
    }
    public void initTortuga(){
        show_imagen();
    }
    
    public void  show_imagen(){
        ImageIcon ii = new ImageIcon("src/Imagenes/tortuga.png");
        image = ii.getImage();
        
    }
    
    public Integer getX (){
        return posx;
    }
    public Integer getY (){
        return posy;
    }
    
    //Funciones de dibujo
    public void ponx(Integer x) {
        this.posx = x;  
    }
    public void pony(Integer y) {
        this.posy = y;  
    }
    public void ponpos(Integer x,Integer y) {
        this.posx = x; 
        this.posy = y;  
    }
    public void pon_rumbo(Integer angulo) {
        this.angulo = angulo;  
    }
    public Integer rumbo (){
        while(angulo >=360){
            angulo = angulo -360;
        }
        while(angulo <=-360){
            angulo = angulo +360;
        }
        return angulo;
    }
    /////---------------------------------------------------------------
    public void avanzar(Graphics2D g2d,int x){
        posx1=posx;
        posy1=posy;
        posx= valorar_x((int) Math.round(Math.cos((angulo*Math.PI)/180) * x +posx1),posx1);
        posy= valorar_y((int) Math.round(Math.sin((angulo*Math.PI)/180) * x +posy1),posy1);
        linea(g2d);
    }
    
    public int valorar_x(int x,int pos){
        if(x>-1 & x<810){
            return x;
        }
        throw new SemanticException("El valor ingresado sobresale el panel de dibujo");
    }
    public int valorar_y(int x,int pos){
        if(x>-1 & x<423){
            return x;
        }
        throw new SemanticException("El valor ingresado sobresale el panel de dibujo");
    }
    public void linea(Graphics2D g2d){
        g2d.setColor(color);
        g2d.drawLine(posx1, posy1, posx, posy);
    
    }
    ///---------------------------------------------------------------
    
    public void retroceder(Graphics2D g2d,int x){
        posx1=posx;
        posy1=posy;
        posx=  valorar_x(posx1 -(int) Math.round(Math.cos((angulo*Math.PI)/180) * x),posx1);
        posy= valorar_y(posy1 - (int) Math.round(Math.sin((angulo*Math.PI)/180) * x ),posy1);
        linea(g2d);
    }
    
    public void girar_izquierda(int x){
        this.angulo = angulo-x;
        
    }
    public void girar_derecha(int x){
        this.angulo = angulo+x;
        
    }
    public void centro(){
        posx = 405;
        posy = 211;
    }
    
    public void goma(){
        color= Color.WHITE;
    }
    
    public void borrar_pantalla(Graphics2D g){
        g.setColor(Color.WHITE);
        g.fillRect(0,0, 810, 423);
    }
    
    public void lineamouse(Graphics2D g2d,int x1,int y1,int x2,int y2){
        g2d.setColor(color);
        g2d.drawLine(x1, y1, x2, y2);
        
    }
    
    public void poncolor(Color color1){
        color = color1;
    }
}
