package projecto;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Menu.TrataEvento;
public class Menu extends JFrame{
		private JMenuBar barra;
		private JMenu cadastro,pesquisar,contabilidade,sistema;
		private JMenuItem regCarro,verCarros,pesquisaCarro,relatorio,recibo,factura, sobre, ajuda, saida;
		private JLabel foto;
		private ArrayCadastro a;
		private Container cont;
		public Menu(String titulo) {
			setTitle(titulo);
			barra = new JMenuBar();
			setJMenuBar(barra);
			cont =getContentPane();
			foto = new JLabel("",SwingConstants.CENTER);
			foto.setIcon(new ImageIcon("carro2.jpg"));
			cont.add(foto);
			
			cadastro = new JMenu("Cadastro");
			barra.add(cadastro);
			regCarro = new JMenuItem("Registrar Carros");
			regCarro.setIcon(new ImageIcon("addcar.jpg"));
			cadastro.add(regCarro);
			/*regCarro.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent x){
							dispose();}});
			*/
			verCarros = new JMenuItem("Visualizar Todos Carros" );
			verCarros.setIcon(new ImageIcon("lisstacarro.png"));
			cadastro.add(verCarros);
	/*		verCarros.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent z){
					}
					});
			

		*/	pesquisar = new JMenu("Pesquisa");
			barra.add(pesquisar);
			
			pesquisaCarro = new JMenuItem("Pesquisar Viatura" );
			pesquisaCarro.setIcon(new ImageIcon("carp.png"));
			pesquisar.add(pesquisaCarro);
			
			contabilidade = new JMenu("Contabilidade");
			barra.add(contabilidade);
			
			relatorio = new JMenuItem("Ver Relatorio" );
			relatorio.setIcon(new ImageIcon("report.png"));
			contabilidade.add(relatorio);
			
			recibo = new JMenuItem("Emitir Recibo" );
			recibo.setIcon(new ImageIcon("recibo.png"));
			contabilidade.add(recibo);
		
			factura = new JMenuItem("Emitir Factura" );
			factura.setIcon(new ImageIcon("invoice.png"));
			contabilidade.add(factura);
		
			sistema=new JMenu("Sistema");
			sobre=new JMenuItem("Sobre");
			sobre.setIcon(new ImageIcon("sobre.png"));
			ajuda=new JMenuItem("Ajuda");
			ajuda.setIcon(new ImageIcon("help.png"));
			saida=new JMenuItem("Sair");
			saida.setIcon(new ImageIcon("close.png"));
			sistema.add(sobre);
			sistema.add(ajuda);
			sistema.add(saida);
			saida.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent z){
							System.exit(0) ; }});
			barra.add(sistema);
						
			TrataEvento x = new TrataEvento();
			regCarro.addActionListener(x);
			verCarros.addActionListener(x); 
			pesquisaCarro.addActionListener(x);
			relatorio.addActionListener(x); 
			recibo.addActionListener(x);
			factura.addActionListener(x);
			sobre.addActionListener(x); 
			ajuda.addActionListener(x);
			
			setSize(900,550); 
			setVisible(true);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		}
		
		private class TrataEvento implements ActionListener{
			public void actionPerformed(ActionEvent e) {

				if(e.getSource()==regCarro) {
					a = new ArrayCadastro();
					a.criarCaritos();
					JOptionPane.showMessageDialog(null, a.getQuant());
				} else
					if (e.getSource()==pesquisaCarro) {
						a.verTabela();
					}
					else
						if (e.getSource()==pesquisaCarro) {
							a.verTabela();
						}
				//else 
					
			}

		}
		public static void main(String [] args) {
			Menu  a = new Menu("GS3");
		}}