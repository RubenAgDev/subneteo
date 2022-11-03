/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Direccionamiento_IP;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
/**
 * @author Administrador
 */
public class IP extends MIDlet implements CommandListener {

    private boolean midletPaused = false;

    //<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private Form form;
    private TextField octeto1;
    private TextField octeto3;
    private TextField octeto2;
    private TextField octeto4;
    private StringItem stringItem;
    private TextField prefijo;
    private StringItem stringItem2;
    private StringItem stringItem1;
    private StringItem stringItem4;
    private StringItem stringItem3;
    private StringItem mascaraDeSubred;
    private StringItem direccionDeRed;
    private StringItem direccionBroadcast;
    private Command Salir;
    private Command Ok;
    //</editor-fold>//GEN-END:|fields|0|

    /**
     * The IP constructor.
     */
    public IP() {
    }

    //<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
    //</editor-fold>//GEN-END:|methods|0|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
    /**
     * Initilizes the application.
     * It is called only once when the MIDlet is started. The method is called before the <code>startMIDlet</code> method.
     */
    private void initialize() {//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize
        // write post-initialize user code here
    }//GEN-BEGIN:|0-initialize|2|
    //</editor-fold>//GEN-END:|0-initialize|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Started point.
     */
    public void startMIDlet() {//GEN-END:|3-startMIDlet|0|3-preAction
        // write pre-action user code here
        switchDisplayable(null, getForm());//GEN-LINE:|3-startMIDlet|1|3-postAction
        // write post-action user code here
    }//GEN-BEGIN:|3-startMIDlet|2|
    //</editor-fold>//GEN-END:|3-startMIDlet|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
     */
    public void resumeMIDlet() {//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here
    }//GEN-BEGIN:|4-resumeMIDlet|2|
    //</editor-fold>//GEN-END:|4-resumeMIDlet|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
    /**
     * Switches a current displayable in a display. The <code>display</code> instance is taken from <code>getDisplay</code> method. This method is used by all actions in the design for switching displayable.
     * @param alert the Alert which is temporarily set to the display; if <code>null</code>, then <code>nextDisplayable</code> is set immediately
     * @param nextDisplayable the Displayable to be set
     */
    public void switchDisplayable(Alert alert, Displayable nextDisplayable) {//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
        Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
        if (alert == null) {
            display.setCurrent(nextDisplayable);
        } else {
            display.setCurrent(alert, nextDisplayable);
        }//GEN-END:|5-switchDisplayable|1|5-postSwitch
        // write post-switch user code here
    }//GEN-BEGIN:|5-switchDisplayable|2|
    //</editor-fold>//GEN-END:|5-switchDisplayable|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
    /**
     * Called by a system to indicated that a command has been invoked on a particular displayable.
     * @param command the Command that was invoked
     * @param displayable the Displayable where the command was invoked
     */
    public void commandAction(Command command, Displayable displayable) {//GEN-END:|7-commandAction|0|7-preCommandAction
        // write pre-action user code here
        if (displayable == form) {//GEN-BEGIN:|7-commandAction|1|33-preAction
            if (command == Ok) {//GEN-END:|7-commandAction|1|33-preAction
                Reglas calcular = new Reglas(this.octeto1.getString(), this.octeto2.getString(), this.octeto3.getString(), this.octeto4.getString(), this.prefijo.getString());
                if(calcular.isCorrectIP())
                {
                    this.stringItem.setText("IP / Prefijo");
                    this.mascaraDeSubred.setText(calcular.getMascaraDeSubredBinaria());
                    this.direccionDeRed.setText(calcular.getDireccionDeRed());
                    this.direccionBroadcast.setText(calcular.getDireccionBroadcast());
                }
//GEN-LINE:|7-commandAction|2|33-postAction
                else
                    this.stringItem.setText("Alguno de los valores introducidos es incorrecto");
            } else if (command == Salir) {//GEN-LINE:|7-commandAction|3|20-preAction
                // write pre-action user code here
                this.exitMIDlet();
//GEN-LINE:|7-commandAction|4|20-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|5|7-postCommandAction
        }//GEN-END:|7-commandAction|5|7-postCommandAction
        // write post-action user code here
    }//GEN-BEGIN:|7-commandAction|6|
    //</editor-fold>//GEN-END:|7-commandAction|6|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: form ">//GEN-BEGIN:|16-getter|0|16-preInit
    /**
     * Returns an initiliazed instance of form component.
     * @return the initialized component instance
     */
    public Form getForm() {
        if (form == null) {//GEN-END:|16-getter|0|16-preInit
            // write pre-init user code here
            form = new Form("", new Item[] { getStringItem(), getOcteto1(), getStringItem1(), getOcteto2(), getStringItem2(), getOcteto3(), getStringItem3(), getOcteto4(), getStringItem4(), getPrefijo(), getMascaraDeSubred(), getDireccionDeRed(), getDireccionBroadcast() });//GEN-BEGIN:|16-getter|1|16-postInit
            form.addCommand(getSalir());
            form.addCommand(getOk());
            form.setCommandListener(this);//GEN-END:|16-getter|1|16-postInit
            // write post-init user code here
        }//GEN-BEGIN:|16-getter|2|
        return form;
    }
    //</editor-fold>//GEN-END:|16-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: octeto1 ">//GEN-BEGIN:|18-getter|0|18-preInit
    /**
     * Returns an initiliazed instance of octeto1 component.
     * @return the initialized component instance
     */
    public TextField getOcteto1() {
        if (octeto1 == null) {//GEN-END:|18-getter|0|18-preInit
            // write pre-init user code here
            octeto1 = new TextField("", null, 3, TextField.NUMERIC);//GEN-BEGIN:|18-getter|1|18-postInit
            octeto1.setPreferredSize(3, -1);
            octeto1.setLayout(ImageItem.LAYOUT_DEFAULT | Item.LAYOUT_SHRINK | Item.LAYOUT_2);//GEN-END:|18-getter|1|18-postInit
            // write post-init user code here
        }//GEN-BEGIN:|18-getter|2|
        return octeto1;
    }
    //</editor-fold>//GEN-END:|18-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: Salir ">//GEN-BEGIN:|19-getter|0|19-preInit
    /**
     * Returns an initiliazed instance of Salir component.
     * @return the initialized component instance
     */
    public Command getSalir() {
        if (Salir == null) {//GEN-END:|19-getter|0|19-preInit
            // write pre-init user code here
            Salir = new Command("Salir", Command.EXIT, 0);//GEN-LINE:|19-getter|1|19-postInit
            // write post-init user code here
        }//GEN-BEGIN:|19-getter|2|
        return Salir;
    }
    //</editor-fold>//GEN-END:|19-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: octeto2 ">//GEN-BEGIN:|22-getter|0|22-preInit
    /**
     * Returns an initiliazed instance of octeto2 component.
     * @return the initialized component instance
     */
    public TextField getOcteto2() {
        if (octeto2 == null) {//GEN-END:|22-getter|0|22-preInit
            // write pre-init user code here
            octeto2 = new TextField("", null, 3, TextField.NUMERIC);//GEN-BEGIN:|22-getter|1|22-postInit
            octeto2.setLayout(ImageItem.LAYOUT_DEFAULT | Item.LAYOUT_SHRINK | Item.LAYOUT_2);
            octeto2.setPreferredSize(3, -1);//GEN-END:|22-getter|1|22-postInit
            // write post-init user code here
        }//GEN-BEGIN:|22-getter|2|
        return octeto2;
    }
    //</editor-fold>//GEN-END:|22-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: octeto3 ">//GEN-BEGIN:|23-getter|0|23-preInit
    /**
     * Returns an initiliazed instance of octeto3 component.
     * @return the initialized component instance
     */
    public TextField getOcteto3() {
        if (octeto3 == null) {//GEN-END:|23-getter|0|23-preInit
            // write pre-init user code here
            octeto3 = new TextField("", null, 3, TextField.NUMERIC);//GEN-BEGIN:|23-getter|1|23-postInit
            octeto3.setLayout(ImageItem.LAYOUT_DEFAULT | Item.LAYOUT_SHRINK | Item.LAYOUT_2);
            octeto3.setPreferredSize(3, -1);//GEN-END:|23-getter|1|23-postInit
            // write post-init user code here
        }//GEN-BEGIN:|23-getter|2|
        return octeto3;
    }
    //</editor-fold>//GEN-END:|23-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: octeto4 ">//GEN-BEGIN:|24-getter|0|24-preInit
    /**
     * Returns an initiliazed instance of octeto4 component.
     * @return the initialized component instance
     */
    public TextField getOcteto4() {
        if (octeto4 == null) {//GEN-END:|24-getter|0|24-preInit
            // write pre-init user code here
            octeto4 = new TextField("", null, 3, TextField.NUMERIC);//GEN-BEGIN:|24-getter|1|24-postInit
            octeto4.setLayout(ImageItem.LAYOUT_DEFAULT | Item.LAYOUT_2);
            octeto4.setPreferredSize(3, -1);//GEN-END:|24-getter|1|24-postInit
            // write post-init user code here
        }//GEN-BEGIN:|24-getter|2|
        return octeto4;
    }
    //</editor-fold>//GEN-END:|24-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: prefijo ">//GEN-BEGIN:|26-getter|0|26-preInit
    /**
     * Returns an initiliazed instance of prefijo component.
     * @return the initialized component instance
     */
    public TextField getPrefijo() {
        if (prefijo == null) {//GEN-END:|26-getter|0|26-preInit
            // write pre-init user code here
            prefijo = new TextField("", null, 2, TextField.NUMERIC);//GEN-BEGIN:|26-getter|1|26-postInit
            prefijo.setLayout(ImageItem.LAYOUT_DEFAULT | Item.LAYOUT_2);
            prefijo.setPreferredSize(3, -1);//GEN-END:|26-getter|1|26-postInit
            // write post-init user code here
        }//GEN-BEGIN:|26-getter|2|
        return prefijo;
    }
    //</editor-fold>//GEN-END:|26-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem ">//GEN-BEGIN:|27-getter|0|27-preInit
    /**
     * Returns an initiliazed instance of stringItem component.
     * @return the initialized component instance
     */
    public StringItem getStringItem() {
        if (stringItem == null) {//GEN-END:|27-getter|0|27-preInit
            // write pre-init user code here
            stringItem = new StringItem("Introduce los datos:", "IP / Prefijo");//GEN-BEGIN:|27-getter|1|27-postInit
            stringItem.setLayout(ImageItem.LAYOUT_DEFAULT | Item.LAYOUT_SHRINK | Item.LAYOUT_2);
            stringItem.setPreferredSize(-1, -1);//GEN-END:|27-getter|1|27-postInit
            // write post-init user code here
        }//GEN-BEGIN:|27-getter|2|
        return stringItem;
    }
    //</editor-fold>//GEN-END:|27-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem1 ">//GEN-BEGIN:|28-getter|0|28-preInit
    /**
     * Returns an initiliazed instance of stringItem1 component.
     * @return the initialized component instance
     */
    public StringItem getStringItem1() {
        if (stringItem1 == null) {//GEN-END:|28-getter|0|28-preInit
            // write pre-init user code here
            stringItem1 = new StringItem("", ".");//GEN-BEGIN:|28-getter|1|28-postInit
            stringItem1.setLayout(ImageItem.LAYOUT_DEFAULT | Item.LAYOUT_SHRINK | Item.LAYOUT_2);//GEN-END:|28-getter|1|28-postInit
            // write post-init user code here
        }//GEN-BEGIN:|28-getter|2|
        return stringItem1;
    }
    //</editor-fold>//GEN-END:|28-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem2 ">//GEN-BEGIN:|29-getter|0|29-preInit
    /**
     * Returns an initiliazed instance of stringItem2 component.
     * @return the initialized component instance
     */
    public StringItem getStringItem2() {
        if (stringItem2 == null) {//GEN-END:|29-getter|0|29-preInit
            // write pre-init user code here
            stringItem2 = new StringItem("", ".");//GEN-LINE:|29-getter|1|29-postInit
            // write post-init user code here
        }//GEN-BEGIN:|29-getter|2|
        return stringItem2;
    }
    //</editor-fold>//GEN-END:|29-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem3 ">//GEN-BEGIN:|30-getter|0|30-preInit
    /**
     * Returns an initiliazed instance of stringItem3 component.
     * @return the initialized component instance
     */
    public StringItem getStringItem3() {
        if (stringItem3 == null) {//GEN-END:|30-getter|0|30-preInit
            // write pre-init user code here
            stringItem3 = new StringItem("", ".");//GEN-LINE:|30-getter|1|30-postInit
            // write post-init user code here
        }//GEN-BEGIN:|30-getter|2|
        return stringItem3;
    }
    //</editor-fold>//GEN-END:|30-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem4 ">//GEN-BEGIN:|31-getter|0|31-preInit
    /**
     * Returns an initiliazed instance of stringItem4 component.
     * @return the initialized component instance
     */
    public StringItem getStringItem4() {
        if (stringItem4 == null) {//GEN-END:|31-getter|0|31-preInit
            // write pre-init user code here
            stringItem4 = new StringItem("", "/");//GEN-LINE:|31-getter|1|31-postInit
            // write post-init user code here
        }//GEN-BEGIN:|31-getter|2|
        return stringItem4;
    }
    //</editor-fold>//GEN-END:|31-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: Ok ">//GEN-BEGIN:|32-getter|0|32-preInit
    /**
     * Returns an initiliazed instance of Ok component.
     * @return the initialized component instance
     */
    public Command getOk() {
        if (Ok == null) {//GEN-END:|32-getter|0|32-preInit
            // write pre-init user code here
            Ok = new Command("Ok", Command.OK, 0);//GEN-LINE:|32-getter|1|32-postInit
            // write post-init user code here
        }//GEN-BEGIN:|32-getter|2|
        return Ok;
    }
    //</editor-fold>//GEN-END:|32-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: mascaraDeSubred ">//GEN-BEGIN:|34-getter|0|34-preInit
    /**
     * Returns an initiliazed instance of mascaraDeSubred component.
     * @return the initialized component instance
     */
    public StringItem getMascaraDeSubred() {
        if (mascaraDeSubred == null) {//GEN-END:|34-getter|0|34-preInit
            // write pre-init user code here
            mascaraDeSubred = new StringItem("M\u00E1scara de Subred:", null);//GEN-LINE:|34-getter|1|34-postInit
            // write post-init user code here
        }//GEN-BEGIN:|34-getter|2|
        return mascaraDeSubred;
    }
    //</editor-fold>//GEN-END:|34-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: direccionDeRed ">//GEN-BEGIN:|35-getter|0|35-preInit
    /**
     * Returns an initiliazed instance of direccionDeRed component.
     * @return the initialized component instance
     */
    public StringItem getDireccionDeRed() {
        if (direccionDeRed == null) {//GEN-END:|35-getter|0|35-preInit
            // write pre-init user code here
            direccionDeRed = new StringItem("Direcci\u00F3n de Red:", null);//GEN-LINE:|35-getter|1|35-postInit
            // write post-init user code here
        }//GEN-BEGIN:|35-getter|2|
        return direccionDeRed;
    }
    //</editor-fold>//GEN-END:|35-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: direccionBroadcast ">//GEN-BEGIN:|36-getter|0|36-preInit
    /**
     * Returns an initiliazed instance of direccionBroadcast component.
     * @return the initialized component instance
     */
    public StringItem getDireccionBroadcast() {
        if (direccionBroadcast == null) {//GEN-END:|36-getter|0|36-preInit
            // write pre-init user code here
            direccionBroadcast = new StringItem("Direcci\u00F3n Broadcast:", null);//GEN-LINE:|36-getter|1|36-postInit
            // write post-init user code here
        }//GEN-BEGIN:|36-getter|2|
        return direccionBroadcast;
    }
    //</editor-fold>//GEN-END:|36-getter|2|





    /**
     * Returns a display instance.
     * @return the display instance.
     */
    public Display getDisplay () {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        switchDisplayable (null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started.
     * Checks whether the MIDlet have been already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet ();
        } else {
            initialize ();
            startMIDlet ();
        }
        midletPaused = false;
    }

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     * @param unconditional if true, then the MIDlet has to be unconditionally terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
    }

}
