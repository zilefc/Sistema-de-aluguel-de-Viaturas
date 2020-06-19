package projecto;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Logn extends JFrame {
	    private JLabel utilizador,label1,foto;;
	    private JComboBox combo;
	    private String[] comboNames = {"Admin", "Funcionario"};
	    private JPasswordField pass;
	    private Container cont;
	    private JButton botao,botao0;
	    private JPanel painel,painel3,painel0,painel2;
	    private JTextField campo, campo1;
	    public Logn(String s)
	    {

	    	setTitle(s);
	    	cont=getContentPane();
	    	cont.setLayout(new BorderLayout());
	    	painel= new JPanel(); 
	    	painel.setLayout(new GridLayout(2,1));
	    	foto = new JLabel();
	    	foto.setText("Universidade Eduardo Mondlane");
	    	Icon bug = new ImageIcon("uem.png");
	    	foto.setIcon(bug);
	    	foto.setHorizontalTextPosition(SwingConstants.CENTER);
	    	foto.setVerticalTextPosition(SwingConstants.BOTTOM);
	    	foto.setFont(new Font("Serif", Font.BOLD|Font.ITALIC,16));
	    	foto.setForeground(Color.red);
	    	painel.add(foto);
	    	cont.add(painel,BorderLayout.NORTH);
	    	
	    	painel3= new JPanel(); 
	    	painel3.setLayout(new GridLayout(3,3));
	    	utilizador=new JLabel("Utilizador");
	    	painel3.add(utilizador); 
	    	combo = new JComboBox(comboNames);
	    	painel3.add(combo);
	    	label1=new JLabel("Senha"); 
	        painel3.add(label1);
	    	pass=new JPasswordField(10); 
	    	painel3.add(pass);
	    	botao=new JButton("Entrar");  
	    	painel3.add(botao);
	    	botao0=new JButton("Cancelar"); 
	    	painel3.add(botao0);
	    	cont.add(painel3,BorderLayout.CENTER);
	    	
	    	painel0= new JPanel(); 
	    	painel0.setLayout(new FlowLayout());
	    	campo= new JTextField("\r\n" + 
	    			"Universidade Eduardo Mondlane");
	    	campo.setEditable(false);
	    	painel0.add(campo);
	    	cont.add(painel0,BorderLayout.SOUTH);
	    	
	        TratarEvento tratar=new TratarEvento();
		    botao.addActionListener(tratar);
		    botao0.addActionListener(tratar);	
	    	setSize(350,350);
	    	setLocationRelativeTo(null);
	    	setVisible(true);
	    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      	
	    }
	    private class TratarEvento implements ActionListener
	    {
	      public void actionPerformed(ActionEvent e)
	      {  String str = new String(pass.getPassword());
	      if(e.getSource()==botao0)System.exit(0);
	      else
	         if (combo.getSelectedItem().equals("Admin"))
		     {	 
	    			if(str.equals("1234"))
	        		{   dispose();
	        		Menu t = new Menu ("Menu");
	        		}
	            else
	    		    {
	    			  JOptionPane.showMessageDialog(null," Senha invalida");
	    			  pass.setText("");
	    		    } }
	    	     else
	   		   if (str.equals("0000"))
	   		   {   dispose();
	   		Menu t = new Menu ("Menu");}
	   		   else
		      { JOptionPane.showMessageDialog(null," Senha invalida");
			    pass.setText("");
		      }}}
	    public static void main(String[] args)
	    {
	 	  Logn l=new Logn("GS-3 software");  }}