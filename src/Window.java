/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.ImageObserver;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import SemanticErrorManager.SemanticException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;

/**
 *
 * @author leona
 */
public class Window extends javax.swing.JFrame {
    public static  Window instance;
    public static Tortuga tortuga = new Tortuga();
    
    private static FileNameExtensionFilter filtro;
    static String texto_carga ="";
    
    
    
    public  static Point inicioArrastre;
    public static Point finArrastre;
    public static MouseListener mouse = new MouseListener() {
               @Override
               public void mouseReleased(MouseEvent e) {
                   finArrastre = new Point(e.getX(), e.getY());
                tortuga.lineamouse((Graphics2D) dibujo.getGraphics(), inicioArrastre.x, inicioArrastre.y, finArrastre.x, finArrastre.y);
                //repaint();
                   System.out.println(":MOUSE_RELEASED_EVENT:");
               }
               @Override
               public void mousePressed(MouseEvent e) {
                   inicioArrastre = new Point(e.getX(), e.getY());
                    //repaint();
                    System.out.println(":MOUSE_PRESSED_EVENT:");
               }
               @Override
               public void mouseExited(MouseEvent e) {
               }
               @Override
               public void mouseEntered(MouseEvent e) {
               }
               @Override
               public void mouseClicked(MouseEvent e) {
               }};
    
    public static MouseMotionAdapter adapter = new MouseMotionAdapter() {

            public void mouseDragged(MouseEvent e) { // cuando se esta arrastrando el mouse
                finArrastre = new Point(e.getX(), e.getY());
                tortuga.lineamouse((Graphics2D) dibujo.getGraphics(), inicioArrastre.x, inicioArrastre.y, finArrastre.x, finArrastre.y);
                inicioArrastre = new Point(finArrastre.x, finArrastre.y);
                //repaint();
            }
        };
    /**
     * Creates new form Window
     */
    public NumeroLinea numero;
    private Window() {
        
        initComponents();
        errores.setText("Sin errores");
        tortuga.initTortuga();
        dibujo.setBackground(Color.WHITE);
        numero = new NumeroLinea(codigo);
        jScrollPane1.setRowHeaderView(numero);
    }
    
    public static Window getInstance(){
        if (instance == null){
            instance = new Window();
        }
        return instance;
    }
    
    public static Graphics getGraphics2d(){
        return Window.dibujo.getGraphics();
    }
    
    
    
    public void mouseDraw(){
        
        dibujo.addMouseListener(mouse );
        dibujo.addMouseMotionListener(adapter);
        
    }
    public void mouseDraw_not(){
        
        dibujo.removeMouseListener(mouse);
        dibujo.removeMouseMotionListener(adapter);
        
    }
   
    
    /**
     * 
     * @param archivo 
     * @throws FileNotFoundException
     * @throws IOException 
     * 
     * Esta funcion se encarga de recibir un parametro archivo el cual es la ruta de un archivo a leer, y la funcion
     * lee cada linea del archivo de manera que los guarda en un string enviandolo al cuadro de texto en la interfase 
     * en el cual se visualiza el codigo que contiene
     */
    public void muestraContenido(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            texto_carga= texto_carga +"\n"+ cadena;
        }
        System.out.println(texto_carga);
        b.close();
        codigo.setText(texto_carga);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        codigo = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        errores = new javax.swing.JTextPane();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        guardar = new javax.swing.JButton();
        cargar = new javax.swing.JButton();
        imprimir = new javax.swing.JButton();
        compilar = new javax.swing.JButton();
        ejecutar = new javax.swing.JButton();
        dibujo = new java.awt.Panel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        codigo.setColumns(20);
        codigo.setRows(5);
        codigo.setTabSize(3);
        jScrollPane1.setViewportView(codigo);

        errores.setEditable(false);
        errores.setBackground(new java.awt.Color(255, 255, 255));
        errores.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        errores.setDisabledTextColor(new java.awt.Color(204, 0, 0));
        errores.setSelectedTextColor(new java.awt.Color(255, 0, 0));
        jScrollPane2.setViewportView(errores);

        label1.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        label1.setText("Errores:");

        label2.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        label2.setText("Panel de Dibujo:");

        label3.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        label3.setText("Código:");

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        cargar.setText("Cargar");
        cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarActionPerformed(evt);
            }
        });

        imprimir.setText("Imprimir Mapa");
        imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirActionPerformed(evt);
            }
        });

        compilar.setText("Compilar");
        compilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compilarActionPerformed(evt);
            }
        });

        ejecutar.setText("Ejecutar");
        ejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejecutarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dibujoLayout = new javax.swing.GroupLayout(dibujo);
        dibujo.setLayout(dibujoLayout);
        dibujoLayout.setHorizontalGroup(
            dibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        dibujoLayout.setVerticalGroup(
            dibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 423, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guardar)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(cargar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imprimir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(compilar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ejecutar))
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
                            .addComponent(dibujo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(guardar)
                            .addComponent(cargar)
                            .addComponent(imprimir)
                            .addComponent(compilar)
                            .addComponent(ejecutar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dibujo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirActionPerformed
        
        //tortuga();  
        //mouseDraw();
    }//GEN-LAST:event_imprimirActionPerformed

    private void compilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compilarActionPerformed
        String texto = codigo.getText();

        ANTLRInputStream input = new ANTLRInputStream(texto);

        SyntaxErrorListener errorListener = new SyntaxErrorListener();

        logoLexer lexer = new logoLexer(input);

        lexer.removeErrorListeners();
        lexer.addErrorListener(errorListener);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        logoParser parser = new logoParser(tokens);

        parser.removeErrorListeners();

        parser.addErrorListener(errorListener); // add ours
        parser.setErrorHandler(new StrictErrorStrategySpanish());

        try {
            ParseTree tree = parser.programa();

            if(!errorListener.isErrorDetected()){
                errores.setText("Sin errores");
            }else {
                //Error de Syntaxis
                System.out.println(errorListener.getErrorMessage());
                errores.setText(errorListener.getErrorMessage());
            }
        }catch (RuntimeException e){
            if(errorListener.isErrorDetected()){
                System.out.println(errorListener.getErrorMessage());
                errores.setText(errorListener.getErrorMessage());
            }else{
                System.out.println(e.getMessage());
                errores.setText(e.getMessage());
            }
        }
    }//GEN-LAST:event_compilarActionPerformed

    private void ejecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejecutarActionPerformed
        String texto = codigo.getText();
        ANTLRInputStream input = new ANTLRInputStream(texto);

        SyntaxErrorListener errorListener = new SyntaxErrorListener();

        logoLexer lexer = new logoLexer(input);

        lexer.removeErrorListeners();
        lexer.addErrorListener(errorListener);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        logoParser parser = new logoParser(tokens);

        parser.removeErrorListeners();

        parser.addErrorListener(errorListener); // add ours
        parser.setErrorHandler(new StrictErrorStrategySpanish());

        try {
            ParseTree tree = parser.programa();

            if(!errorListener.isErrorDetected()){
                errores.setText("Sin errores");
                logoBaseVisitor extractor = new logoBaseVisitor();
                try {
                    List<Dato> datos = extractor.visit(tree);
                    for(Dato dato: datos){
                        System.out.println(dato.toString());
                    }
                }catch (SemanticException e){
                    System.out.println(e.getMessage());
                    errores.setText(e.getMessage());
                }
            }else {
                //Error de Syntaxis
                System.out.println(errorListener.getErrorMessage());
                errores.setText(errorListener.getErrorMessage());
            }

        }catch (RuntimeException e){
            if(errorListener.isErrorDetected()){
                System.out.println(errorListener.getErrorMessage());
                errores.setText(errorListener.getErrorMessage());
            }else{
                System.out.println(e.getMessage());
                errores.setText(e.getMessage());
            }
        }
        
    }//GEN-LAST:event_ejecutarActionPerformed
    /**
     * 
     * @param evt 
     * Esta funcion recibe un evento el cual de acciona cuando se presiona el boton de guardar
     * esta funcion se encarga de desplegar un cuadro donde se elige la ruta en donde se guardara un archivo que contenga el codigo digitado
     * en la ventana de codigo
     */
    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        if(codigo.getText().length()>0){
        JFileChooser j = new JFileChooser();
        int result = j.showSaveDialog(null);
            if (result == JFileChooser.APPROVE_OPTION){
                File fi = j.getSelectedFile();
                try{
                    try (FileWriter fw = new FileWriter(fi.getPath())) {
                        fw.write(codigo.getText());
                        fw.flush();
                    }
                }catch(IOException e2){
                JOptionPane.showMessageDialog(null, e2.getMessage());}
            }}
        else{
            JOptionPane.showMessageDialog(null, "El codigo esta vacio");
        }
        
        //FileWriter f = new FileWriter();
        
    }//GEN-LAST:event_guardarActionPerformed
    /**
     * 
     * @param evt 
     * Su parametro es un evento, en cual se acciona presionando el boton de cargar de la interfase, esta funcion despliega un cuadro
     * de busqueda del archivo y al seleccionarlo trae su ruta de acceso la cual envia a la funcion de mostrar contenido.
     */
    private void cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarActionPerformed
        String ruta;
        filtro = new FileNameExtensionFilter("Archivos de texto (.TXT)", new String[]{"TXT"});
        JFileChooser j = new JFileChooser();
        j.addChoosableFileFilter(filtro);
        j.showOpenDialog(j);
        if(j.getSelectedFile() != null){
        ruta = j.getSelectedFile().getAbsolutePath();
        
        File f = new File(ruta);
            try {
                muestraContenido(ruta);
            } catch (IOException ex) {
                Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{ruta = "";}
        
    }//GEN-LAST:event_cargarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cargar;
    private javax.swing.JTextArea codigo;
    private javax.swing.JButton compilar;
    public static java.awt.Panel dibujo;
    private javax.swing.JButton ejecutar;
    private javax.swing.JTextPane errores;
    private javax.swing.JButton guardar;
    public javax.swing.JButton imprimir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    // End of variables declaration//GEN-END:variables
}
