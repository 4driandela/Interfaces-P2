/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pract2;

/**
 *
 * @author User
 */
public class Pract2 extends javax.swing.JFrame {

    public Pract2(){
        initComponents();
    }
    private void initComponents(){
        //Instanciar componentes
        etiqueta1 = new javax.swing.JLabel();
        etiqueta2 = new javax.swing.JLabel();
        etiqueta3 = new javax.swing.JLabel();
        etiqueta4 = new javax.swing.JLabel();
        campoTexto1 = new javax.swing.JTextField();
        boton1 = new javax.swing.JButton();
        comboBox1 = new javax.swing.JComboBox<String>();

        //Texto por defecto
        etiqueta1.setText("Conversión eur/dol");
        etiqueta2.setText("Euros");
        etiqueta3.setText("Dolares");
        boton1.setText("Convertir");

        
        comboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Euros", "Dolares"}));
        
        comboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox1ActionPerformed(evt);
            }
        });
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        
        //Cerrar programa al cerrar ventana
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        //Disposición de los componentes en pantalla
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addGroup(layout.createSequentialGroup()
                        .addGap(125,125,125)
                        .addComponent(etiqueta1)
                        .addContainerGap(125, Short.MAX_VALUE)
                )
                .addGroup(layout.createSequentialGroup()
                        .addGap(140,140,140)
                        .addComponent(comboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(125,Short.MAX_VALUE)
                )
                .addGroup(layout.createSequentialGroup()
                        .addGap(155,155,155)
                        .addComponent(etiqueta2)     
                    .addContainerGap(50,Short.MAX_VALUE)
                )
                 .addGroup(layout.createSequentialGroup()
                        .addGap(130,130,130)
                        .addComponent(campoTexto1)
                    .addContainerGap(50,Short.MAX_VALUE)
                )
                .addGroup(layout.createSequentialGroup()
                        .addGap(100,100,100)
                        .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(50,Short.MAX_VALUE)
                )
                .addGroup(layout.createSequentialGroup()
                        .addGap(155,155,155)
                        .addComponent(etiqueta3)
                    .addContainerGap(50,Short.MAX_VALUE)
                )
                .addGroup(layout.createSequentialGroup()
                        .addGap(150,150,150)
                        .addComponent(etiqueta4)
                    .addContainerGap(50,Short.MAX_VALUE)
                )
                
        );
                         
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(etiqueta1)
                        .addComponent(comboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(etiqueta2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(boton1,javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(etiqueta3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiqueta4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(60, Short.MAX_VALUE)
                )
                         
        );
        pack();
    }
    
    private void comboBox1ActionPerformed(java.awt.event.ActionEvent evt){
        String palabra;
        palabra = String.valueOf(comboBox1.getSelectedItem());
        
        if(palabra.equals("Euros")){
            etiqueta2.setText("Euros");
            etiqueta3.setText("Dolares");
        }else{
            etiqueta2.setText("Dolares");
            etiqueta3.setText("Euros");
        }             
    }
     private void boton1ActionPerformed(java.awt.event.ActionEvent evt){
         String eleccion;
         float euros;
         float dolares;
                 
         
         eleccion = etiqueta2.getText();
         
         switch(eleccion){
             case "Euros":
                 euros = Integer.parseInt(campoTexto1.getText());
                 dolares = euros * 1.06f;
                 etiqueta4.setText(String.valueOf(dolares));
                 campoTexto1.setText("");
                 break;
            case "Dolares":
                dolares = Integer.parseInt(campoTexto1.getText());
                euros = dolares / 1.06f;
                etiqueta4.setText(String.valueOf(euros));
                campoTexto1.setText("");
                 break;
         }
     }
    /**
     *
     * @param args
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pract2().setVisible(true);
            }
        });
    }
    private javax.swing.JLabel etiqueta1;
    private javax.swing.JLabel etiqueta2;
    private javax.swing.JLabel etiqueta3;
    private javax.swing.JLabel etiqueta4;
    private javax.swing.JTextField campoTexto1;
    private javax.swing.JButton boton1;
    private javax.swing.JComboBox<String> comboBox1;
    
}
