package calculator;

import java.awt.*;
import java.awt.event.ActionEvent;


public class Calculator extends Frame implements java.awt.event.ActionListener{

	private TextField text_number1,text_number2;
	private Button button_1,button_2,button_3,button_4,button_5,button_6,button_7,button_8,button_9,button_0,button_plus,button_equal,button_clear;
	private String str,plusNumber1="",plusNumber2="";
	public Calculator(){
		super("¼ÆËãÆ÷");
		this.setBounds(300,240,280,280);
		this.setBackground(Color.lightGray);
		this.setLayout(new GridLayout(5,3,2,2));
		text_number1=new TextField("",10);
		this.add(text_number1);
		text_number2=new TextField("",10);
		this.add(text_number2);
		button_clear=new Button("C");
		this.add(button_clear);
		button_clear.addActionListener(this);
		button_1=new Button("1");
		this.add(button_1);
		button_1.addActionListener(this);
		button_2=new Button("2");
		this.add(button_2);
		button_2.addActionListener(this);
		button_3=new Button("3");
		this.add(button_3);
		button_3.addActionListener(this);
		button_4=new Button("4");
		this.add(button_4);
		button_4.addActionListener(this);
		button_5=new Button("5");
		this.add(button_5);
		button_5.addActionListener(this);
		button_6=new Button("6");
		this.add(button_6);
		button_6.addActionListener(this);
		button_7=new Button("7");
		this.add(button_7);
		button_7.addActionListener(this);
		button_8=new Button("8");
		this.add(button_8);
		button_8.addActionListener(this);
		button_9=new Button("9");
		this.add(button_9);
		button_9.addActionListener(this);
		button_0=new Button("0");
		this.add(button_0);
		button_0.addActionListener(this);
		button_plus=new Button("+");
		this.add(button_plus);
		button_plus.addActionListener(this);
		button_equal=new Button("=");
		this.add(button_equal);
		button_equal.addActionListener(this);
		this.addWindowListener(new WinClose());
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent ev){
		if(ev.getSource()==button_1){
			str=text_number1.getText();
			text_number1.setText(str+"1");
		}
		else if(ev.getSource()==button_2){
			str=text_number1.getText();
			text_number1.setText(str+"2");
		}
		else if(ev.getSource()==button_3){
			str=text_number1.getText();
			text_number1.setText(str+"3");
		}
		else if(ev.getSource()==button_4){
			str=text_number1.getText();
			text_number1.setText(str+"4");
		}
		else if(ev.getSource()==button_5){
			str=text_number1.getText();
			text_number1.setText(str+"5");
		}
		else if(ev.getSource()==button_6){
			str=text_number1.getText();
			text_number1.setText(str+"6");
		}
		else if(ev.getSource()==button_7){
			str=text_number1.getText();
			text_number1.setText(str+"7");
		}
		else if(ev.getSource()==button_8){
			str=text_number1.getText();
			text_number1.setText(str+"8");
		}
		else if(ev.getSource()==button_9){
			str=text_number1.getText();
			text_number1.setText(str+"9");
		}
		else if(ev.getSource()==button_0){
			str=text_number1.getText();
			text_number1.setText(str+"0");
		}
		else if(ev.getSource()==button_plus){
			str=text_number1.getText();
			text_number1.setText(str+"+");
		}
		else if(ev.getSource()==button_clear){
			text_number1.setText("");
			text_number2.setText("");
			plusNumber1="";
			plusNumber2="";
		}
		else if(ev.getSource()==button_equal){
			str=text_number1.getText();
			char i;
			long plus1=0,plus2=0;
			for(int k=0;k<=str.length()-1;k++){
				i=str.charAt(k);
				if(i=='+'){
					k++;
					for(;k<=str.length()-1;k++)
						plusNumber2+=str.charAt(k);
				}
				else
					plusNumber1+=i;
			}
			if(plusNumber1=="")
				text_number2.setText("PN1Error");
			else if(plusNumber2=="")
				text_number2.setText("PN2Error");
			else{
				plus1=Integer.parseInt(plusNumber1);
				plus2=Integer.parseInt(plusNumber2);
				text_number2.setText(str=String.valueOf(plus1+plus2));
			}
			plusNumber1="";
			plusNumber2="";
		}	
	}
	public static void main(String arg[]){
		new Calculator();
	}
}
