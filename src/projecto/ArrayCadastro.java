package projecto; 
 import java.awt.BorderLayout;
 import java.awt.Color;
 import java.awt.Container;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 import javax.swing.table.*;
 import java.awt.*;
 import javax.swing.ImageIcon;
 import javax.swing.JButton;
 import javax.swing.JFrame;
 import javax.swing.JLabel;
 import javax.swing.JOptionPane;
 import javax.swing.JPanel;
 import javax.swing.JScrollPane;
 import javax.swing.JTable;
 import javax.swing.table.DefaultTableModel;

 public class ArrayCadastro extends JFrame {
 	private byte q;
 	private Cadastro [] a;
 	private JTable baseCarros;
 	private DefaultTableModel baseCarrosModel;
 	private Container c;
 	private JScrollPane scrRolagem;
 	private JButton botao;
 	private JPanel panBtn;

 	public ArrayCadastro() {
 		q = validarQ();
 		a = new Cadastro[q];
 		
 		setTitle("Gr3 Software Aluguel de Viaturas");
 		setLocationRelativeTo(null);
 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
 		c = getContentPane(); 
 		c.setBackground(Color.red);
 		c.setLayout(new BorderLayout());
 		
 		//JLabel l = new JLabel("Stock de Viaturas"); 
 		//l.setFont(new Font("arial", Font.BOLD, 26));
 		//c.add(l, BorderLayout.NORTH);
 		
 		String [] cols = {"Marca", "Modelo","Matricula", "Preço"};
 		baseCarrosModel = new DefaultTableModel(cols,q);
 		
 		baseCarros = new JTable(baseCarrosModel);
 		

 		baseCarrosModel.setNumRows(q);
 		
 		scrRolagem = new JScrollPane(baseCarros, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
 		c.add(scrRolagem, BorderLayout.CENTER);
 		
 		panBtn = new JPanel(); 
 		panBtn.setLayout(new FlowLayout(FlowLayout.RIGHT));
 		botao = new JButton(); 
 		botao.setText("Voltar a tela anterior"); 
 		//botao.setIcon(new ImageIcon("sair.png"));
 		panBtn.add(botao);
 		
 		botao.addActionListener(
 				new ActionListener(){
 					public void actionPerformed(ActionEvent i) {
 						if (i.getSource()== botao) {
 							setVisible(false);
 						}
 					}
 				}
 				);
 		
 		c.add(panBtn, BorderLayout.SOUTH);
 		
 		setSize(500,400);
 		setVisible(false);
 	}
 	

 	private byte validarQ() {
 		byte b;
 		do {
 			b = Byte.parseByte(JOptionPane.showInputDialog("Quantas viaturas pretende adicionar? "));
 			if(b<=0)
 				JOptionPane.showMessageDialog(null, "Valor Inválido!");
 		}while(b<=0);
 		return b;
 	}
 	public void criarCaritos() {
 		String ab, b, c,d;
 		for(byte i = 0; i<q; i++) {
 			a[i] = new Cadastro();
 				ab = ""+a[i].toStringMarca();
 				b = ""+a[i].toStringModelo();
 				c = ""+a[i].toStringMatricula();
 				d= ""+a[i].toStringPreco();
 				String[] linha = {ab, b, c,d};
 				baseCarrosModel.insertRow(i,linha);
 			
 		}
 	}
 	public void verTabela() {
         
 		setVisible(true);
 	}
 	
 	public String funcC() {
 		String s="";
 		for (byte t = 0; t<q; t++) {
 			s += a[t].toStringPreco() +",";
 		}
 		return s;
 	}
 	public String getQuant() {
 		return "Tem + " + q + " Carros";
 	}
 	public byte getNumQ() {
 		return q;
 	}
 	public String toString(){
 		String s = "";
 		for (byte e=0; e<q; e++) {
 			s += a[e].toString() + "\n";
 		}
 		return ""+q +" Carros adicionados com sucesso.\nVeja Abaixo:\n\n"+s;
 	}

 	public static void main(String[] args) {
 		ArrayCadastro arrayVia = new ArrayCadastro();
 		arrayVia.criarCaritos();
 		JOptionPane.showMessageDialog(null, arrayVia.toString());
 		arrayVia.verTabela();
}}