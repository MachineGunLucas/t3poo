
package game;

public class JFrame_Principal extends javax.swing.JFrame {

    /**
     * Creates new form JFrame_Principal
     */
    JFrame_Menus menus;
    JFrame_Select selection;
    
    public JFrame_Principal() {
        initComponents();
        //initAll();
        GameProcess.setEditable(false);
        GameDefault.setGameDefault();
        GameProcess.setText("Game started successfully.\n\n");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Information_Panel = new javax.swing.JPanel();
        Trabalho_3 = new javax.swing.JLabel();
        POO = new javax.swing.JLabel();
        Aluno_Rodrigo = new javax.swing.JLabel();
        Aluno_Lucas = new javax.swing.JLabel();
        Game_Title = new javax.swing.JLabel();
        Game_Title1 = new javax.swing.JLabel();
        MenuGameArea = new javax.swing.JPanel();
        PrincipalButton = new javax.swing.JButton();
        PrincipalButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        GameProcess = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        GAME_Menu = new javax.swing.JMenu();
        Exit_Button = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trabalho 3 - Programação Orientada a Objetos");

        Information_Panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Trabalho_3.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        Trabalho_3.setText("Trabalho 3");

        POO.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        POO.setText("Programação Orientada a Objetos");

        Aluno_Rodrigo.setText("Rodrigo das Neves Bernardi   8066395");

        Aluno_Lucas.setText("Lucas Marques Rovere            8181811");

        Game_Title.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Game_Title.setText("GAME TITLE");

        Game_Title1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Game_Title1.setText("CREATIVE");

        javax.swing.GroupLayout Information_PanelLayout = new javax.swing.GroupLayout(Information_Panel);
        Information_Panel.setLayout(Information_PanelLayout);
        Information_PanelLayout.setHorizontalGroup(
            Information_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Information_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Information_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Information_PanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Trabalho_3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addGroup(Information_PanelLayout.createSequentialGroup()
                        .addGroup(Information_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Information_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(POO, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(Information_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Aluno_Rodrigo)
                                    .addGroup(Information_PanelLayout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(Game_Title))))
                            .addComponent(Aluno_Lucas))
                        .addContainerGap(17, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Information_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Game_Title1)
                .addGap(36, 36, 36))
        );
        Information_PanelLayout.setVerticalGroup(
            Information_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Information_PanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(Game_Title1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Game_Title)
                .addGap(18, 18, 18)
                .addComponent(Trabalho_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(POO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 284, Short.MAX_VALUE)
                .addComponent(Aluno_Lucas, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Aluno_Rodrigo)
                .addContainerGap())
        );

        MenuGameArea.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        PrincipalButton.setText("Play");
        PrincipalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrincipalButtonActionPerformed(evt);
            }
        });

        PrincipalButton1.setText("Avaliar trabalho...");
        PrincipalButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrincipalButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuGameAreaLayout = new javax.swing.GroupLayout(MenuGameArea);
        MenuGameArea.setLayout(MenuGameAreaLayout);
        MenuGameAreaLayout.setHorizontalGroup(
            MenuGameAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuGameAreaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(PrincipalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                .addComponent(PrincipalButton1)
                .addGap(37, 37, 37))
        );
        MenuGameAreaLayout.setVerticalGroup(
            MenuGameAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuGameAreaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(MenuGameAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrincipalButton)
                    .addComponent(PrincipalButton1))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        GameProcess.setColumns(20);
        GameProcess.setRows(5);
        jScrollPane1.setViewportView(GameProcess);

        GAME_Menu.setText("GAME");

        Exit_Button.setText("Exit");
        Exit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_ButtonActionPerformed(evt);
            }
        });
        GAME_Menu.add(Exit_Button);

        jMenuBar1.add(GAME_Menu);

        jMenu2.setText("Editar");

        jMenuItem1.setText("Fonte");
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MenuGameArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(Information_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Information_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MenuGameArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Exit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_ButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Exit_ButtonActionPerformed

    private void PrincipalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrincipalButtonActionPerformed
        menus = new JFrame_Menus();
        menus.setVisible(true);
        //System.out.println(menus.number);
    }//GEN-LAST:event_PrincipalButtonActionPerformed

    private void PrincipalButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrincipalButton1ActionPerformed
        
    }//GEN-LAST:event_PrincipalButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Aluno_Lucas;
    private javax.swing.JLabel Aluno_Rodrigo;
    private javax.swing.JMenuItem Exit_Button;
    private javax.swing.JMenu GAME_Menu;
    private javax.swing.JTextArea GameProcess;
    private javax.swing.JLabel Game_Title;
    private javax.swing.JLabel Game_Title1;
    private javax.swing.JPanel Information_Panel;
    private javax.swing.JPanel MenuGameArea;
    private javax.swing.JLabel POO;
    private javax.swing.JButton PrincipalButton;
    private javax.swing.JButton PrincipalButton1;
    private javax.swing.JLabel Trabalho_3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
