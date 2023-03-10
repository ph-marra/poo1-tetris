package Jogo;

import javax.swing.JFrame;
// importação de libs para abertura de arquivos e música
import java.io.File;
import javax.sound.sampled.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class TetrisFrame extends javax.swing.JFrame {
    int dificuldade;
    int tabuleiro;
    String nome;
    boolean modo_cegas;
    boolean modo_petrifica;
    
    public TetrisFrame() {
        this.dificuldade = 1;
        this.tabuleiro = 1;
        this.modo_cegas = false;
        this.modo_petrifica = false;
        this.nome = "SemNome";
        initComponents();
        URL som = TetrisFrame.class.getResource("tetrisTheme.wav");
        AudioClip Som = Applet.newAudioClip(som);
        this.setVisible(true);
        this.pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonGroup_Dificuldades = new javax.swing.ButtonGroup();
        buttonGroup_Tabuleiro = new javax.swing.ButtonGroup();
        buttonGroup_Modo = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        tetrisLogo = new javax.swing.JLabel();
        jLabel_Usuario = new javax.swing.JLabel();
        JTextField_nomeJogador = new javax.swing.JTextField();
        facil = new javax.swing.JRadioButton();
        medio = new javax.swing.JRadioButton();
        dificil = new javax.swing.JRadioButton();
        
        Button_Jogar = new javax.swing.JButton();
        jLabel_Dificuldade = new javax.swing.JLabel();
        jLabel2_Tabuleiro = new javax.swing.JLabel();
        jRadioButton_Quadrado = new javax.swing.JRadioButton();
        jRadioButton_Reduzido = new javax.swing.JRadioButton();
        jRadioButton_Padrao = new javax.swing.JRadioButton();
        jLabel_Modo = new javax.swing.JLabel();
        jRadioButton_AsCegas = new javax.swing.JRadioButton();
        jRadioButton_Petrificacao = new javax.swing.JRadioButton();
        jRadioButton_Classico = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        tetrisLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/tetris.png"))); // NOI18N

        jLabel_Usuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Usuario.setText("USUÁRIO");

        JTextField_nomeJogador.setText("");

        facil.setBackground(new java.awt.Color(0, 0, 0));
        ButtonGroup_Dificuldades.add(facil);
        facil.setForeground(new java.awt.Color(255, 255, 255));
        facil.setText("FÁCIL");
        facil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facilActionPerformed(evt);
            }
        });

        medio.setBackground(new java.awt.Color(0, 0, 0));
        ButtonGroup_Dificuldades.add(medio);
        medio.setForeground(new java.awt.Color(255, 255, 255));
        medio.setText("MÉDIO");
        medio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medioActionPerformed(evt);
            }
        });

        dificil.setBackground(new java.awt.Color(0, 0, 0));
        ButtonGroup_Dificuldades.add(dificil);
        dificil.setForeground(new java.awt.Color(255, 255, 255));
        dificil.setText("DIFÍCIL");
        dificil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dificilActionPerformed(evt);
            }
        });

        Button_Jogar.setBackground(new java.awt.Color(255, 0, 255));
        Button_Jogar.setForeground(new java.awt.Color(102, 255, 51));
        Button_Jogar.setText("JOGAR");
        Button_Jogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_JogarActionPerformed(evt);
            }
        });

        jLabel_Dificuldade.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Dificuldade.setText("DIFICULDADE");

        jLabel2_Tabuleiro.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2_Tabuleiro.setText("TABULEIRO");

        jRadioButton_Quadrado.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup_Tabuleiro.add(jRadioButton_Quadrado);
        jRadioButton_Quadrado.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton_Quadrado.setText("QUADRADO");
        jRadioButton_Quadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_QuadradoActionPerformed(evt);
            }
        });

        jRadioButton_Reduzido.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup_Tabuleiro.add(jRadioButton_Reduzido);
        jRadioButton_Reduzido.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton_Reduzido.setText("REDUZIDO");
        jRadioButton_Reduzido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_ReduzidoActionPerformed(evt);
            }
        });

        jRadioButton_Padrao.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup_Tabuleiro.add(jRadioButton_Padrao);
        jRadioButton_Padrao.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton_Padrao.setText("PADRÃO");
        jRadioButton_Padrao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_PadraoActionPerformed(evt);
            }
        });

        jLabel_Modo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Modo.setText("MODO");

        jRadioButton_AsCegas.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup_Modo.add(jRadioButton_AsCegas);
        jRadioButton_AsCegas.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton_AsCegas.setText("À CEGAS");
        jRadioButton_AsCegas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_AsCegasActionPerformed(evt);
            }
        });

        jRadioButton_Petrificacao.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup_Modo.add(jRadioButton_Petrificacao);
        jRadioButton_Petrificacao.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton_Petrificacao.setText("PETRIFICAÇÃO");
        jRadioButton_Petrificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_PetrificacaoActionPerformed(evt);
            }
        });

        jRadioButton_Classico.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup_Modo.add(jRadioButton_Classico);
        jRadioButton_Classico.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton_Classico.setText("CLÁSSICO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2_Tabuleiro)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(tetrisLogo))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(Button_Jogar)
                            .addGap(133, 133, 133))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel_Usuario)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel_Dificuldade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel_Modo)
                                    .addGap(56, 56, 56)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jRadioButton_Quadrado)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton_Reduzido)
                                    .addGap(18, 18, Short.MAX_VALUE)
                                    .addComponent(jRadioButton_Padrao))
                                .addComponent(JTextField_nomeJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(facil)
                                    .addGap(40, 40, 40)
                                    .addComponent(medio)
                                    .addGap(38, 38, 38)
                                    .addComponent(dificil))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jRadioButton_AsCegas)
                                    .addGap(18, 18, Short.MAX_VALUE)
                                    .addComponent(jRadioButton_Petrificacao)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton_Classico))))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(tetrisLogo)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTextField_nomeJogador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Usuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(facil)
                    .addComponent(medio)
                    .addComponent(dificil)
                    .addComponent(jLabel_Dificuldade))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2_Tabuleiro)
                    .addComponent(jRadioButton_Quadrado)
                    .addComponent(jRadioButton_Reduzido)
                    .addComponent(jRadioButton_Padrao))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Modo)
                    .addComponent(jRadioButton_AsCegas)
                    .addComponent(jRadioButton_Petrificacao)
                    .addComponent(jRadioButton_Classico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(Button_Jogar)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void medioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medioActionPerformed
        // TODO add your handling code here:
        this.dificuldade = 20;
    }//GEN-LAST:event_medioActionPerformed

    private void facilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facilActionPerformed
        this.dificuldade = 1;
    }//GEN-LAST:event_facilActionPerformed

    private void dificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dificilActionPerformed
        this.dificuldade = 40;
    }//GEN-LAST:event_dificilActionPerformed

    private void Button_JogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_JogarActionPerformed
        JFrame x = new JFrame("Fullscreen");
        if(!this.JTextField_nomeJogador.getText().equals(""))
            this.nome = this.JTextField_nomeJogador.getText();
        TetrisPanel tp = new TetrisPanel(x, tabuleiro, this.modo_cegas, this.modo_petrifica, this.dificuldade, this.nome);
        x.add(tp);
        x.setTitle("Tetris");
        x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x.setResizable(true);
        x.pack();
        x.setVisible(true);
        x.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_Button_JogarActionPerformed

    private void jRadioButton_QuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_QuadradoActionPerformed
        this.tabuleiro = 2;
    }//GEN-LAST:event_jRadioButton_QuadradoActionPerformed

    private void jRadioButton_AsCegasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_AsCegasActionPerformed
        this.modo_cegas = true;
        this.modo_petrifica = false;
    }//GEN-LAST:event_jRadioButton_AsCegasActionPerformed

    private void jRadioButton_PetrificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_PetrificacaoActionPerformed
        this.modo_petrifica = true;
        this.modo_cegas = false;
    }//GEN-LAST:event_jRadioButton_PetrificacaoActionPerformed

    private void jRadioButton_ReduzidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_ReduzidoActionPerformed
        this.tabuleiro = 2;
    }//GEN-LAST:event_jRadioButton_ReduzidoActionPerformed

    private void jRadioButton_PadraoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_PadraoActionPerformed
        this.tabuleiro = 1;
    }//GEN-LAST:event_jRadioButton_PadraoActionPerformed
    
    private void jRadioButton_ClassicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_PadraoActionPerformed
        this.modo_cegas = false;
        this.modo_petrifica = false;
    }//GEN-LAST:event_jRadioButton_PadraoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ButtonGroup_Dificuldades;
    private javax.swing.JButton Button_Jogar;
    private javax.swing.JTextField JTextField_nomeJogador;
    private javax.swing.ButtonGroup buttonGroup_Modo;
    private javax.swing.ButtonGroup buttonGroup_Tabuleiro;
    private javax.swing.JRadioButton dificil;
    private javax.swing.JRadioButton facil;
    private javax.swing.JLabel jLabel2_Tabuleiro;
    private javax.swing.JLabel jLabel_Dificuldade;
    private javax.swing.JLabel jLabel_Modo;
    private javax.swing.JLabel jLabel_Usuario;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton_AsCegas;
    private javax.swing.JRadioButton jRadioButton_Classico;
    private javax.swing.JRadioButton jRadioButton_Padrao;
    private javax.swing.JRadioButton jRadioButton_Petrificacao;
    private javax.swing.JRadioButton jRadioButton_Quadrado;
    private javax.swing.JRadioButton jRadioButton_Reduzido;
    private javax.swing.JRadioButton medio;
    private javax.swing.JLabel tetrisLogo;
    // End of variables declaration//GEN-END:variables
}