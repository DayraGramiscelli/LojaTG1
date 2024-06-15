import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {
    private JTabbedPane tabbedPane1;
    private JPanel cadastrosPanel;
    private JPanel vendasPanel;
    private JPanel relatoriosPanel;
    private JButton clientesButton;
    private JButton funcionariosButton;
    private JButton produtosButton;
    private JButton fornecedoresButton;
    private JButton iniciarNovaVendaButton;
    private JButton estoqueButton;
    private JButton produtosButton1;

    public MainMenu() {
        setTitle("Menu Principal");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Initialize tabbed pane
        tabbedPane1 = new JTabbedPane();

        // Initialize panels for each tab
        cadastrosPanel = new JPanel();
        vendasPanel = new JPanel();
        relatoriosPanel = new JPanel();

        // Set layout for each panel
        cadastrosPanel.setLayout(new GridLayout(4, 1, 10, 10));
        vendasPanel.setLayout(new GridLayout(2, 1, 10, 10));
        relatoriosPanel.setLayout(new GridLayout(1, 1, 10, 10));

        // Initialize buttons
        clientesButton = new JButton("Clientes");
        funcionariosButton = new JButton("Funcionários");
        produtosButton = new JButton("Produtos");
        fornecedoresButton = new JButton("Fornecedores");
        iniciarNovaVendaButton = new JButton("Iniciar nova venda");
        produtosButton1 = new JButton("Produtos");
        estoqueButton = new JButton("Estoque");

        // Add buttons to their respective panels
        cadastrosPanel.add(clientesButton);
        cadastrosPanel.add(funcionariosButton);
        cadastrosPanel.add(produtosButton);
        cadastrosPanel.add(fornecedoresButton);

        vendasPanel.add(iniciarNovaVendaButton);
        vendasPanel.add(produtosButton1);

        relatoriosPanel.add(estoqueButton);

        // Add panels to tabbed pane
        tabbedPane1.addTab("Cadastros", cadastrosPanel);
        tabbedPane1.addTab("Vendas", vendasPanel);
        tabbedPane1.addTab("Relatórios", relatoriosPanel);

        // Add tabbed pane to the frame
        add(tabbedPane1);

        // Add action listeners for buttons
        clientesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleClientesButton();
            }
        });

        funcionariosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleFuncionariosButton();
            }
        });

        produtosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleProdutosButton();
            }
        });

        fornecedoresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleFornecedoresButton();
            }
        });

        iniciarNovaVendaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleIniciarNovaVendaButton();
            }
        });

        estoqueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleEstoqueButton();
            }
        });

        produtosButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleProdutosButton1();
            }
        });
    }

    private void handleClientesButton() {
        // Logic for handling Clientes button
        openCadastroClientes();
    }

    private void handleFuncionariosButton() {
        // Logic for handling Funcionários button
        openCadastroFuncionarios();
    }

    private void handleProdutosButton() {
        // Logic for handling Produtos button
        openCadastroProdutos();
    }

    private void handleFornecedoresButton() {
        // Logic for handling Fornecedores button
        JOptionPane.showMessageDialog(this, "Fornecedores button clicked!");
    }

    private void handleIniciarNovaVendaButton() {
        // Logic for handling Iniciar Nova Venda button
        JOptionPane.showMessageDialog(this, "Iniciar Nova Venda button clicked!");
    }

    private void handleEstoqueButton() {
        // Logic for handling Estoque button
        JOptionPane.showMessageDialog(this, "Estoque button clicked!");
    }

    private void handleProdutosButton1() {
        // Logic for handling Produtos 1 button
        JOptionPane.showMessageDialog(this, "Produtos 1 button clicked!");
    }

    private void openCadastroClientes() {
        CadastroClientes cadastroClientes = new CadastroClientes();
        cadastroClientes.setVisible(true);
        this.dispose();
    }

    private void openCadastroFuncionarios() {
        CadastroFuncionarios cadastroFuncionarios = new CadastroFuncionarios();
        cadastroFuncionarios.setVisible(true);
        this.dispose();
    }

    private void openCadastroProdutos() {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.setVisible(true);
        this.dispose();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }
}