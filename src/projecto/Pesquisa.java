package projecto;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Pesquisa extends JFrame {
			private JLabel codigo,modelo,marca,tipoDeCarro,combustivel;
			private Container cont;
			private JTextField txtModelo,txtCombustivel,turn;
			private JPasswordField pass;
			private ButtonGroup bgr;
			private JButton cadastrar, cancelar,btn1;
			private JRadioButton f,m;
			private JPanel p0,p1,p3,p4,e,w,wAux,wAux2;
			private JCheckBox med,tecn,sup;

			
			private JComboBox mc,tc;
			
			public String [] tDeCarro = {"Ligeiro","Pesado",};
			public String [] mc1 = {"Toyota","Mazda","Nissan","Honda","Mitsubishi","Ford","Lexus"};
			
		public Pesquisa(String titulo){
			setSize(520,250);
			setVisible(true);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			setTitle(titulo);
			cont = getContentPane();
			cont.setLayout(new BorderLayout ());

			
			wAux2 = new JPanel();wAux2.setLayout(new FlowLayout());
			wAux = new JPanel();wAux.setLayout(new FlowLayout());
		    e= new JPanel();e.setLayout(new BorderLayout());
			w= new JPanel();w.setLayout(new BorderLayout());
			p4= new JPanel(); p4.setLayout(new GridLayout(3,1));
			p3= new JPanel(); p3.setLayout(new FlowLayout());
			p0= new JPanel(); p0.setLayout(new FlowLayout());
			p1= new JPanel(); p1.setLayout(new FlowLayout());
			
			modelo = new JLabel ("Modelo");p0.add(modelo);
			txtModelo = new JTextField (15);p0.add(txtModelo);	
		   
			codigo = new JLabel ("Codigo  ");	p0.add(codigo);
			pass = new JPasswordField (14);p0.add(pass);
			pass.setToolTipText("O código deve ter 4 digitos (1000 - 9999)");
			
			
			combustivel = new JLabel("Combustivel");p0.add(combustivel);

			txtCombustivel = new JTextField(14);p0.add(txtCombustivel);
			
			pass.setToolTipText("O codigo deve ter 4 digitos de 1111 a 9999");
			

			
			marca = new JLabel ("Marca");p3.add(marca);
			mc = new JComboBox(mc1);p3.add(mc);
			

			tipoDeCarro= new JLabel("Tipo de Carro");wAux.add(tipoDeCarro);
		    tc = new JComboBox(tDeCarro);wAux.add(tc);

			w.add(p3,BorderLayout.NORTH);
			w.add(wAux,BorderLayout.WEST);
			w.add(wAux2,BorderLayout.SOUTH);
			
			bgr = new ButtonGroup();
			bgr.add(f); bgr.add(m);
			
			cadastrar = new JButton("Pesquisar"); p1.add(cadastrar);
			cancelar = new JButton("Cancelar"); p1.add(cancelar);
			cont.add(p3,BorderLayout.SOUTH);
			cont.add(p1,BorderLayout.SOUTH);
			cont.add(p0,BorderLayout.CENTER);
			cont.add(w,BorderLayout.WEST);
			cont.add(e,BorderLayout.EAST);
			
			  TratarEvento tratar=new TratarEvento();
				cancelar.addActionListener(tratar);
				cadastrar.addActionListener(tratar);
				 
		}
		private class TratarEvento implements ActionListener
		{
		  public void actionPerformed(ActionEvent e){
			  if(e.getSource()==cancelar){
				  System.exit(0);
			  }
			  }
		  }
			
			public static void main(String[] args) {
			Pesquisa x = new Pesquisa ("PESQUISA");	
			}

		}

	

