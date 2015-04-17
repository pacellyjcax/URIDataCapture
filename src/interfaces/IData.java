package interfaces;

import java.util.List;

import model.Aluno;

public interface IData {

	boolean cadastrarAluno(Aluno Aluno);

	boolean deletarAluno(String idAluno);

	List<Aluno> getListaAlunos();

	Aluno buscaAluno(String idAluno);

}
