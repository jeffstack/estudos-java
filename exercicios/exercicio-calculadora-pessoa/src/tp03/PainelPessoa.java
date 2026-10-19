package tp03;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class PainelPessoa extends JPanel {

    private final JTextField campoNumero;
    private final JTextField campoNome;
    private final JTextField campoIdade;
    private final JRadioButton radioMasculino;
    private final JRadioButton radioFeminino;
    private Pessoa umaPessoa;

    // Jefferson Nascimento
    public PainelPessoa() {
        setLayout(new BorderLayout(5, 5));

        JPanel campos = new JPanel(new GridLayout(4, 2, 4, 4));
        campoNumero = new JTextField();
        campoNumero.setEditable(false);
        campoNome = new JTextField();
        campoIdade = new JTextField();

        radioMasculino = new JRadioButton("M");
        radioFeminino = new JRadioButton("F");
        ButtonGroup grupoSexo = new ButtonGroup();
        grupoSexo.add(radioMasculino);
        grupoSexo.add(radioFeminino);
        JPanel painelSexo = new JPanel();
        painelSexo.add(radioMasculino);
        painelSexo.add(radioFeminino);

        campos.add(new JLabel("Número:"));
        campos.add(campoNumero);
        campos.add(new JLabel("Nome:"));
        campos.add(campoNome);
        campos.add(new JLabel("Sexo:"));
        campos.add(painelSexo);
        campos.add(new JLabel("Idade:"));
        campos.add(campoIdade);
        add(campos, BorderLayout.CENTER);

        JPanel botoes = new JPanel(new GridLayout(1, 4, 3, 3));
        JButton botaoOk = new JButton("OK");
        JButton botaoLimpar = new JButton("Limpar");
        JButton botaoMostrar = new JButton("Mostrar");
        JButton botaoSair = new JButton("Sair");
        botoes.add(botaoOk);
        botoes.add(botaoLimpar);
        botoes.add(botaoMostrar);
        botoes.add(botaoSair);
        add(botoes, BorderLayout.SOUTH);

        botaoOk.addActionListener(e -> salvarPessoa());
        botaoLimpar.addActionListener(e -> limparCampos());
        botaoMostrar.addActionListener(e -> mostrarPessoa());
        botaoSair.addActionListener(e -> System.exit(0));
    }

    // Jefferson Nascimento
    private void salvarPessoa() {
        try {
            String nome = campoNome.getText().trim();
            String idadeTexto = campoIdade.getText().trim();

            if (nome.isEmpty() || idadeTexto.isEmpty()
                    || (!radioMasculino.isSelected() && !radioFeminino.isSelected())) {
                throw new IllegalArgumentException("Preencha Nome, Sexo e Idade.");
            }

            int idade = Integer.parseInt(idadeTexto);
            if (idade < 0) {
                throw new IllegalArgumentException("A idade deve ser um número válido.");
            }

            char sexo = radioMasculino.isSelected() ? 'M' : 'F';
            umaPessoa = new Pessoa();
            umaPessoa.setNome(nome);
            umaPessoa.setSexo(sexo);
            umaPessoa.setIdade(idade);
            umaPessoa.setKp();
            campoNumero.setText(String.valueOf(umaPessoa.getKp()));
            JOptionPane.showMessageDialog(this, "Dados transferidos para UmaPessoa.");
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(this, "A idade deve ser um número inteiro.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            campoNome.requestFocus();
        }
    }

    // Jefferson Nascimento
    private void mostrarPessoa() {
        try {
            if (umaPessoa == null) {
                throw new IllegalStateException("Nenhuma pessoa foi cadastrada.");
            }

            String mensagem = "Número: " + umaPessoa.getKp()
                    + "\nNome: " + umaPessoa.getNome()
                    + "\nSexo: " + umaPessoa.getSexo()
                    + "\nIdade: " + umaPessoa.getIdade()
                    + "\nKp: " + umaPessoa.getKp();
            JOptionPane.showMessageDialog(this, mensagem);
        } catch (IllegalStateException erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            campoNome.requestFocus();
        }
    }

    // Jefferson Nascimento
    private void limparCampos() {
        campoNumero.setText("");
        campoNome.setText("");
        campoIdade.setText("");
        radioMasculino.setSelected(false);
        radioFeminino.setSelected(false);
        campoNome.requestFocus();
    }
}
