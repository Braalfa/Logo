/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author leona
 */
public class Dibujo extends Applet implements Runnable {
    Thread anima;
    int radio=10; 
    int radio2=4;
    int radio3=3;
//radio de la pelota
    int x, y,x1,y1;           //posición del centro de la pelota
    int dx = 1;         //desplazamientos
    int dy = 1;
    int anchoApplet;
    int altoApplet;
    int retardo=3;
//Doble buffer
     Image imag,image;
     Graphics gBuffer;
     

  public void init () {
    setBackground(Color.white);
//dimensiones del applet
    anchoApplet=250;
    altoApplet=250;
//posición inicial de partida
    x=10;
    y=45;
    x1=x;
    y1=y;
    ImageIcon ii = new ImageIcon("src/Imagenes/tortuga.png");
    image = ii.getImage();
  }

  public void start(){
     if(anima ==null){
        anima=new Thread(this);
        anima.start();
     }
  }

  public void stop(){
     if(anima!=null){
        anima.stop();
        anima=null;
     }
  }

  public void run() {
    long t=System.currentTimeMillis();
    while (true) {
        mover();
        try{
            t+=retardo;
            Thread.sleep(Math.max(0, t-System.currentTimeMillis()));
        }catch(InterruptedException ex){
            break;
        }
    }
  }
  void mover() {
    x1=x;
    y1=y;
    x += dx;
    y += dy;
    if (x >= 200 || x <= 0) dx*= -1;
    if (y >= 150 || y <= 0) dy*= -1;
        try {
            Thread.sleep(15);
        } catch (InterruptedException ex) {
            Logger.getLogger(Dibujo.class.getName()).log(Level.SEVERE, null, ex);
        }
    repaint();      //llama a update
  }

  public void paint(Graphics g){
    
//dibuja la pelota
        //ImageIcon ii = new ImageIcon("src/Imagenes/tortuga.png");
        //image = ii.getImage();
        //g.drawImage(image, x, y,35, 40,this);
        
        paint1((Graphics2D) g);
       
     
//transfiere la imagen al contexto gráfico del applet
    //g.drawImage(image, x, y, null);
   // g.drawLine(x1, y1, x, y);
    
     //g.rotate(39);
     
 }

  public void paint1 (Graphics2D g) {
        g.rotate(30*Math.PI/180);
        g.drawImage(image, x, y,35, 40,this);
        
        
        
    
  }
  
  public void line(){
      
  }
}
    
