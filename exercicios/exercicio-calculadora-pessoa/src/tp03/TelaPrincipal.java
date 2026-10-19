package tp03;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TelaPrincipal extends JFrame {

    // Jefferson Nascimento
    public TelaPrincipal() {
        setTitle("TP03");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(420, 360);
        setLocationRelativeTo(null);

        JTabbedPane abas = new JTabbedPane();
        abas.addTab("Calculadora", new PainelCalculadora());
        abas.addTab("FormPessoa", new PainelPessoa());

        JPanel painel = new JPanel(new GridLayout(1, 1));
        painel.add(abas);
        add(painel, BorderLayout.CENTER);
    }
}
