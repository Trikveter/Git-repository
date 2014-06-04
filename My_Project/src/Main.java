import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Frame Matrix");
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new GridBagLayout());
	
		
		//JButton readButton= new JButton("Рассчитать");


	
		int n=3;
		int [][]a = new int[n+1][n+1];
		int []b = new int[n+1];
		
//		//int y,x;
//		//int cx=0;
//		//int cy=0;
		
		int cyx=0;
		
		for (int y=1,x=1;y<=n&x<=n;x++){
			//a[y][x]=1; 
			//System.out.println("a"+y+"."+x+"="+a[y][x]);
//			//if (cx<=n){cx++;};

			JTextField[] txtF=new JTextField[n*n];
			txtF[cyx]=new JTextField(""+cyx);
		//	txtF[3]=a[2][1];
			
		//	a[y][x]=txtF[cyx]; 
			System.out.println("a"+y+"."+x+"="+a[y][x]);
			
			

			frame.add(txtF[cyx], new GridBagConstraints(x,y,1,1,1,1,GridBagConstraints.CENTER,
					GridBagConstraints.HORIZONTAL,new Insets(1,1,1,1),0,0));
			cyx++;
		    if (x==n){
		    	b[y]=y;
		    	System.out.println("b"+y+"="+b[y]);
			    y++;
			    x=0;
			}
		}
		
		
		int Det= a[1][1]*(a[2][2]*a[3][3]-a[2][3]*a[3][2])
				-a[1][2]*(a[2][1]*a[3][3]-a[2][3]*a[3][1])
				+a[1][3]*(a[2][1]*a[3][2]-a[2][2]*a[3][1]);
		
		int DetX= b[1]*(a[2][2]*a[3][3]-a[2][3]*a[3][2])
				-a[1][2]*(b[2]*a[3][3]-a[2][3]*b[3])
				+a[1][3]*(b[2]*a[3][2]-a[2][2]*b[3]);
		
		int DetY= a[1][1]*(b[2]*a[3][3]-a[2][3]*b[3])
				-a[1][2]*(a[2][1]*a[3][3]-a[2][3]*a[3][1])
				+a[1][3]*(a[2][1]*b[3]-b[2]*a[3][1]);
		
		int DetZ= a[1][1]*(a[2][2]*b[3]-b[2]*a[3][2])
				-a[1][2]*(a[2][1]*b[3]-b[2]*a[3][1])
				+a[1][3]*(a[2][1]*a[3][2]-a[2][2]*a[3][1]);

		int ax=DetX/Det; int ay=DetY/Det; int az=DetZ/Det;
		
		
	
		
//		frame.add(readButton, new GridBagConstraints(6,1,1,1,1,1,GridBagConstraints.CENTER,
	//			GridBagConstraints.CENTER,new Insets(1,1,1,1),0,0));
		
		frame.setVisible(true);
		//frame.pack(); 
		
		
		}	
		public class eHandler implements ActionListener {
			JButton readButton = new JButton("Рассчитать");
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==readButton){
					int i=Integer.parseInt(txtF[0].getText());
					}
				}
			}	  
}




