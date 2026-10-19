package tp03;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelCalculadora extends JPanel {

    private final JTextField campoResultado;
    private double primeiroNumero;
    private String operacao;
    private boolean novoNumero;

    // Jefferson Nascimento
    public PainelCalculadora() {
        setLayout(new BorderLayout(5, 5));

        campoResultado = new JTextField("0");
        campoResultado.setHorizontalAlignment(JTextField.RIGHT);
        campoResultado.setEditable(false);
        add(campoResultado, BorderLayout.NORTH);

        JPanel painelBotoes = new JPanel(new GridLayout(4, 4, 2, 2));
        String[] botoes = {"7", "8", "9", "/", "4", "5", "6", "*",
            "1", "2", "3", "-", "0", "C", "=", "+"};

        for (String texto : botoes) {
            JButton botao = new JButton(texto);
            botao.addActionListener(e -> tratarBotao(texto));
            painelBotoes.add(botao);
        }
        add(painelBotoes, BorderLayout.CENTER);
        add(new JLabel("Informe os números e a operação"), BorderLayout.SOUTH);
    }

    // Jefferson Nascimento
    private void tratarBotao(String texto) {
        try {
            if (texto.matches("[0-9]")) {
                if (campoResultado.getText().equals("0") || novoNumero) {
                    campoResultado.setText(texto);
                    novoNumero = false;
                } else {
                    campoResultado.setText(campoResultado.getText() + texto);
                }
            } else if (texto.equals("C")) {
                primeiroNumero = 0;
                operacao = null;
                novoNumero = false;
                campoResultado.setText("0");
            } else if (texto.equals("=")) {
                calcular();
            } else {
                primeiroNumero = Double.parseDouble(campoResultado.getText());
                operacao = texto;
                novoNumero = true;
            }
        } catch (ArithmeticException erro) {
            campoResultado.setText("Erro: divisão por zero");
            operacao = null;
            novoNumero = true;
        } catch (NumberFormatException erro) {
            campoResultado.setText("Erro");
            operacao = null;
            novoNumero = true;
        } finally {
            campoResultado.repaint();
        }
    }

    // Jefferson Nascimento
    private void calcular() {
        if (operacao == null) {
            return;
        }

        double segundoNumero = Double.parseDouble(campoResultado.getText());
        double resultado;

        switch (operacao) {
            case "+":
                resultado = primeiroNumero + segundoNumero;
                break;
            case "-":
                resultado = primeiroNumero - segundoNumero;
                break;
            case "*":
                resultado = primeiroNumero * segundoNumero;
                break;
            case "/":
                if (segundoNumero == 0) {
                    throw new ArithmeticException();
                }
                resultado = primeiroNumero / segundoNumero;
                break;
            default:
                resultado = 0;
        }

        campoResultado.setText(String.valueOf(resultado));
        operacao = null;
        novoNumero = true;
    }
}
