/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbeanscomponents;

import java.awt.Graphics;
import java.beans.*;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author DELL
 */
public class CorpWishlistBackground extends JPanel implements Serializable {
    
    public static final String PROP_SAMPLE_PROPERTY = "sampleProperty";
    
    private String sampleProperty;
    ImageIcon img;
    private PropertyChangeSupport propertySupport;
    
    public CorpWishlistBackground() {
        propertySupport = new PropertyChangeSupport(this);
        img = new ImageIcon(getClass().getResource("corpwishlistbackground.png"));
    }
    
    public String getSampleProperty() {
        return sampleProperty;
    }
    
    public void setSampleProperty(String value) {
        String oldValue = sampleProperty;
        sampleProperty = value;
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, sampleProperty);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        g.drawImage(img.getImage(), 0, 0, null);
          
    }
    
}
