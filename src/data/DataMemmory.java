package data;

import interfaces.IData;

import java.util.LinkedList;
import java.util.List;

import model.Aluno;


public class DataMemmory implements IData {

    
    private static List<Aluno> Alunos = new LinkedList<Aluno>();
  

    public DataMemmory() {
    }

    
    @Override
    public boolean cadastrarAluno(Aluno Aluno) {
        return Alunos.add(Aluno);
    }

    @Override
    public boolean deletarAluno(String idAluno) {
        for (Aluno AlunoTemp : Alunos) {
            if (AlunoTemp.getIdUri().equals(idAluno)) {
                Alunos.remove(AlunoTemp);
                return true;
            }
        }
        return false;
    }

    @Override
    public Aluno buscaAluno(String idAluno) {
        for (Aluno AlunoTemp : Alunos) {
            if ((AlunoTemp.getIdUri().equals(idAluno))) {
                return AlunoTemp;

            }
        }
        return null;
    }
    
    @Override
    public List<Aluno> getListaAlunos() {
        return Alunos;
    }

    

    
}
