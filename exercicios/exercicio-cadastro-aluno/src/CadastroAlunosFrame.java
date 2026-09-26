import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CadastroAlunosFrame extends JFrame {

    private static final long serialVersionUID = 1L;

    private JTextField campoNome;
    private JTextField campoIdade;
    private JTextField campoEndereco;
    private List<Aluno> alunos;

    public CadastroAlunosFrame() {
        alunos = new ArrayList<>();

        setTitle("Cadastro de Alunos");
        setSize(400, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painelPrincipal = new JPanel(new BorderLayout());
        JPanel painelSuperior = new JPanel(new GridLayout(3, 2, 10, 10));
        JPanel painelInferior = new JPanel(new GridLayout(1, 4));

        campoNome = new JTextField();
        campoIdade = new JTextField();
        campoEndereco = new JTextField();

        painelSuperior.add(new JLabel("Nome:"));
        painelSuperior.add(campoNome);
        painelSuperior.add(new JLabel("Idade:"));
        painelSuperior.add(campoIdade);
        painelSuperior.add(new JLabel("Endereço:"));
        painelSuperior.add(campoEndereco);

        JButton botaoOk = new JButton("Ok");
        JButton botaoLimpar = new JButton("Limpar");
        JButton botaoMostrar = new JButton("Mostrar");
        JButton botaoSair = new JButton("Sair");

        painelInferior.add(botaoOk);
        painelInferior.add(botaoLimpar);
        painelInferior.add(botaoMostrar);
        painelInferior.add(botaoSair);

        painelPrincipal.add(painelSuperior, BorderLayout.CENTER);
        painelPrincipal.add(painelInferior, BorderLayout.SOUTH);
        add(painelPrincipal);

        botaoOk.addActionListener(evento -> cadastrarAluno());
        botaoLimpar.addActionListener(evento -> limparCampos());
        botaoMostrar.addActionListener(evento -> mostrarAlunos());
        botaoSair.addActionListener(evento -> System.exit(0));
    }

    private void cadastrarAluno() {
        Aluno aluno = new Aluno();
        aluno.setNome(campoNome.getText());
        aluno.setIdade(Integer.parseInt(campoIdade.getText()));
        aluno.setEndereco(campoEndereco.getText());
        alunos.add(aluno);
    }

    private void limparCampos() {
        campoNome.setText("");
        campoIdade.setText("");
        campoEndereco.setText("");
    }

    private void mostrarAlunos() {
        String mensagem = "Resultado\n";

        for (Aluno aluno : alunos) {
            mensagem += "Id: " + aluno.getUuid()
                    + " Nome: " + aluno.getNome() + "\n";
        }

        JOptionPane.showMessageDialog(this, mensagem);
    }

    public static void main(String[] args) {
        CadastroAlunosFrame tela = new CadastroAlunosFrame();
        tela.setVisible(true);
    }
}
