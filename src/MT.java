/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logotec;

/**
 *
 * @author leona
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.ImageObserver;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.paint.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author leona
 */
public class MT  extends java.awt.Panel implements Runnable {
    Thread anima;
     Image image,image2;
     java.awt.Panel Panel;
     Tortuga tortuga_aux;
     public MT (java.awt.Panel panel, Tortuga tortu){
        tortuga_aux= tortu;
        Panel=panel;
        ImageIcon ii = new ImageIcon("src/Imagenes/tortuga.png");
        image = ii.getImage();
        ImageIcon ii2 = new ImageIcon("src/Imagenes/blanco.png");
        image2 = ii2.getImage();
     }
     
  public void init ( ) {
    
    
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
    while (true) {
        try {
            mover();
        } catch (InterruptedException ex) {
            Logger.getLogger(MT.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
  }
  void mover() throws InterruptedException {
    
        try {
            Thread.sleep(15);
        } catch (InterruptedException ex) {
            Logger.getLogger(Dibujo.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(tortuga_aux.visTort){
            paint2();}
        paint1();
    
  }


  public void paint1 () throws InterruptedException {
      Panel.getGraphics().drawImage(image2, 10, 0, 60, 60, this);
      Panel.getGraphics().drawString("Posx: "+tortuga_aux.posx, 10, 13);
      Panel.getGraphics().drawString("Posy: "+tortuga_aux.posy, 10, 29);
      
      
      
      
       
  }
   public void paint2 () throws InterruptedException {
    
    Panel.getGraphics().drawImage(image2, 80, 0, 35, 40, this);
    ((Graphics2D) Panel.getGraphics()).rotate(30*Math.PI/180);
    //Panel.getGraphics().drawImage(image,80, 0, 35, 40, this);
    
     // The required drawing location


    // Rotation information

    double rotationRequired = Math.toRadians (tortuga_aux.angulo);
    
    AffineTransform tx = new AffineTransform();
    tx.translate(110, 40);
    tx.scale(0.2, 0.2);
    tx.rotate(rotationRequired);
    
    
    // Drawing the rotated image at the required drawing locations
    ((Graphics2D) Panel.getGraphics()).drawImage(image,tx, this);
      
   }
}
    