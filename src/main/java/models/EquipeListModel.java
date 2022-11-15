package models;

import javax.swing.*;
import java.util.List;

public class EquipeListModel extends AbstractListModel {

    private List<AlunoModel> alunos;

    public EquipeListModel(List<AlunoModel> alunos) {
        this.alunos = alunos;
    }

    @Override
    public int getSize() {
        return alunos.size();
    }

    @Override
    public Object getElementAt(int index) {
        return alunos.get(index);
    }
}
