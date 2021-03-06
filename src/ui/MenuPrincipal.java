package ui;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import util.Util;

public class MenuPrincipal extends javax.swing.JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JButton fecharBtn;
    private JLabel mainLogo;
    private JPanel loginPanel;
    private JLabel jLabel6;
    private JTextField loginText;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JButton jButton6;
    private JLabel background;
    private JPasswordField senhaText;
    private JLabel notificacaoText;
    private JMenuBar barraDeMenus;
    private JMenu cadastroMenu;
    private JMenu relatoriosMenu;
    private JMenu sobreMenu;
    private JMenu sairMenu;
    private JMenu jMenu2;
    private JMenu jMenu3;
    private JMenu jMenu1;
    private JProgressBar loadjProgressBar;
    private JMenu alunosMenu;

    public MenuPrincipal(boolean logado) {
        //Ações executadas no início do sistema
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraDeMenus = new javax.swing.JMenuBar();
        alunosMenu = new javax.swing.JMenu();
        sobreMenu = new javax.swing.JMenu();
        sairMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("URI Data Capture");
        setMinimumSize(new java.awt.Dimension(622, 296));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        alunosMenu.setText("Alunos");
        alunosMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alunosMenuMouseClicked(evt);
            }
        });
        barraDeMenus.add(alunosMenu);

        sobreMenu.setText("Sobre");
        sobreMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sobreMenuMouseClicked(evt);
            }
        });
        barraDeMenus.add(sobreMenu);

        sairMenu.setText("Sair do Sistema");
        sairMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sairMenuMouseClicked(evt);
            }
        });
        barraDeMenus.add(sairMenu);

        setJMenuBar(barraDeMenus);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMenuMouseClicked
        Util.fechaSistema(this);
    }//GEN-LAST:event_sairMenuMouseClicked

    private void sobreMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sobreMenuMouseClicked
        Util.abreTela(this, new SobreUI());
    }//GEN-LAST:event_sobreMenuMouseClicked

    private void alunosMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alunosMenuMouseClicked
        Util.abreTela(this, new CadastroAlunoUI());
    }//GEN-LAST:event_alunosMenuMouseClicked

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuPrincipal(false).setVisible(true);
            }
        });
    }

       
}
/* Erro inapagavel e incompreensivel
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu alunosMenu;
    private javax.swing.JMenuBar barraDeMenus;
    private javax.swing.JMenu sairMenu;
    private javax.swing.JMenu sobreMenu;
    // End of variables declaration//GEN-END:variables
*/