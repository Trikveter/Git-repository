import javax.swing.*;
import java.awt.event.*;

public class Main {
	JButton buttonRead=new JButton("Рассчитать") ;
	{buttonRead.setSize(120, 30);
	buttonRead.setLocation(210,10);}
	JButton buttonClear=new JButton("Очистить") ;
	{buttonClear.setSize(120, 30);
	buttonClear.setLocation(210,60);}
	
	static Main gui=new Main();
	
	public static void main(String[] args){
		gui.matrix();
	}
    int n=3;
	int [][]a = new int[n+1][n+1];
	int []b = new int[n+1];
	int y=1;
	int x=1;
	
	JTextField txtF1=new JTextField("1");
	{txtF1.setSize(30, 30);
	txtF1.setLocation(10,10);}
	JTextField txtF2=new JTextField("1");
	{txtF2.setSize(30, 30);
	txtF2.setLocation(60,10);}
	JTextField txtF3=new JTextField("1");
	{txtF3.setSize(30, 30);
	txtF3.setLocation(110,10);}
	JTextField txtF4=new JTextField("1");
	{txtF4.setSize(30, 30);
	txtF4.setLocation(10,60);}
	JTextField txtF5=new JTextField("1");
	{txtF5.setSize(30, 30);
	txtF5.setLocation(60,60);}
	JTextField txtF6=new JTextField("1");
	{txtF6.setSize(30, 30);
	txtF6.setLocation(110,60);}
	JTextField txtF7=new JTextField("1");
	{txtF7.setSize(30, 30);
	txtF7.setLocation(10,110);}
	JTextField txtF8=new JTextField("1");
	{txtF8.setSize(30, 30);
	txtF8.setLocation(60,110);}
	JTextField txtF9=new JTextField("1");
	{txtF9.setSize(30, 30);
	txtF9.setLocation(110,110);}

	
	JTextField txtFP1=new JTextField("1");
	{txtFP1.setSize(30, 30);
	txtFP1.setLocation(160,10);}
	JTextField txtFP2=new JTextField("1");  
	{txtFP2.setSize(30, 30);
	txtFP2.setLocation(160,60);}
	JTextField txtFP3=new JTextField("1");  
	{txtFP3.setSize(30, 30);
	txtFP3.setLocation(160,110);}
	
	JTextArea txtDet=new JTextArea("∆");
    {txtDet.setEditable(false);
    txtDet.setSize(500, 60);
	txtDet.setLocation(10,160);}
    JTextArea txtDetX=new JTextArea("∆x");
    {txtDetX.setEditable(false);
    txtDetX.setSize(500, 60);
	txtDetX.setLocation(10,230);}
    JTextArea txtDetY=new JTextArea("∆y");
    {txtDetY.setEditable(false);
    txtDetY.setSize(500, 60);
	txtDetY.setLocation(10,300);}
    JTextArea txtDetZ=new JTextArea("∆z");
    {txtDetZ.setEditable(false);
    txtDetZ.setSize(500, 60);
	txtDetZ.setLocation(10,370);}
    
    JTextArea txtX=new JTextArea("X");
    {txtX.setEditable(false);
    txtX.setSize(120, 60);
	txtX.setLocation(10,440);}
    JTextArea txtY=new JTextArea("Y");
    {txtY.setEditable(false);
    txtY.setSize(120, 60);
	txtY.setLocation(140,440);}
    JTextArea txtZ=new JTextArea("Z");
    {txtZ.setEditable(false);
    txtZ.setSize(120, 60);
	txtZ.setLocation(270,440);}
    
    int Det,DetX,DetY,DetZ;    


public void matrix(){

	JFrame frame = new JFrame("Решение матрицы методом Краммера");
	{frame.setSize(560, 600);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLocationRelativeTo(null);
	frame.setLayout(null);
	frame.setBackground(null);}
	
	
	{frame.add(txtF1);
	frame.add(txtF2);
	frame.add(txtF3);
	frame.add(txtF4);
	frame.add(txtF5);
	frame.add(txtF6);
	frame.add(txtF7);
	frame.add(txtF8);
	frame.add(txtF9);
	
	frame.add(txtFP1);
	frame.add(txtFP2);
	frame.add(txtFP3);
	
	frame.add(buttonRead);
	frame.add(buttonClear);
	
	frame.add(txtDet);
	frame.add(txtDetX);
	frame.add(txtDetY);
	frame.add(txtDetZ);
	
	frame.add(txtX);
	frame.add(txtY);
	frame.add(txtZ);
	
	}
	
	{frame.setVisible(true) ;}
	
	buttonRead.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        	
        	a[1][1]=Integer.parseInt(txtF1.getText());
			a[1][2]=Integer.parseInt(txtF2.getText());
			a[1][3]=Integer.parseInt(txtF3.getText());
			a[2][1]=Integer.parseInt(txtF4.getText());
			a[2][2]=Integer.parseInt(txtF5.getText());
			a[2][3]=Integer.parseInt(txtF6.getText());
			a[3][1]=Integer.parseInt(txtF7.getText());
			a[3][2]=Integer.parseInt(txtF8.getText());
			a[3][3]=Integer.parseInt(txtF9.getText());
			
			
			b[1]=Integer.parseInt(txtFP1.getText());
			b[2]=Integer.parseInt(txtFP2.getText());
			b[3]=Integer.parseInt(txtFP3.getText());
			
			Det= a[1][1]*(a[2][2]*a[3][3]-a[2][3]*a[3][2])
					-a[1][2]*(a[2][1]*a[3][3]-a[2][3]*a[3][1])
					+a[1][3]*(a[2][1]*a[3][2]-a[2][2]*a[3][1]);
			
			DetX= b[1]*(a[2][2]*a[3][3]-a[2][3]*a[3][2])
					-a[1][2]*(b[2]*a[3][3]-a[2][3]*b[3])
					+a[1][3]*(b[2]*a[3][2]-a[2][2]*b[3]);
			
			DetY= a[1][1]*(b[2]*a[3][3]-a[2][3]*b[3])
					-b[1]*(a[2][1]*a[3][3]-a[2][3]*a[3][1])
					+a[1][3]*(a[2][1]*b[3]-b[2]*a[3][1]);
			
			DetZ= a[1][1]*(a[2][2]*b[3]-b[2]*a[3][2])
					-a[1][2]*(a[2][1]*b[3]-b[2]*a[3][1])
					+b[1]*(a[2][1]*a[3][2]-a[2][2]*a[3][1]);
			
			
			if (Det!=0){
				txtDet.setText("∆ = "+a[1][1]+"*("+a[2][2]+"*"+a[3][3]+"-"+a[2][3]+"*"+a[3][2]+")"+
			"-"+a[1][2]+"*("+a[2][1]+"*"+a[3][3]+"-"+a[2][3]+"*"+a[3][1]+")"+
			"+"+a[1][3]+"*("+a[2][1]+"*"+a[3][2]+"-"+a[2][2]+"*"+a[3][1]+")"+" = "+Det);
				
				txtDetX.setText("∆x = "+b[1]+"*("+a[2][2]+"*"+a[3][3]+"-"+a[2][3]+"*"+a[3][2]+")"+
			"-"+a[1][2]+"*("+b[2]+"*"+a[3][3]+"-"+a[2][3]+"*"+b[3]+")"+
			"+"+a[1][3]+"*("+b[2]+"*"+a[3][2]+"-"+a[2][2]+"*"+b[3]+")"+" = "+DetX);
				
				txtDetY.setText("∆y = "+a[1][1]+"*("+b[2]+"*"+a[3][3]+"-"+a[2][3]+"*"+b[3]+")"+
						"-"+b[1]+"*("+a[2][1]+"*"+a[3][3]+"-"+a[2][3]+"*"+a[3][1]+")"+
						"+"+a[1][3]+"*("+a[2][1]+"*"+b[3]+"-"+b[2]+"*"+a[3][1]+")"+" = "+DetY);
				txtDetZ.setText("∆z = "+a[1][1]+"*("+a[2][2]+"*"+b[3]+"-"+b[2]+"*"+a[3][2]+")"+
						"-"+a[1][2]+"*("+a[2][1]+"*"+b[3]+"-"+b[2]+"*"+a[3][1]+")"+
						"+"+b[1]+"*("+a[2][1]+"*"+a[3][2]+"-"+a[2][2]+"*"+a[3][1]+")"+" = "+DetZ);
				
				txtX.setText("X = ∆x / ∆ = "+DetX/Det);
				txtY.setText("Y = ∆y / ∆ = "+DetY/Det);
				txtZ.setText("Z = ∆z / ∆ = "+DetZ/Det);				
				
			}else{
				JOptionPane.showMessageDialog(null, "Главный определитель '∆' равен нулю. Решений нет!");
			}  
        }
   });
	
	buttonClear.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        	txtF1.setText("1");
        	txtF2.setText("1");
        	txtF3.setText("1");
        	txtF4.setText("1");
        	txtF5.setText("1");
        	txtF6.setText("1");
        	txtF7.setText("1");
        	txtF8.setText("1");
        	txtF9.setText("1");
        	txtFP1.setText("1");
        	txtFP2.setText("1");
        	txtFP3.setText("1");
        	txtDet.setText("∆");
        	txtDetX.setText("∆x");
        	txtDetY.setText("∆y");
        	txtDetZ.setText("∆z");
        	txtX.setText("X = ∆x / ∆ ");
        	txtY.setText("Y = ∆y / ∆ ");
        	txtZ.setText("Z = ∆z / ∆ ");
        	
        	for (int y=1,x=1;y<=n&x<=n;x++){
        		a[y][x]=1;
        		
        		if(x==n){
        			b[y]=1;
        			y++;
    			    x=0;
        		}
        		
        	}   
        }
   });
	}  
}




