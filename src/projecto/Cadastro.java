package projecto;
import javax.swing.*;

import java.io.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cadastro {

	private String modelo,marca,matricula;
	private float preco;

	public Cadastro() {
		marca = JOptionPane.showInputDialog("Marca do Carro: ");
		modelo = JOptionPane.showInputDialog("Modelo do Carro: ");
		matricula = JOptionPane.showInputDialog("Matricula do Carro: ");
		preco = validarPreco();
		
	}

	private float validarPreco() {
		float precoCarro;
		do {
			precoCarro = Float.parseFloat(JOptionPane.showInputDialog("Introduza o preço da viatura por dia: "));
			if(precoCarro<1)
				JOptionPane.showMessageDialog(null, "Preço Negativo ou Nulo, Invalido");
		}while(precoCarro<1);
		return precoCarro;
	}
	public String toString() {
		return "Nova viatura no stock : \n"+"Marca: "+marca+"  "+modelo+";  matricula: " + matricula+" O custo diario é "+ preco;
	}
	public String toStringMarca() {
		return " "+marca;
	}
	public String toStringModelo() {
		return " "+modelo;
	}
	public String toStringPreco() {
		return " "+preco;
	}
	public String toStringMatricula() {
		return " "+matricula;
	}

	public static void main(String[] args) {
		Cadastro carito = new Cadastro();
		JOptionPane.showMessageDialog(null, carito.toStringMarca());
		JOptionPane.showMessageDialog(null, carito.toStringModelo());
		JOptionPane.showMessageDialog(null, carito.toStringPreco());
		JOptionPane.showMessageDialog(null, carito.toStringMatricula());
	}
}