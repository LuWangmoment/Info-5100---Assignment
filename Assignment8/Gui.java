package Assignment8;
import javax.print.attribute.standard.NumberUpSupported;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui extends JFrame{
	private JTextField answerfield;
	private JButton one,two,three,four,five,six,seven,eight,nine,zero,add,sub,multiply,div,equals;
	private String stemp1,stemp2,sanswer;
	private double answer=0.0;
	private JPanel contentPanel;
	private boolean equalsClicked=false,opChosen=false;
	char operation=' ';
	
	public Gui() {
		super("Calculator");
		
		answerfield=new JTextField(null,20);
		answerfield.setEditable(false);
		
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		zero = new JButton("0");
		add = new JButton("+");
		sub = new JButton("-");
		multiply = new JButton("*");
		div = new JButton("／");
		equals = new JButton("=");
		
		contentPanel=new JPanel();
		contentPanel.setBackground(Color.ORANGE);
		contentPanel.setLayout(new FlowLayout());
		contentPanel.add(answerfield,BorderLayout.NORTH);
		contentPanel.add(one);contentPanel.add(two);contentPanel.add(three);contentPanel.add(four);
		contentPanel.add(five);contentPanel.add(six);contentPanel.add(seven);contentPanel.add(eight);
		contentPanel.add(nine);contentPanel.add(zero);contentPanel.add(add);contentPanel.add(sub);
		contentPanel.add(multiply);contentPanel.add(div);contentPanel.add(equals);
		
		Dimension dim = new Dimension(75,25);
		
		one.setPreferredSize(dim);
		two.setPreferredSize(dim);
		three.setPreferredSize(dim);
		four.setPreferredSize(dim);
		five.setPreferredSize(dim);
		six.setPreferredSize(dim);
		seven.setPreferredSize(dim);
		eight.setPreferredSize(dim);
		nine.setPreferredSize(dim);
		zero.setPreferredSize(new Dimension(225,25));
		add.setPreferredSize(new Dimension(113,25));
		sub.setPreferredSize(new Dimension(113,25));
		multiply.setPreferredSize(new Dimension(113,25));
		div.setPreferredSize(new Dimension(113,25));
		equals.setPreferredSize(new Dimension(225,25));
		
		Numbers n = new Numbers();
		Calc c = new Calc();
		
		one.addActionListener(n);
		two.addActionListener(n);
		three.addActionListener(n);
		four.addActionListener(n);
		five.addActionListener(n);
		six.addActionListener(n);
		seven.addActionListener(n);
		eight.addActionListener(n);
		nine.addActionListener(n);
		zero.addActionListener(n);
		
		add.addActionListener(c);sub.addActionListener(c);multiply.addActionListener(c);div.addActionListener(c);
		equals.addActionListener(c);
		
		this.setContentPane(contentPanel);

	}
	private class Numbers implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			JButton src= (JButton)event.getSource();
			
			if(src.equals(one)) {
				if(opChosen==false) {  
					if(stemp1==null) {
						stemp1="1";
					}
					else {
						stemp1+="1";   
					}		
				}else {
					if(stemp2==null) {
						stemp2="1";
					}
					else {
						stemp2+="1";   
					}		
				}
			}
			
			if(src.equals(two)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1="2";
					}
					else {
						stemp1+="2";   
					}		
				}else {
					if(stemp2==null) {
						stemp2="2";
					}
					else {
						stemp2+="2";   
					}		
				}
			}
			
			if(src.equals(three)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1="3";
					}
					else {
						stemp1+="3";   
					}		
				}else {
					if(stemp2==null) {
						stemp2="3";
					}
					else {
						stemp2+="3";   
					}		
				}
			}
			
			if(src.equals(four)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1="4";
					}
					else {
						stemp1+="4";   
					}		
				}else {
					if(stemp2==null) {
						stemp2="4";
					}
					else {
						stemp2+="4";   
					}		
				}
			}
			
			if(src.equals(five)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1="5";
					}
					else {
						stemp1+="5";   
					}		
				}else {
					if(stemp2==null) {
						stemp2="5";
					}
					else {
						stemp2+="5";   
					}		
				}
			}
			
			if(src.equals(six)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1="6";
					}
					else {
						stemp1+="6";   
					}		
				}else {
					if(stemp2==null) {
						stemp2="6";
					}
					else {
						stemp2+="6";   
					}		
				}
			}
			
			if(src.equals(seven)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1="7";
					}
					else {
						stemp1+="7";   
					}		
				}else {
					if(stemp2==null) {
						stemp2="7";
					}
					else {
						stemp2+="7";   
					}		
				}
			}
			
			if(src.equals(eight)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1="8";
					}
					else {
						stemp1+="8";   
					}		
				}else {
					if(stemp2==null) {
						stemp2="8";
					}
					else {
						stemp2+="8";   
					}		
				}
			}
			
			if(src.equals(nine)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1="9";
					}
					else {
						stemp1+="9";   
					}		
				}else {
					if(stemp2==null) {
						stemp2="9";
					}
					else {
						stemp2+="9";   
					}		
				}
			}
			
			if(src.equals(zero)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1="0";
					}
					else {
						stemp1+="0";   
					}		
				}else {
					if(stemp2==null) {
						stemp2="0";
					}
					else {
						stemp2+="0";   
					}		
				}
			}
			
	
		
		if(equalsClicked==false) {
			if(opChosen==false) {
				answerfield.setText(stemp1);	
			}else {
				answerfield.setText(stemp2);	
			}
				
		}
		
		}
	}
	
	private class Calc implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			JButton src= (JButton)event.getSource();
			
			if(src.equals(add)) {
				if(stemp1==null) {
					System.out.println("choose your numbers first !");
				}else {
					if(stemp1!=null&&stemp2==null) {
						opChosen=true;
						operation='+';
					}else 
						if(stemp1!=null&&stemp2!=null) {
							System.out.println("Two operations only!");
						}
				}
			}

			if(src.equals(sub)) {
				if(stemp1==null) {
					System.out.println("choose your numbers first !");
				}else {
					if(stemp1!=null&&stemp2==null) {
						opChosen=true;
						operation='-';
					}else 
						if(stemp1!=null&&stemp2!=null) {
							System.out.println("Two operations only!");
						}
				}
			}

			if(src.equals(multiply)) {
				if(stemp1==null) {
					System.out.println("choose your numbers first !");
				}else {
					if(stemp1!=null&&stemp2==null) {
						opChosen=true;
						operation='*';
					}else 
						if(stemp1!=null&&stemp2!=null) {
							System.out.println("Two operations only!");
						}
				}
			}

			if(src.equals(div)) {
				if(stemp1==null) {
					System.out.println("choose your numbers first !");
				}else {
					if(stemp1!=null&&stemp2==null) {
						opChosen=true;
						operation='/';
					}else 
						if(stemp1!=null&&stemp2!=null) {
							System.out.println("Two operations only!");
						}
				}
			}
			

			if(src.equals(equals)) {
				if(stemp1==null) {
					System.out.println("choose your numbers first !");
				}else 
					if(stemp1!=null&&stemp2==null) {
						System.out.println("choose your numbers first !");
					}
					if(stemp1 !=null&&stemp2!=null) {
						double d1=0.0,d2=0.0;
						
						d1=Double.parseDouble(stemp1);
						d2=Double.parseDouble(stemp2);
						
						switch(operation) {
						case '+':
							answer=d1+d2;
							break;
						case '-':
							answer=d1-d2;
							break;
						case '*':
							answer=d1*d2;
							break;
						case '/':
							answer=d1/d2;
							break;
							
						}
						sanswer=Double.toString(answer);
						answerfield.setText(sanswer);
					}
			}
			
			
		}
	}
	
	public static void main(String args[]) {
		Gui g = new Gui();
		g.setSize(250,400);
		g.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		g.setVisible(true);
		g.setResizable(false);
		
	}
}
