/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Util {

    public static void abreTela(JFrame atual,JFrame destino) {
        atual.setVisible(false);
        destino.setVisible(true);
    }
    public static void fecharTela(JFrame jf) {
        jf.setVisible(false);
    }
    public static void fechaSistema(JFrame jf) {
        int diagConfimacao = JOptionPane.showConfirmDialog(null,"Deseja realmente sair do sistema ?","Deseja Fechar?",javax.swing.JOptionPane.YES_NO_OPTION );
        if(diagConfimacao==0){  
            jf.dispose();
            System.exit(0);
          
        }  
    }
    public static boolean apagaRegistro() {
        int diagConfimacao = JOptionPane.showConfirmDialog(null,"Deseja realmente apagar este registro ?","Deseja apagar?",javax.swing.JOptionPane.YES_NO_OPTION );
        if(diagConfimacao==0){  
            return true;
        }  
        return false;
    }
    public static void mostraMensagem(String titulo, String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, titulo,JOptionPane.PLAIN_MESSAGE);        
    }
    
    public static String pegaHora(){
        return "22-10-2013 14:26";
    }
    
}
