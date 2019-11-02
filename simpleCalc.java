package awtpractice;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class simpleCalc extends WindowAdapter{
	private Frame fr;
	Label l1,l2;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18;
	char ch;
	double total=0.0;
	StringBuffer sb;
	public simpleCalc()
	{
		sb=new StringBuffer();
		fr=new Frame("Calculator");
		fr.addWindowListener(this);
		fr.setSize(500,700);
		fr.setLayout(null);
		fr.setVisible(true);
		l1=new Label(""+sb);
		l1.setForeground(Color.WHITE);
		l1.setBackground(Color.BLACK);
		Font myFont=new Font("Courier",Font.ITALIC,20);
		l1.setFont(myFont);
		b1=new Button("0");
		b2=new Button("1");
		b3=new Button("2");
		b4=new Button("3");
		b5=new Button("4");
		b6=new Button("5");
		b7=new Button("6");
		b8=new Button("7");
		b9=new Button("8");
		b10=new Button("9");
		b11=new Button(".");
		b12=new Button("=");
		b13=new Button("/");
		b14=new Button("-");
		b15=new Button("*");
		b16=new Button("+");
		b17=new Button("Del");
		b18=new Button("Clear");
		l1.setBounds(10,50,500,70);
		b8.setBounds(0,100,125,150);
		b9.setBounds(125,100,125,150);
		b10.setBounds(250,100,125,150);
		b17.setBounds(375,100,125,60);
		b5.setBounds(0,250,125,150);
		b6.setBounds(125,250,125,150);
		b7.setBounds(250,250,125,150);
		b13.setBounds(375,220,125,120);
		b2.setBounds(0,400,125,150);
		b3.setBounds(125,400,125,150);
		b4.setBounds(250,400,125,150);
		b15.setBounds(375,340,125,120);
		b1.setBounds(0,550,125,150);
		b11.setBounds(125,550,125,150);
		b12.setBounds(250,550,125,150);
		b14.setBounds(375,460,125,120);
		b16.setBounds(375,580,125,120);
		b18.setBounds(375,160,125,60);
		
		fr.add(l1);
		fr.add(b1);
		fr.add(b2);
		fr.add(b3);
		fr.add(b4);
		fr.add(b5);
		fr.add(b6);
		fr.add(b7);
		fr.add(b8);
		fr.add(b9);
		fr.add(b10);
		fr.add(b11);
		fr.add(b12);
		fr.add(b13);
		fr.add(b14);
		fr.add(b15);
		fr.add(b16);
		fr.add(b17);
		fr.add(b18);
		b1.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent arg0) {
						sb.append("0");
						l1.setText(""+sb);
					}
					
				});
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) {
				sb.append("1");
				l1.setText(""+sb);
			}
			
		});
		b3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) {
				sb.append("2");
				l1.setText(""+sb);
			}
			
		});
		b4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) {
				sb.append("3");
				l1.setText(""+sb);
			}
			
		});
		b5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) {
				sb.append("4");
				l1.setText(""+sb);
			}
			
		});
		b6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) {
				sb.append("5");
				l1.setText(""+sb);
			}
			
		});
		b7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) {
				sb.append("6");
				l1.setText(""+sb);
			}
			
		});
		b8.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) {
				sb.append("7");
				l1.setText(""+sb);
			}
			
		});
		b9.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) {
				sb.append("8");
				l1.setText(""+sb);
			}
			
		});
		b10.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) {
				sb.append("9");
				l1.setText(""+sb);
			}
			
		});
		b11.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) {
				sb.append(".");
				l1.setText(""+sb);
			}
			
		});
		b12.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) {
				
				switch(ch)
				{
				case '+':
					total=total+Double.valueOf(sb.toString());
					break;
				case '-':
					total=total-Double.valueOf(sb.toString());
					break;
				case '*':
					total=total*Double.valueOf(sb.toString());
					break;
				case '/':
					total=total/Double.valueOf(sb.toString());
					break;
				}
				l1.setText(String.valueOf(total));
				sb=new StringBuffer("");
			}
			
		});
		b13.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) {
				ch='/';
				if(total==0.0)
				{
					total=Double.valueOf(sb.toString());
				}
				else
				{
				total=total/Double.valueOf(sb.toString());
				}
				l1.setText(String.valueOf(total));
				sb=new StringBuffer("");

			}
			
		});
		b14.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) {
				ch='-';
				if(total==0.0)
				{
					total=Double.valueOf(sb.toString());
				}
				else
				{
				total=total-Double.valueOf(sb.toString());
				}
				l1.setText(String.valueOf(total));
				sb=new StringBuffer("");
			}
			
		});
		b15.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) {
				ch='*';
				if(total==0.0)
				{
					total=Double.valueOf(sb.toString());
				}
				else
				{
				total=total*Double.valueOf(sb.toString());
				}
				l1.setText(String.valueOf(total));
				sb=new StringBuffer("");
			}
			
		});
		b16.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) {
				
				ch='+';
				if(total==0.0)
				{
					total=Double.valueOf(sb.toString());
				}
				else
				{
				total=total*Double.valueOf(sb.toString());
				}
				l1.setText(String.valueOf(total));
				sb=new StringBuffer("");

			}
			
		});
		b17.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) {
				if(sb.length()==0)
				{
					sb.append(l1.getText());
				}
				int l=sb.length();
				if(l==1)
				{
					l1.setText("");
				}
				else
				{
				sb.deleteCharAt(l-1);
				l1.setText(sb.toString());
				}
			}
			
		});
		b18.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent arg0) {
						total=0.0;
						sb=new StringBuffer();
						l1.setText(sb.toString());
					}
				});
				
	}

	public void windowClosing(WindowEvent e)
	{
		fr.dispose();
	}
	public static void main(String[] args) {
		new simpleCalc();

	}

}
