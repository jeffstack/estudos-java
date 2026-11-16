// Jefferson Nascimento dos Santos
package trabalhopratico04;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrmFuncionario extends JFrame {
    private JTextField txtPesquisa;
    private JTextField txtNome;
    private JTextField txtSalario;
    private JTextField txtCargo;
    private JButton btnPesquisar;
    private JButton btnAnterior;
    private JButton btnProximo;
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    public FrmFuncionario() {
        criarTela();
        con = new Conexao().abrir();
    }

    private void criarTela() {
        setTitle("TRABALHO PRATICO 04");
        setSize(430, 240);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblPesquisa = new JLabel("Nome:");
        txtPesquisa = new JTextField();
        btnPesquisar = new JButton("Pesquisar");

        JLabel lblNome = new JLabel("Nome:");
        JLabel lblSalario = new JLabel("Salário:");
        JLabel lblCargo = new JLabel("Cargo:");
        txtNome = new JTextField();
        txtSalario = new JTextField();
        txtCargo = new JTextField();
        txtNome.setEditable(false);
        txtSalario.setEditable(false);
        txtCargo.setEditable(false);

        btnAnterior = new JButton("Anterior");
        btnProximo = new JButton("Próximo");

        JPanel painelPesquisa = new JPanel(new GridLayout(1, 3, 5, 5));
        painelPesquisa.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 10));
        painelPesquisa.add(lblPesquisa);
        painelPesquisa.add(txtPesquisa);
        painelPesquisa.add(btnPesquisar);

        JPanel painelDados = new JPanel(new GridLayout(3, 2, 5, 5));
        painelDados.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        painelDados.add(lblNome);
        painelDados.add(txtNome);
        painelDados.add(lblSalario);
        painelDados.add(txtSalario);
        painelDados.add(lblCargo);
        painelDados.add(txtCargo);

        JPanel painelBotoes = new JPanel(new GridLayout(1, 2));
        painelBotoes.add(btnAnterior);
        painelBotoes.add(btnProximo);

        add(painelPesquisa, "North");
        add(painelDados, "Center");
        add(painelBotoes, "South");

        btnPesquisar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pesquisar();
            }
        });

        btnAnterior.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                anterior();
            }
        });

        btnProximo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                proximo();
            }
        });
    }

    private void pesquisar() {
        try {
            if (con == null) {
                return;
            }

            if (ps != null) {
                ps.close();
            }

            ps = con.prepareStatement(
                    "select f.nome_func, f.sal_func, c.ds_cargo "
                    + "from funcionarios f inner join cargos c "
                    + "on f.cd_cargo = c.cd_cargo "
                    + "where f.nome_func like ?",
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            ps.setString(1, "%" + txtPesquisa.getText() + "%");
            rs = ps.executeQuery();

            if (rs.next()) {
                mostrar();
            } else {
                limpar();
            }
        } catch (SQLException e) {
            System.out.println("Erro na pesquisa: " + e.getMessage());
        }
    }

    private void mostrar() {
        try {
            txtNome.setText(rs.getString("nome_func"));
            txtSalario.setText(rs.getString("sal_func"));
            txtCargo.setText(rs.getString("ds_cargo"));
        } 
        catch (SQLException e) {
            System.out.println("Erro ao mostrar registro: " + e.getMessage());
        }
    }

    private void anterior() {
        try {
            if (rs != null && !rs.isFirst() && rs.previous()) {
                mostrar();
            }
        } 
        catch (SQLException e) {
            System.out.println("Erro no botão anterior: " + e.getMessage());
        }
    }

    private void proximo() {
        try {
            if (rs != null && !rs.isLast() && rs.next()) {
                mostrar();
            }
        } 
        catch (SQLException e) {
            System.out.println("Erro no botão próximo: " + e.getMessage());
        }
    }

    private void limpar() {
        txtNome.setText("");
        txtSalario.setText("");
        txtCargo.setText("");
    }

    public static void main(String[] args) {
        new FrmFuncionario().setVisible(true);
    }
}