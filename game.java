import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JOptionPane;  
import static java.lang.String.valueOf;  
class game extends JFrame implements ActionListener
{
    int ch=0,n,loss=0,win=0,t_attemp=0;
   JFrame f=new JFrame();
	Label	title=new Label("LOGIN");
    Label	subtitle=new Label("Wel-Come To Guess Number Game");
    Label	subtitle1=new Label("You Will Be Asked To Guess Number To Win The Game and You Have Maximum 5 Attemp Limit");
	Label username=new Label("Enter the Guess number Between 1 to 100");
	JTextField txt=new JTextField();
	Label	mesg=new Label();
	Button btn=new Button("submit");
    Label txt_attemp=new Label("TOTAL ATTEMP -->");
    Label txt_loss=new Label("TOTAL LOSS    -->");
    Label txt_win=new Label("TOTAL WIN      -->");
    Label	total_attemp=new Label();
    Label total_loss=new  Label();
    Label total_win=new  Label();

	game()
	{
        Random a=new Random();
        n=a.nextInt(100);
		title.setBounds(290,0,300,30);
        subtitle.setBounds(200,40,200,30);
        subtitle1.setBounds(30,60,550,30);
		username.setBounds(150,100,250,50);
		txt.setBounds(150,150,250,30);
		btn.setBounds(230,250,100,30);
        txt_attemp.setBounds(30,300,110,30);
        txt_loss.setBounds(30,330,110,30);
        txt_win.setBounds(30,360,110,30);
        total_attemp.setBounds(135,300,50,30);
        total_loss.setBounds(135,330,100,30);
        total_win.setBounds(135,360,100,30);
        add(total_attemp);
        add(total_loss);
        add(total_win);
        add(txt_attemp);
        add(txt_loss);
        add(txt_win);
		add(title);
        add(subtitle);
        add(subtitle1);
		add(username);
		add(txt);
        add(mesg);
		add(btn);
        
        btn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
	        {
                int no=Integer.parseInt(txt.getText());
                 
                       if(no>n)
                           JOptionPane.showMessageDialog(f,"Your Guess Number is Greater  ");
                      else if(no<n)
                          JOptionPane.showMessageDialog(f,"Your Guess Number is Smaller  ");
                      else
                      {
                         JOptionPane.showMessageDialog(f,"WaW! Your Number is Correct . You Win The Game and Collect Your Prize...  ");
                         win=win+1;
                         t_attemp=t_attemp+1;
                        n=a.nextInt(100);
                         ch=0;
                      }
                      if(ch==4)
                    {
                         JOptionPane.showMessageDialog(f,"Your Attemp is finish and loss the Your game please Try again! ");
                         loss=loss+1;
                         t_attemp=t_attemp+1;
                         n=a.nextInt(100);
                    }    
                    ch=ch+1; 
                    total_attemp.setText(valueOf(t_attemp));
        total_loss.setText(valueOf(loss));
        total_win.setText(valueOf(win));           
            }   
            
        }
        );
        
		setLayout(null);
		setLayout(new BorderLayout(2,2));
		setVisible(true);
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		
		JOptionPane.showMessageDialog(f,"login  Username  "+txt.getText());
	}   
    public static void main(String args[])
    {
        game g=new game();
        
              
    }
}