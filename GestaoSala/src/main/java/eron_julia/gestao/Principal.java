/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package eron_julia.gestao;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eronilson e Julia
 */
public class Principal extends javax.swing.JFrame {

    ArrayList<Instituto> ListaIns;
    ArrayList<Materia> ListaMat;
    String modo;
    
    public void LoadTableIns(){
        
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Id", 
            "Numero", "Tipo", "Bloco"},0);
        
        for(int i=0;i<ListaIns.size();i++){
            
            Object linha[] = new Object[]{ListaIns.get(i).getIdSala(),
                                          ListaIns.get(i).getNumSala(),
                                          ListaIns.get(i).getTipoSala(),
                                          ListaIns.get(i).getBloco()};
            modelo.addRow(linha);
        }
        tb_salas.setModel(modelo);
        tb_salas.getColumnModel().getColumn(0).setPreferredWidth(200);
        tb_salas.getColumnModel().getColumn(1).setPreferredWidth(200);
        tb_salas.getColumnModel().getColumn(2).setPreferredWidth(200);
        tb_salas.getColumnModel().getColumn(3).setPreferredWidth(200);      
    }
    public void LoadTableMat(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Nome", 
                                "Codigo", "Curso", "CHS", "Professor", "Turno", 
                                "Dia", "Horario","Id"},0);
        
        for(int i=0;i<ListaMat.size();i++){
           Object linha[] = new Object[]{ListaMat.get(i).getNomeDisciplina(),
                                         ListaMat.get(i).getCodDisciplina(),
                                         ListaMat.get(i).getCurso(),
                                         ListaMat.get(i).getProfessor(),
                                         ListaMat.get(i).getDiaSemana(),
                                         ListaMat.get(i).getHorario(),
                                         ListaMat.get(i).getCargaHorariaSemanal(),
                                         ListaMat.get(i).getTurno()};
           modelo.addRow(linha);
        }
        tb_disciplinas.setModel(modelo);
        tb_disciplinas.getColumnModel().getColumn(0).setPreferredWidth(200);
        tb_disciplinas.getColumnModel().getColumn(1).setPreferredWidth(200);
        tb_disciplinas.getColumnModel().getColumn(2).setPreferredWidth(200);
        tb_disciplinas.getColumnModel().getColumn(3).setPreferredWidth(200); 
        tb_disciplinas.getColumnModel().getColumn(4).setPreferredWidth(200);
        tb_disciplinas.getColumnModel().getColumn(5).setPreferredWidth(200);
        tb_disciplinas.getColumnModel().getColumn(6).setPreferredWidth(200);
        tb_disciplinas.getColumnModel().getColumn(7).setPreferredWidth(200); 
        tb_disciplinas.getColumnModel().getColumn(8).setPreferredWidth(200);
        
    }
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        ListaIns = new ArrayList();
        ListaMat = new ArrayList();
        modo = "Navegar";
        bt_sala_salva.setEnabled(false);
        bt_sala_cancela.setEnabled(false);
        
        c_sala_id.setEnabled(false);
        c_sala_num.setEnabled(false);
        c_sala_tipo.setEnabled(false);
        c_sala_bloco.setEnabled(false);
        
        c_disc_nome.setEnabled(false);
        c_disc_curso.setEnabled(false);
        c_disc_professor.setEnabled(false);
        c_disc_cod.setEnabled(false);
        c_disc_chs.setEnabled(false);
        //c_disc_id.setEnabled(false);
        cb_turno.setEnabled(false);
        cb_dia.setEnabled(false);
        cb_horario.setEnabled(false);
        
        
    }

    public void ManipulaInterfaceSala(){
        switch(modo){
            case "Navegar":
                bt_sala_salva.setEnabled(false);
                bt_sala_cancela.setEnabled(false);
                
                c_sala_id.setEnabled(false);
                c_sala_num.setEnabled(false);
                c_sala_tipo.setEnabled(false);
                c_sala_bloco.setEnabled(false);
                
                bt_sala_novo.setEnabled(true);
                bt_sala_editar.setEnabled(false);
                bt_sala_exclui.setEnabled(false);
                break;
            case "Novo":
                bt_sala_salva.setEnabled(true);
                bt_sala_cancela.setEnabled(true);
                
                c_sala_id.setEnabled(true);
                c_sala_num.setEnabled(true);
                c_sala_tipo.setEnabled(true);
                c_sala_bloco.setEnabled(true);
                
                bt_sala_novo.setEnabled(false);
                bt_sala_editar.setEnabled(false);
                bt_sala_exclui.setEnabled(false);
                break;
            case "Editar":
                bt_sala_salva.setEnabled(true);
                bt_sala_cancela.setEnabled(true);
                
                c_sala_id.setEnabled(true);
                c_sala_num.setEnabled(true);
                c_sala_tipo.setEnabled(true);
                c_sala_bloco.setEnabled(true);
                
                bt_sala_novo.setEnabled(true);
                bt_sala_editar.setEnabled(false);
                bt_sala_exclui.setEnabled(false);
                
                break;
            case "Excluir":
                bt_sala_salva.setEnabled(false);
                bt_sala_cancela.setEnabled(false);
                
                c_sala_id.setEnabled(false);
                c_sala_num.setEnabled(false);
                c_sala_tipo.setEnabled(false);
                c_sala_bloco.setEnabled(false);
                
                bt_sala_novo.setEnabled(true);
                bt_sala_editar.setEnabled(false);
                bt_sala_exclui.setEnabled(false);
                break;
            case "Selecao":
                bt_sala_salva.setEnabled(false);
                bt_sala_cancela.setEnabled(false);
                
                c_sala_id.setEnabled(false);
                c_sala_num.setEnabled(false);
                c_sala_tipo.setEnabled(false);
                c_sala_bloco.setEnabled(false);
                
                bt_sala_novo.setEnabled(true);
                bt_sala_editar.setEnabled(true);
                bt_sala_exclui.setEnabled(true);
                break;
            default: System.out.println("Modo invalido"); 
                
        }
    }
    
    public void ManipulaInterfaceDisc(){
        switch(modo){
            case "Navegar":
                bt_sala_salva.setEnabled(false);
                bt_sala_cancela.setEnabled(false);
                
                c_disc_nome.setEnabled(false);
                c_disc_curso.setEnabled(false);
                c_disc_professor.setEnabled(false);
                c_disc_cod.setEnabled(false);
                c_disc_chs.setEnabled(false);
                //c_disc_id.setEnabled(false);
                cb_turno.setEnabled(false);
                cb_dia.setEnabled(false);
                cb_horario.setEnabled(false);
                
                bt_sala_novo.setEnabled(true);
                bt_sala_editar.setEnabled(false);
                bt_sala_exclui.setEnabled(false);
                break;
            case "Novo":
                bt_sala_salva.setEnabled(true);
                bt_sala_cancela.setEnabled(true);
                
                c_disc_nome.setEnabled(true);
                c_disc_curso.setEnabled(true);
                c_disc_professor.setEnabled(true);
                c_disc_cod.setEnabled(true);
                c_disc_chs.setEnabled(true);
                //c_disc_id.setEnabled(true);
                cb_turno.setEnabled(true);
                cb_dia.setEnabled(true);
                cb_horario.setEnabled(true);
                
                bt_sala_novo.setEnabled(false);
                bt_sala_editar.setEnabled(false);
                bt_sala_exclui.setEnabled(false);
                break;
            case "Editar":
                bt_sala_salva.setEnabled(true);
                bt_sala_cancela.setEnabled(true);
                
                c_disc_nome.setEnabled(true);
                c_disc_curso.setEnabled(true);
                c_disc_professor.setEnabled(true);
                c_disc_cod.setEnabled(true);
                c_disc_chs.setEnabled(true);
                //c_disc_id.setEnabled(true);
                cb_turno.setEnabled(true);
                cb_dia.setEnabled(true);
                cb_horario.setEnabled(true);
                
                bt_sala_novo.setEnabled(true);
                bt_sala_editar.setEnabled(false);
                bt_sala_exclui.setEnabled(false);
                
                break;
            case "Excluir":
                bt_sala_salva.setEnabled(false);
                bt_sala_cancela.setEnabled(false);
                
                c_disc_nome.setEnabled(false);
                c_disc_curso.setEnabled(false);
                c_disc_professor.setEnabled(false);
                c_disc_cod.setEnabled(false);
                c_disc_chs.setEnabled(false);
                //c_disc_id.setEnabled(false);
                cb_turno.setEnabled(false);
                cb_dia.setEnabled(false);
                cb_horario.setEnabled(false);
                
                bt_sala_novo.setEnabled(true);
                bt_sala_editar.setEnabled(false);
                bt_sala_exclui.setEnabled(false);
                break;
            case "Selecao":
                bt_sala_salva.setEnabled(false);
                bt_sala_cancela.setEnabled(false);
                
                c_disc_nome.setEnabled(false);
                c_disc_curso.setEnabled(false);
                c_disc_professor.setEnabled(false);
                c_disc_cod.setEnabled(false);
                c_disc_chs.setEnabled(false);
                //c_disc_id.setEnabled(false);
                cb_turno.setEnabled(false);
                cb_dia.setEnabled(false);
                cb_horario.setEnabled(false);
                
                bt_sala_novo.setEnabled(true);
                bt_sala_editar.setEnabled(true);
                bt_sala_exclui.setEnabled(true);
                break;
            default: System.out.println("Modo invalido"); 
                
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        bt_disc_novo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_disciplinas = new javax.swing.JTable();
        bt_disc_editar = new javax.swing.JButton();
        bt_disc_exclui = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        c_disc_nome = new javax.swing.JTextField();
        c_disc_cod = new javax.swing.JTextField();
        bt_disc_salva = new javax.swing.JButton();
        bt_disc_cancela = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        c_disc_chs = new javax.swing.JTextField();
        c_disc_professor = new javax.swing.JTextField();
        c_disc_curso = new javax.swing.JTextField();
        cb_turno = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        cb_dia = new javax.swing.JComboBox<>();
        cb_horario = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_salas = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        c_sala_id = new javax.swing.JTextField();
        c_sala_num = new javax.swing.JTextField();
        bt_sala_salva = new javax.swing.JButton();
        bt_sala_cancela = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        c_sala_bloco = new javax.swing.JTextField();
        c_sala_tipo = new javax.swing.JTextField();
        bt_sala_novo = new javax.swing.JButton();
        bt_sala_editar = new javax.swing.JButton();
        bt_sala_exclui = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        jMenu1.setText("jMenu1");

        jInternalFrame1.setVisible(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 300));
        setLocationByPlatform(true);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        bt_disc_novo.setText("Novo");
        bt_disc_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_disc_novoActionPerformed(evt);
            }
        });

        tb_disciplinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Codigo", "Curso", "CHS", "Professor", "Turno", "Dia", "Horario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_disciplinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_disciplinasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_disciplinas);
        if (tb_disciplinas.getColumnModel().getColumnCount() > 0) {
            tb_disciplinas.getColumnModel().getColumn(0).setPreferredWidth(200);
            tb_disciplinas.getColumnModel().getColumn(1).setPreferredWidth(200);
            tb_disciplinas.getColumnModel().getColumn(2).setPreferredWidth(200);
            tb_disciplinas.getColumnModel().getColumn(3).setPreferredWidth(200);
            tb_disciplinas.getColumnModel().getColumn(4).setPreferredWidth(200);
            tb_disciplinas.getColumnModel().getColumn(5).setPreferredWidth(200);
            tb_disciplinas.getColumnModel().getColumn(6).setPreferredWidth(200);
            tb_disciplinas.getColumnModel().getColumn(7).setPreferredWidth(200);
        }

        bt_disc_editar.setText("Editar");
        bt_disc_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_disc_editarActionPerformed(evt);
            }
        });

        bt_disc_exclui.setText("Excluir");
        bt_disc_exclui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_disc_excluiActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        jLabel3.setText("Nome");

        jLabel4.setText("Codigo");

        c_disc_cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_disc_codActionPerformed(evt);
            }
        });

        bt_disc_salva.setText("Salvar");
        bt_disc_salva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_disc_salvaActionPerformed(evt);
            }
        });

        bt_disc_cancela.setText("Cancelar");
        bt_disc_cancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_disc_cancelaActionPerformed(evt);
            }
        });

        jLabel7.setText("Curso");

        jLabel8.setText("CHS");

        jLabel9.setText("Professor");

        jLabel10.setText("Turno");

        jLabel11.setText("Dia");

        cb_turno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "T", "N" }));
        cb_turno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_turnoActionPerformed(evt);
            }
        });

        jLabel13.setText("Horario");

        cb_dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Segunda", "Terça", "Quarta"
            ,"Quinta" ,"Sexta" }));
cb_dia.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        cb_diaActionPerformed(evt);
    }
    });

    cb_horario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AB", "CD", "ABCD" }));
    cb_horario.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cb_horarioActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(bt_disc_salva)
                            .addGap(18, 18, 18)
                            .addComponent(bt_disc_cancela))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel7)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(c_disc_nome, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                                .addComponent(c_disc_curso)
                                .addComponent(c_disc_professor))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel8))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(c_disc_chs, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                                .addComponent(c_disc_cod))
                            .addGap(19, 19, 19)))
                    .addContainerGap())
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_turno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addGap(18, 18, 18)
                            .addComponent(cb_horario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(147, 544, Short.MAX_VALUE))))
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(c_disc_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(c_disc_cod, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                    .addGap(74, 74, 74))
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(c_disc_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(c_disc_chs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addGap(18, 18, 18)))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel9)
                .addComponent(c_disc_professor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(27, 27, 27)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel10)
                .addComponent(cb_turno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel11)
                .addComponent(cb_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel13)
                .addComponent(cb_horario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(13, 13, 13)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(bt_disc_salva)
                .addComponent(bt_disc_cancela))
            .addContainerGap())
    );

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(125, 125, 125)
                    .addComponent(bt_disc_novo)
                    .addGap(18, 18, 18)
                    .addComponent(bt_disc_editar)
                    .addGap(18, 18, 18)
                    .addComponent(bt_disc_exclui)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE))
            .addContainerGap())
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(16, 16, 16)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(bt_disc_novo)
                .addComponent(bt_disc_editar)
                .addComponent(bt_disc_exclui))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jTabbedPane1.addTab("Disciplinas", jPanel2);

    tb_salas.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        },
        new String [] {
            "Id", "Numero", "Tipo", "Bloco"
        }
    ) {
        Class[] types = new Class [] {
            java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
        };
        boolean[] canEdit = new boolean [] {
            false, false, false, false
        };

        public Class getColumnClass(int columnIndex) {
            return types [columnIndex];
        }

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    tb_salas.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tb_salasMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(tb_salas);
    if (tb_salas.getColumnModel().getColumnCount() > 0) {
        tb_salas.getColumnModel().getColumn(0).setPreferredWidth(200);
        tb_salas.getColumnModel().getColumn(1).setPreferredWidth(200);
        tb_salas.getColumnModel().getColumn(2).setPreferredWidth(200);
        tb_salas.getColumnModel().getColumn(3).setPreferredWidth(200);
    }

    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

    jLabel1.setText("Id");

    jLabel2.setText("Numero");

    c_sala_num.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            c_sala_numActionPerformed(evt);
        }
    });

    bt_sala_salva.setText("Salvar");
    bt_sala_salva.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            bt_sala_salvaActionPerformed(evt);
        }
    });

    bt_sala_cancela.setText("Cancelar");
    bt_sala_cancela.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            bt_sala_cancelaActionPerformed(evt);
        }
    });

    jLabel5.setText("Bloco");

    jLabel6.setText("Tipo");

    c_sala_bloco.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            c_sala_blocoActionPerformed(evt);
        }
    });

    c_sala_tipo.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            c_sala_tipoActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(bt_sala_cancela)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(bt_sala_salva, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(c_sala_tipo, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                                .addComponent(c_sala_bloco)
                                .addComponent(c_sala_num)
                                .addComponent(c_sala_id))))
                    .addGap(180, 180, 180)))
            .addContainerGap())
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(14, 14, 14)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(c_sala_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(20, 20, 20)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(c_sala_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5)
                .addComponent(c_sala_bloco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6)
                .addComponent(c_sala_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(26, 26, 26)
            .addComponent(bt_sala_salva)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
            .addComponent(bt_sala_cancela)
            .addGap(14, 14, 14))
    );

    bt_sala_novo.setText("Novo");
    bt_sala_novo.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            bt_sala_novoActionPerformed(evt);
        }
    });

    bt_sala_editar.setText("Editar");
    bt_sala_editar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            bt_sala_editarActionPerformed(evt);
        }
    });

    bt_sala_exclui.setText("Excluir");
    bt_sala_exclui.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            bt_sala_excluiActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(224, 224, 224)
            .addComponent(bt_sala_novo)
            .addGap(49, 49, 49)
            .addComponent(bt_sala_editar)
            .addGap(47, 47, 47)
            .addComponent(bt_sala_exclui)
            .addGap(0, 0, Short.MAX_VALUE))
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane1))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap(65, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(bt_sala_novo)
                .addComponent(bt_sala_editar)
                .addComponent(bt_sala_exclui))
            .addGap(26, 26, 26)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );

    jTabbedPane1.addTab("Sala", jPanel1);

    setJMenuBar(jMenuBar1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 25, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_sala_excluiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sala_excluiActionPerformed
        int index = tb_salas.getSelectedRow();
        if(index >= 0 && index < ListaIns.size()){
            ListaIns.remove(index);
        }
        LoadTableIns();
        modo = "Navegar";
        ManipulaInterfaceSala();
    }//GEN-LAST:event_bt_sala_excluiActionPerformed

    private void bt_sala_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sala_editarActionPerformed
        modo = "Editar";
        ManipulaInterfaceSala();
    }//GEN-LAST:event_bt_sala_editarActionPerformed

    private void bt_sala_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sala_novoActionPerformed
        c_sala_id.setText("");
        c_sala_num.setText("");
        c_sala_tipo.setText("");
        c_sala_bloco.setText("");
        modo = "Novo";
        ManipulaInterfaceSala();
    }//GEN-LAST:event_bt_sala_novoActionPerformed

    private void c_sala_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_sala_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_sala_tipoActionPerformed

    private void c_sala_blocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_sala_blocoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_sala_blocoActionPerformed

    private void bt_sala_cancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sala_cancelaActionPerformed
        c_sala_id.setText("");
        c_sala_num.setText("");
        c_sala_tipo.setText("");
        c_sala_bloco.setText("");
        modo = "Navegar";
        ManipulaInterfaceSala();
    }//GEN-LAST:event_bt_sala_cancelaActionPerformed

    private void bt_sala_salvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sala_salvaActionPerformed
        if(modo.equals("Novo")){
            int num = Integer.parseInt(c_sala_num.getText());
            int bloco = Integer.parseInt(c_sala_bloco.getText());
            Instituto t = new Instituto(String.valueOf(c_sala_id.getText()), num
                ,c_sala_tipo.getText(),bloco);
            ListaIns.add(t);
        }else if (modo.equals("Editar")){
            int index = tb_salas.getSelectedRow();
            int num = Integer.parseInt(c_sala_num.getText());
            int bloco = Integer.parseInt(c_sala_bloco.getText());
            ListaIns.get(index).setIdSala(c_sala_id.getText());
            ListaIns.get(index).setNumSala(num);
            ListaIns.get(index).setTipoSala(c_sala_tipo.getText());
            ListaIns.get(index).setBloco(bloco);
        }
        LoadTableIns();
        c_sala_id.setText("");
        c_sala_num.setText("");
        c_sala_tipo.setText("");
        c_sala_bloco.setText("");
        modo = "Navegar";
        ManipulaInterfaceSala();
    }//GEN-LAST:event_bt_sala_salvaActionPerformed

    private void c_sala_numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_sala_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_sala_numActionPerformed

    private void tb_salasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_salasMouseClicked
        int index = tb_salas.getSelectedRow();
        if(index >= 0 && index < ListaIns.size()){
            Instituto t = ListaIns.get(index);
            c_sala_id.setText(t.idSala);
            c_sala_num.setText(String.valueOf(t.numSala));
            c_sala_tipo.setText(t.tipoSala);
            c_sala_bloco.setText(String.valueOf(t.bloco));
            modo = "Selecao";
            ManipulaInterfaceSala();
        }

    }//GEN-LAST:event_tb_salasMouseClicked

    private void cb_horarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_horarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_horarioActionPerformed

    private void cb_diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_diaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_diaActionPerformed

    private void cb_turnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_turnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_turnoActionPerformed

    private void bt_disc_cancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_disc_cancelaActionPerformed
        c_disc_nome.setText("");
        c_disc_cod.setText("");
        c_disc_curso.setText("");
        c_disc_professor.setText("");
        c_disc_chs.setText("");

        modo = "Navegar";
        ManipulaInterfaceDisc();
    }//GEN-LAST:event_bt_disc_cancelaActionPerformed

    private void bt_disc_salvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_disc_salvaActionPerformed
        if(modo.equals("Novo")){
            int CHS = Integer.parseInt(c_disc_chs.getText());
            Materia m = new Materia(String.valueOf(c_disc_nome.getText()),
                c_disc_cod.getText(), c_disc_curso.getText(), c_disc_professor.getText()
                ,String.valueOf(cb_dia.getSelectedItem()),
                String.valueOf(cb_horario.getSelectedItem()),
                CHS, String.valueOf(cb_turno.getSelectedItem()));
            ListaMat.add(m);
        }else if (modo.equals("Editar")){
            int index = tb_disciplinas.getSelectedRow();
            int CHS = Integer.parseInt(c_disc_chs.getText());
            ListaMat.get(index).setNomeDisciplina(c_disc_nome.getText());
            ListaMat.get(index).setCodDisciplina(c_disc_cod.getText());
            ListaMat.get(index).setCurso(c_disc_curso.getText());
            ListaMat.get(index).setProfessor(c_disc_professor.getText());
            ListaMat.get(index).setDiaSemana(String.valueOf(cb_dia.getSelectedItem()));
            ListaMat.get(index).setHorario(String.valueOf(cb_horario.getSelectedItem()));
            ListaMat.get(index).setCargaHorariaSemanal(CHS);
            ListaMat.get(index).setTurno(String.valueOf(cb_turno.getSelectedItem()));
        }
        LoadTableMat();
        c_disc_nome.setText("");
        c_disc_cod.setText("");
        c_disc_curso.setText("");
        c_disc_professor.setText("");
        c_disc_chs.setText("");

        modo = "Navegar";
        ManipulaInterfaceDisc();
    }//GEN-LAST:event_bt_disc_salvaActionPerformed

    private void c_disc_codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_disc_codActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_disc_codActionPerformed

    private void bt_disc_excluiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_disc_excluiActionPerformed
        int index = tb_disciplinas.getSelectedRow();
        if(index >= 0 && index < ListaMat.size()){
            ListaMat.remove(index);

        }
        LoadTableMat();
        modo = "Navegar";
        ManipulaInterfaceDisc();
    }//GEN-LAST:event_bt_disc_excluiActionPerformed

    private void bt_disc_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_disc_editarActionPerformed
        modo = "Editar";
        ManipulaInterfaceDisc();
    }//GEN-LAST:event_bt_disc_editarActionPerformed

    private void tb_disciplinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_disciplinasMouseClicked
        int index = tb_disciplinas.getSelectedRow();
        if(index >= 0 && index < ListaMat.size()){
            Materia x = ListaMat.get(index);

            c_disc_nome.setText(x.nomeDisciplina);
            c_disc_cod.setText(x.codDisciplina);
            c_disc_curso.setText(x.curso);
            c_disc_professor.setText(x.professor);
            c_disc_chs.setText(String.valueOf(x.CargaHorariaSemanal));
            cb_turno.setSelectedItem(x.turno);
            cb_dia.setSelectedItem(x.diaSemana);
            cb_horario.setSelectedItem(x.horario);
            modo = "Selecao";
            ManipulaInterfaceDisc();
        }
    }//GEN-LAST:event_tb_disciplinasMouseClicked

    private void bt_disc_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_disc_novoActionPerformed
        c_disc_nome.setText("");
        c_disc_cod.setText("");
        c_disc_curso.setText("");
        c_disc_professor.setText("");
        c_disc_chs.setText("");

        modo = "Novo";
        ManipulaInterfaceDisc();
    }//GEN-LAST:event_bt_disc_novoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_disc_cancela;
    private javax.swing.JButton bt_disc_editar;
    private javax.swing.JButton bt_disc_exclui;
    private javax.swing.JButton bt_disc_novo;
    private javax.swing.JButton bt_disc_salva;
    private javax.swing.JButton bt_sala_cancela;
    private javax.swing.JButton bt_sala_editar;
    private javax.swing.JButton bt_sala_exclui;
    private javax.swing.JButton bt_sala_novo;
    private javax.swing.JButton bt_sala_salva;
    private javax.swing.JTextField c_disc_chs;
    private javax.swing.JTextField c_disc_cod;
    private javax.swing.JTextField c_disc_curso;
    private javax.swing.JTextField c_disc_nome;
    private javax.swing.JTextField c_disc_professor;
    private javax.swing.JTextField c_sala_bloco;
    private javax.swing.JTextField c_sala_id;
    private javax.swing.JTextField c_sala_num;
    private javax.swing.JTextField c_sala_tipo;
    private javax.swing.JComboBox<String> cb_dia;
    private javax.swing.JComboBox<String> cb_horario;
    private javax.swing.JComboBox<String> cb_turno;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tb_disciplinas;
    private javax.swing.JTable tb_salas;
    // End of variables declaration//GEN-END:variables
}
