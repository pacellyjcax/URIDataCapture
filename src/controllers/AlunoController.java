/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import system.Config;
import model.Aluno;
import model.ProblemaResolvido;
import system.DataCapture;

public class AlunoController {

    public static void cadastrarAluno(String IDURI) throws Exception {

        if (!IDURI.isEmpty()) {
            try {
                Aluno alunoTemp = new Aluno(IDURI, IDURI);
                double pontosExtras = 0;
                for (ProblemaResolvido pro : DataCapture.getProblemasResolvidos(IDURI)) {
                    int lvl = Integer.parseInt(pro.getLevel());
                    if (lvl >= 2) {
                        pontosExtras += 0.05;
                    } else {
                        pontosExtras += 0.02;
                    }
                    alunoTemp.addProblemas(pro);
                }
                alunoTemp.setPontosExtras(pontosExtras);
                alunoTemp.setNome(DataCapture.getNome(IDURI));
                Config.dataManager.cadastrarAluno(alunoTemp);
            } catch (Exception e) {
                e.printStackTrace();
                throw new Exception("Erro ao Cadastrar na Base de Dados !");
            }
        } else {
            throw new Exception("ID Inválido");


        }
    }

    public static TableModel getListModel() {
        //Dados
        List<Aluno> dadosTemp = Config.dataManager.getListaAlunos();
        String[][] modelTemp;
        modelTemp = new String[dadosTemp.size()][3];
        for (int i = 0; i < dadosTemp.size(); i++) {
            String idURI = dadosTemp.get(i).getIdUri();
            String nome = dadosTemp.get(i).getNome();
            double pontosExtras = dadosTemp.get(i).getPontosExtras();
            modelTemp[i][0] = idURI;
            modelTemp[i][1] = nome;
            modelTemp[i][2] = String.format("%.2f", pontosExtras);
        }

        //Cabeçalho
        String[] headersTemp;
        headersTemp = new String[3];
        headersTemp[0] = "ID URI";
        headersTemp[1] = "Nome";
        headersTemp[2] = "Pontos Extras";

        //TableModel
        TableModel tableModelTemp = new DefaultTableModel(modelTemp, headersTemp);

        //Retorno
        return tableModelTemp;
    }

    public static TableModel getListProblemaModel(Aluno aluno) {
        //Dados
        List<ProblemaResolvido> dadosTemp = aluno.getProblemas();
        String[][] modelTemp;
        modelTemp = new String[dadosTemp.size()][8];
        for (int i = 0; i < dadosTemp.size(); i++) {
            String id = dadosTemp.get(i).getId();
            String descricao = dadosTemp.get(i).getDescricao();
            String level = dadosTemp.get(i).getLevel();
            String ranking = dadosTemp.get(i).getRanking();
            String submissao = dadosTemp.get(i).getSubmissao();
            String linguagem = dadosTemp.get(i).getLinguagem();
            String tempo = dadosTemp.get(i).getTempo();
            String datadaSubmissao = dadosTemp.get(i).getDatadaSubmissao();
            modelTemp[i][0] = id;
            modelTemp[i][1] = descricao;
            modelTemp[i][2] = level;
            modelTemp[i][3] = ranking;
            modelTemp[i][4] = submissao;
            modelTemp[i][5] = linguagem;
            modelTemp[i][6] = tempo;
            modelTemp[i][7] = datadaSubmissao;
        }

        //Cabeçalho
        String[] headersTemp;
        headersTemp = new String[8];
        headersTemp[0] = "ID";
        headersTemp[1] = "Descrição";
        headersTemp[2] = "Level";
        headersTemp[3] = "Ranking";
        headersTemp[4] = "Submissão";
        headersTemp[5] = "Linguagem";
        headersTemp[6] = "Tempo";
        headersTemp[7] = "Data Da Submissão";

        //TableModel
        TableModel tableModelTemp = new DefaultTableModel(modelTemp, headersTemp);

        //Retorno
        return tableModelTemp;
    }

    public static Aluno getAlunoPorId(String idAluno) {
        Aluno pessoaTemp = Config.dataManager.buscaAluno(idAluno);
        return pessoaTemp;
    }

    public static void removerAlunoPorId(String idAluno) {
        Config.dataManager.deletarAluno(idAluno);
    }
}
