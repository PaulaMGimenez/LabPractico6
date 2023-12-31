/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labpractico6;


import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class AgregarProductos extends javax.swing.JInternalFrame {
    private  Producto productoencontrado=null;
    
    /**
     * Creates new form AgregarProductos
     * @para
     */
    public AgregarProductos() {
        initComponents();
        this.getContentPane().setBackground(Color.yellow);
        
        categorias();
        desactivarCampos();
        limpiarCampos();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        EntradaCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        EntradaDescripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        EntradaPrecio = new javax.swing.JTextField();
        EntradaStock = new javax.swing.JTextField();
        BotonNuevo = new javax.swing.JButton();
        BotonGuardar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        BotonBuscarCodigo = new javax.swing.JButton();
        jComboBoxCategorias = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setText("Gestion de Productos");

        jLabel2.setText("Codigo");

        EntradaCodigo.setBackground(new java.awt.Color(255, 102, 255));
        EntradaCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                EntradaCodigoFocusLost(evt);
            }
        });

        jLabel3.setText("Descripcion");

        EntradaDescripcion.setBackground(new java.awt.Color(255, 102, 255));
        EntradaDescripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                EntradaDescripcionFocusLost(evt);
            }
        });

        jLabel4.setText("Precio");

        jLabel5.setText("Categoria");

        jLabel6.setText("Stock");

        EntradaPrecio.setBackground(new java.awt.Color(255, 102, 255));
        EntradaPrecio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                EntradaPrecioFocusLost(evt);
            }
        });

        EntradaStock.setBackground(new java.awt.Color(255, 102, 255));
        EntradaStock.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                EntradaStockFocusLost(evt);
            }
        });

        BotonNuevo.setBackground(new java.awt.Color(255, 102, 255));
        BotonNuevo.setText("Nuevo");
        BotonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNuevoActionPerformed(evt);
            }
        });

        BotonGuardar.setBackground(new java.awt.Color(255, 102, 255));
        BotonGuardar.setText("Guardar");
        BotonGuardar.setEnabled(false);
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });

        BotonEliminar.setBackground(new java.awt.Color(255, 102, 255));
        BotonEliminar.setText("Eliminar");
        BotonEliminar.setEnabled(false);
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        BotonSalir.setBackground(new java.awt.Color(255, 102, 255));
        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        BotonBuscarCodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa (1).png"))); // NOI18N
        BotonBuscarCodigo.setEnabled(false);
        BotonBuscarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarCodigoActionPerformed(evt);
            }
        });

        jComboBoxCategorias.setBackground(new java.awt.Color(255, 102, 255));
        jComboBoxCategorias.setForeground(new java.awt.Color(255, 102, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(60, 60, 60))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(31, 31, 31)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(62, 62, 62))
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(EntradaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(EntradaDescripcion)
                        .addComponent(EntradaStock, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxCategorias, 0, 185, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EntradaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonBuscarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonNuevo)
                .addGap(18, 18, 18)
                .addComponent(BotonGuardar)
                .addGap(27, 27, 27)
                .addComponent(BotonEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(EntradaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(BotonBuscarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(EntradaDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(EntradaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(EntradaStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonNuevo)
                    .addComponent(BotonGuardar)
                    .addComponent(BotonEliminar)
                    .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
       
       
      try{
       
       int codigo=Integer.parseInt(EntradaCodigo.getText());
       String descripcion=EntradaDescripcion.getText();
       Double precio = Double.parseDouble(EntradaPrecio.getText());
       int stock= Integer.parseInt(EntradaStock.getText());
       Categoria rubro= (Categoria)jComboBoxCategorias.getSelectedItem();
       
       Producto productito =new Producto(codigo,descripcion,precio,stock,rubro);
      if(descripcion.isEmpty()){
          JOptionPane.showMessageDialog(this,"No deben de haber campos vacios");
          
          return;
      }
      boolean result= Menu.listaProductos.add(productito);
       if(result){
       
       JOptionPane.showMessageDialog(this, "Producto Agregado");
       }else{
          JOptionPane.showMessageDialog(this,"Ya existe un producto con el codigo ingresado");
          
       }
      }catch(NumberFormatException nn){
          JOptionPane.showMessageDialog(this,"Debe ingresar los numeros en los valores codigo, precio y stock");
          
      }
       limpiarCampos();
       desactivarCampos();
       BotonGuardar.setEnabled(false);
       
       


    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void BotonBuscarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarCodigoActionPerformed
        // TODO add your handling code here:
        try{
            
            productoencontrado=null;
            int codigo= Integer.parseInt(EntradaCodigo.getText());
       
      
       
       for(Producto prod:Menu.listaProductos){
           if(prod.getCodigo()== codigo){
               productoencontrado=prod;
               break;
           }else{
               
           }
           
           
       }
       
       if(productoencontrado==null){
           JOptionPane.showMessageDialog(this, "No se encontro el producto");
           
       }else{
           
           EntradaDescripcion.setText(productoencontrado.getDescripcion());
           EntradaPrecio.setText(productoencontrado.getPrecio()+"");
           EntradaStock.setText(productoencontrado.getStock()+"");
           jComboBoxCategorias.setSelectedItem(productoencontrado.getRubro());
           
           BotonEliminar.setEnabled(true);
           
               
       }
       
       
        }catch(NumberFormatException nn){
           
            JOptionPane.showMessageDialog(this,"Debe ingresar valores numericos en codigo");
            
            
        }
        
       
       
        
        
    }//GEN-LAST:event_BotonBuscarCodigoActionPerformed

    private void BotonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNuevoActionPerformed

        activarCampos();
        limpiarCampos();
        BotonGuardar.setEnabled(true);
        BotonBuscarCodigo.setEnabled(true);
        
      
    }//GEN-LAST:event_BotonNuevoActionPerformed

    private void EntradaCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EntradaCodigoFocusLost
        //Evento cuando pierde el foco
        //expresiones regulares
        String val="[0-9]*";//solo nos referimos a numeros
        if(!EntradaCodigo.getText().matches(val)){
           JOptionPane.showMessageDialog(this, "Debe ingresar solo numeros");
           EntradaCodigo.requestFocus();//
           EntradaCodigo.setText("");
        }
        


        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaCodigoFocusLost

    private void EntradaDescripcionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EntradaDescripcionFocusLost
        //evento descripcion
        if(EntradaDescripcion.getText().length()==0){
             JOptionPane.showMessageDialog(this,"La descripcion esta vacia");
             EntradaDescripcion.requestFocus();
             
       
              }


        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaDescripcionFocusLost

    private void EntradaPrecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EntradaPrecioFocusLost
        // TODO add your handling code here:
        //primero parseamos
        try{
      String precio= EntradaPrecio.getText();
      double preci=Double.parseDouble(precio);
      
        }catch(NumberFormatException nn){
            JOptionPane.showMessageDialog(this, "Debe ingresar un precio valido");
            EntradaPrecio.requestFocus();
            EntradaPrecio.setText("");
            
        }
        
        
        
    }//GEN-LAST:event_EntradaPrecioFocusLost

    private void EntradaStockFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EntradaStockFocusLost
        
        String val="[0-9]*";
        if(!EntradaStock.getText().matches(val)){
           JOptionPane.showMessageDialog(this, "Debe ingresar solo numeros");
           EntradaStock.requestFocus();//
           EntradaStock.setText("");
        }

 
    }//GEN-LAST:event_EntradaStockFocusLost

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        //salir de la ventana
        dispose();
        

       
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
       
        
        Menu.listaProductos.remove(productoencontrado);
        
        JOptionPane.showMessageDialog(this, "Producto Eliminado");
        
        limpiarCampos();
        
        
        
        
        
    }//GEN-LAST:event_BotonEliminarActionPerformed
    private void activarCampos(){
        //PARA ACTIVAR LA VISIBILIDAD DE LAS ENTRADAS DE DATOS
        EntradaCodigo.setEnabled(true);
        EntradaDescripcion.setEnabled(true);
        EntradaPrecio.setEnabled(true);
        EntradaStock.setEnabled(true);
        jComboBoxCategorias.setEnabled(true);
        
        
    }
    private void desactivarCampos(){
         EntradaCodigo.setEnabled(false);
        EntradaDescripcion.setEnabled(false);
        EntradaPrecio.setEnabled(false);
        EntradaStock.setEnabled(false);
        jComboBoxCategorias.setEnabled(false);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscarCodigo;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonNuevo;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JTextField EntradaCodigo;
    private javax.swing.JTextField EntradaDescripcion;
    private javax.swing.JTextField EntradaPrecio;
    private javax.swing.JTextField EntradaStock;
    private javax.swing.JComboBox<Categoria> jComboBoxCategorias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

private void categorias(){
    jComboBoxCategorias.setModel(new DefaultComboBoxModel<>(Categoria.values()));
   
    
            
        }



private void limpiarCampos(){
    EntradaCodigo.setText("");
    EntradaDescripcion.setText("");
    EntradaPrecio.setText("");
    EntradaStock.setText("");
    jComboBoxCategorias.setSelectedIndex(0);
    productoencontrado=null;
        BotonEliminar.setEnabled(false);
    
    
    
}


}
