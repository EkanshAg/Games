/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

    import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Tictactoe implements ActionListener
{
    int auto=2,comp=1;
 int enter=0;  
int dp=1,sp=0;
JFrame f=new JFrame();
JButton b[];
JButton reset,doubleplayer,singleplayer;
JPanel p,p1;
JLabel l;
int tie=0;
int w1=0,w2=0;
int flag[];
int win=0;
int player=1;
Tictactoe()
{
    reset=new JButton("RESET");
    doubleplayer=new JButton("Single Player");
    singleplayer=new JButton("Double Player");
 flag=new int[9];
b=new JButton[9];
p=new JPanel();
p1=new JPanel();
l=new JLabel("Score : Player1: 0 & Player2: 0");
for(int i=0;i<b.length;i++)
{
b[i]=new JButton();
 b[i].setFont(new Font("Verdana", Font.BOLD, 150));
 b[i].setBackground(Color.CYAN);
b[i].addActionListener(this);
p.add(b[i]);
}
f.add(p,BorderLayout.CENTER);
f.add(l,BorderLayout.NORTH);

   for(int i=0;i<9;i++)
   {
       flag[i]=0;
   }

p1.add(reset,FlowLayout.LEFT);
p1.add(singleplayer,FlowLayout.CENTER);
p1.add(doubleplayer,FlowLayout.RIGHT);
reset.addActionListener(this);
singleplayer.addActionListener(this);
doubleplayer.addActionListener(this);
f.add(p1,BorderLayout.SOUTH);


f.setVisible(true);
f.setSize(500,500);
p.setLayout(new GridLayout(3, 3));

//initially u is shown single player game
singleplayer.setEnabled(false);
reset.setEnabled(false);



f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}// end of constructor
public static void main(String a[])
{
new Tictactoe();
}

public void actionPerformed(ActionEvent e)
{
try{
    tie=0;
    reset.setEnabled(true);
    enter=0;
    
    if(e.getSource()==singleplayer)
    {
        singleplayer.setEnabled(false);
        doubleplayer.setEnabled(true);
        reset.setEnabled(false);
      for(int i=0;i<9;i++)
     {b[i].setEnabled(true);
         b[i].setText("");
          b[i].setBackground(Color.CYAN);
       flag[i]=0;
      }
      
      win=0;
      player=1;   
     dp=1;
     sp=0;
      w1=0;
      w2=0;
        l.setText("score: Player 1: "+w1+"  & Player 2: "+w2);
        
    }
    if(e.getSource()==doubleplayer)
    {
      for(int i=0;i<9;i++)
     {   b[i].setEnabled(true);
             b[i].setText("");
          b[i].setBackground(Color.CYAN);
       flag[i]=0;
      }
      
      singleplayer.setEnabled(true);
        doubleplayer.setEnabled(false);
        reset.setEnabled(false);
      win=0;
       
      
     dp=0;
     sp=1;
      w1=0;
      w2=0;
        l.setText("score: Player 1: "+w1+"  & Computer: "+w2);
        
    }
    if(dp==1&&sp==0)
    {
   
if(e.getSource()==b[0]&& flag[0]==0)
{
    if(player==1)
   {
    b[0].setText("x");
   
   player=2;
   }
    else
   {
     b[0].setText("0");  
    player=1;
    }
     flag[0]=1;
//to check whether any player has won   
    check();
       
       
     
}
 if(e.getSource()==b[1]&& flag[1]==0)
{
    if(player==1)
   {
    b[1].setText("x");
   player=2;
   }
    else
   {
     b[1].setText("0");  
    player=1;
    }
     flag[1]=1;
//to check whether any player has won   
    check();
  
}   
 if(e.getSource()==b[2]&& flag[2]==0)
{
    if(player==1)
   {
    b[2].setText("x");
   player=2;
   }
    else
   {
     b[2].setText("0");  
    player=1;
    }
     flag[2]=1;
//to check whether any player has won   
    check();
  
}           

  if(e.getSource()==b[3]&& flag[3]==0)
{
    if(player==1)
   {
    b[3].setText("x");
   player=2;
   }
    else
   {
     b[3].setText("0");  
    player=1;
    }
     flag[3]=1;
//to check whether any player has won   
    check();
  
}  
  
  if(e.getSource()==b[4]&& flag[4]==0)
{
    if(player==1)
   {
    b[4].setText("x");
   player=2;
   }
    else
   {
     b[4].setText("0");  
    player=1;
    }
     flag[4]=1;
//to check whether any player has won   
    check();
  
}
  if(e.getSource()==b[5]&& flag[5]==0)
{
    if(player==1)
   {
    b[5].setText("x");
   player=2;
   }
    else
   {
     b[5].setText("0");  
    player=1;
    }
     flag[5]=1;
//to check whether any player has won   
    check();
  
}
  if(e.getSource()==b[6]&& flag[6]==0)
{
    if(player==1)
   {
    b[6].setText("x");
   player=2;
   }
    else
   {
     b[6].setText("0");  
    player=1;
    }
     flag[6]=1;
//to check whether any player has won   
    check();
  
}
  if(e.getSource()==b[7]&& flag[7]==0)
{
    if(player==1)
   {
    b[7].setText("x");
   player=2;
   }
    else
   {
     b[7].setText("0");  
    player=1;
    }
     flag[7]=1;
//to check whether any player has won   
    check();
  
}
  if(e.getSource()==b[8]&& flag[8]==0)
{
    if(player==1)
   {
    b[8].setText("x");
   player=2;
   }
    else
   {
     b[8].setText("0");  
    player=1;
    }
     flag[8]=1;
     //to check whether any player has won   
    check();
  
}
     }//end of if double player

    
    // starting of single player and computer
    if(dp==0&&sp==1)
    {
    enter=0;
        if(e.getSource()==b[4]&& flag[4]==0)
        {
           b[4].setText("x");
             flag[4]=1;
             check(); // to check any player has win or not
             put();// to check any two buttons are selcted
           if (tie==0)
             check();
           
           
           if(auto==1&&enter==0)
           {
               if(flag[0]==1&&flag[8]==0)
               {
               b[8].setText("0");
                flag[8]=1;
                enter=1;
               }
               
               else if(flag[2]==1&&flag[6]==0)
               {
               b[6].setText("0");
                flag[6]=1;
                enter=1;
               }
               
               else if(flag[6]==1&&flag[2]==0)
               {
               b[2].setText("0");
                flag[2]=1;
                enter=1;
               } 
               else if(flag[8]==1&&flag[0]==0)
               {
               b[0].setText("0");
                flag[0]=1;
                enter=1;
               } 
                check();
              
           }
           
             
             if(b[0].getText().equals("")&&enter==0)
             {
                b[0].setText("0");
                flag[0]=1;
                enter=1;
             }  
             
               
             if(b[6].getText().equals("")&&enter==0)
             {
                b[6].setText("0"); 
                 flag[6]=1;
                enter=1;
             } 
             if(b[2].getText().equals("")&&enter==0)
             {
                b[2].setText("0"); 
                 flag[2]=1;
                enter=1;
             }  
             if(b[8].getText().equals("")&&enter==0)
             {
                b[8].setText("0"); 
                 flag[8]=1;
                enter=1;
             }
             if(enter==0)
             {
                 put1();
             }
        }
     if(e.getSource()==b[0]&& flag[0]==0)
        {
            b[0].setText("x");
             flag[0]=1;
             check(); // to check any player has win or not
             put();// to check any two buttons are selcted
           if (tie==0)
             check();
            if(auto==1&&enter==0)
           {
               if(flag[2]==1&&flag[6]==0)
               {
               b[6].setText("0");
                flag[6]=1;
                enter=1;
               }
               else if(flag[8]==1&&flag[2]==0)
               {
               b[2].setText("0");
                flag[2]=1;
                enter=1;
               }
               else  if(flag[6]==1&&flag[8]==0)
               {
               b[8].setText("0");
                flag[8]=1;
                enter=1;
               }
               if(flag[4]==1&&flag[2]==0)
               {
               b[8].setText("0");
                flag[8]=1;
                enter=1;
               }
                check();
           }
           
           if(b[7].getText().equals("x")&&flag[3]==0&&enter==0)
             {
                 b[3].setText("0");
                 flag[3]=1;
                 enter=1;
             }
             if(b[4].getText().equals("")&&enter==0)
             {
                 b[4].setText("0");
                 flag[4]=1;
                 enter=1;
             }
             if(b[1].getText().equals("")&&enter==0)
             {
                 b[1].setText("0");
                 flag[1]=1;
                 enter=1;
             }
             
          
             if(enter==0)
                 
             {put1();
             }
        }
        
     if(e.getSource()==b[2]&& flag[2]==0)
        {
           b[2].setText("x");
             flag[2]=1;
             check(); // to check any player has win or not
           
             put();// to check any two buttons are selcted
             if (tie==0) 
             check();
             
              if(auto==1&&enter==0)
           {
               if(flag[0]==1&&flag[8]==0)
               {
               b[8].setText("0");
                flag[8]=1;
                enter=1;
               }
               else   if(flag[8]==1&&flag[6]==0)
               {
               b[6].setText("0");
                flag[6]=1;
                enter=1;
               }
             
                else  if(flag[4]==1&&flag[6]==0)
               {
               b[6].setText("0");
                flag[6]=1;
                enter=1;
               }
               else  if(flag[2]==1&&flag[8]==0)
               {
               b[8].setText("0");
                flag[8]=1;
                enter=1;
               }
                check();
           }
           if(b[3].getText().equals("x")&&enter==0&&flag[0]==0)
             {
                 b[0].setText("0");
                 flag[0]=1;
                 enter=1;
             }  
          if(b[4].getText().equals("")&&enter==0)
             {
                 b[4].setText("0");
                 flag[4]=1;
                 enter=1;
             }
           if(b[5].getText().equals("")&&enter==0)
             {
                 b[5].setText("0");
                 flag[5]=1;
                 enter=1;
             }
           
             if(enter==0)
                 
             {put1();
             }
     
     
        }
     if(e.getSource()==b[6]&& flag[6]==0)
        {
           b[6].setText("x");
             flag[6]=1;
             check(); // to check any player has win or not
             put();// to check any two buttons are selcted
             if (tie==0)
             check();
           
             if(auto==1&&enter==0)
           {
               if(flag[0]==1&&flag[8]==0)
               {
               b[8].setText("0");
                flag[8]=1;
                enter=1;
               }
               else  if(flag[2]==1&&flag[8]==0)
               {
               b[8].setText("0");
                flag[8]=1;
                enter=1;
               }
            else  if(flag[8]==1&&flag[0]==0)
               {
               b[0].setText("0");
                flag[0]=1;
                enter=1;
               }
               else  if(flag[4]==1&&flag[2]==0)
               {
               b[2].setText("0");
                flag[2]=1;
                enter=1;
               }
      check();
           }
             if(b[4].getText().equals("")&&enter==0)
             {
                 b[4].setText("0");
                 flag[4]=1;
                 enter=1;
             }
             if(b[7].getText().equals("")&&enter==0)
             {
                 b[7].setText("0");
                 flag[7]=1;
                 enter=1;
             }
          
             if(enter==0)
                 
             {put1();
             }
         }
     
     if(e.getSource()==b[8]&& flag[8]==0)
        {
           b[8].setText("x");
             flag[8]=1;
             check(); // to check any player has win or not
             put();// to check any two buttons are selcted
             if (tie==0) 
             check();
             
             if(auto==1&&enter==0)
           {
                if(flag[4]==1&&flag[3]==1&&flag[0]==1&&flag[2]==0)
               {
               b[2].setText("0");
                flag[2]=1;
                enter=1;
               }
                else if(flag[0]==1&&flag[6]==0)
               {
               b[6].setText("0");
                flag[6]=1;
                enter=1;
               }
              
               else   if(flag[6]==1&&flag[0]==0)
               {
               b[0].setText("0");
                flag[0]=1;
                enter=1;
               }
               else  if(flag[4]==1&&flag[0]==0)
               {
               b[0].setText("0");
                flag[0]=1;
                enter=1;
               }
              
              
                 else    if(flag[8]==1&&flag[6]==0)
               {
               b[6].setText("0");
                flag[6]=1;
                enter=1;
               }
            check();
           }
             if(b[4].getText().equals("x")&&enter==0&&flag[2]==0)
             {
                 b[2].setText("0");
                 flag[2]=1;
                 enter=1;
             }
             if(b[1].getText().equals("x")&&enter==0&&flag[2]==0)
             {
                 b[2].setText("0");
                 flag[2]=1;
                 enter=1;
             }
             if(b[4].getText().equals("")&&enter==0)
             {
                 b[4].setText("0");
                 flag[4]=1;
                 enter=1;
             }
             if(b[7].getText().equals("")&&enter==0)
             {
                 b[7].setText("0");
                 flag[7]=1;
                 enter=1;
             }
            
             if(enter==0)
                 
             {put1();
             }
             }
     
     if(e.getSource()==b[1]&& flag[1]==0)
        {
           b[1].setText("x");
             flag[1]=1;
             check(); // to check any player has win or not
            
             put();// to check any two buttons are selcted
             if (tie==0) 
             check();
             
              if(auto==1&&enter==0)
           {
               
            if(flag[0]==1&&flag[2]==1&&flag[3]==1&&flag[8]==0)
               {
               b[8].setText("0");
                flag[8]=1;
                enter=1;
               }
            else if(flag[0]==1&&flag[6]==0)
               {
               b[6].setText("0");
                flag[6]=1;
                enter=1;
               }
             check();
           }
              
             
          if(b[4].getText().equals("")&&enter==0)
             {
                 b[4].setText("0");
                 flag[4]=1;
                 enter=1;
             }
             if(b[0].getText().equals("")&&enter==0)
             {
                b[0].setText("0");
                flag[0]=1;
                enter=1;
             }  
             
             if(b[2].getText().equals("")&&enter==0)
             {
                b[2].setText("0"); 
                 flag[2]=1;
                enter=1;
             }    
             if(b[6].getText().equals("")&&enter==0)
             {
                b[6].setText("0"); 
                 flag[6]=1;
                enter=1;
             }    
             if(b[8].getText().equals("")&&enter==0)
             {
                b[8].setText("0"); 
                 flag[8]=1;
                enter=1;
             }
          
             if(enter==0)
                 
             {put1();
             }
             }
     if(e.getSource()==b[3]&& flag[3]==0)
        {
           b[3].setText("x");
             flag[3]=1;
             check(); // to check any player has win or not
             put();// to check any two buttons are selcted
             if (tie==0) 
             check();
             
              
          if(auto==1&&enter==0)
           {
               
               
               if(flag[0]==1&& flag[6]==1&&flag[8]==1&&flag[2]==0)
               { b[2].setText("0");
                flag[2]=1;
                enter=1;
               }
               else   if(flag[0]==1&& flag[1]==1&&flag[6]==1&&flag[8]==0)
               { b[8].setText("0");
                flag[8]=1;
                enter=1;
               }
               else  if(flag[0]==1&&flag[2]==0)
               {
                   b[2].setText("0");
                flag[2]=1;
                enter=1;
               }
               check();
           }
             
          if(b[4].getText().equals("")&&enter==0)
             {
                 b[4].setText("0");
                 flag[4]=1;
                 enter=1;
             }
             if(b[0].getText().equals("")&&enter==0)
             {
                b[0].setText("0");
                flag[0]=1;
                enter=1;
             }  
             if(b[6].getText().equals("")&&enter==0)
             {
                b[6].setText("0"); 
                 flag[6]=1;
                enter=1;
             }
             if(b[2].getText().equals("")&&enter==0)
             {
                b[2].setText("0"); 
                 flag[2]=1;
                enter=1;
             }    
                 
             if(b[8].getText().equals("")&&enter==0)
             {
                b[8].setText("0"); 
                 flag[8]=1;
                enter=1;
             }
          
             if(enter==0)
                 
             {put1();
             }
             }
     if(e.getSource()==b[5]&& flag[5]==0)
        {
           b[5].setText("x");
             flag[5]=1;
             check(); // to check any player has win or not
             put();// to check any two buttons are selcted
             if (tie==0) 
             check();
             
              if(auto==1&&enter==0)
           {
               if(flag[2]==1&& flag[6]==1&&flag[8]==1&&flag[0]==0)
               { b[0].setText("0");
                flag[0]=1;
                enter=1;
               }
               else  if(flag[0]==1&& flag[2]==1&&flag[8]==1&&flag[6]==0)
               { b[6].setText("0");
                flag[6]=1;
                enter=1;
               }
               else if(flag[2]==1&&flag[0]==0)
               {
                   b[0].setText("0");
                flag[0]=1;
                enter=1;
               }
                else if(flag[8]==1&&flag[6]==0)
               {
                   b[6].setText("0");
                flag[6]=1;
                enter=1;
               }
               check();
           }
          if(b[4].getText().equals("")&&enter==0)
             {
                 b[4].setText("0");
                 flag[4]=1;
                 enter=1;
             }
             if(b[2].getText().equals("")&&enter==0)
             {
                b[2].setText("0");
                flag[2]=1;
                enter=1;
             }  
             if(b[8].getText().equals("")&&enter==0)
             {
                b[8].setText("0"); 
                 flag[8]=1;
                enter=1;
             }
             if(b[0].getText().equals("")&&enter==0)
             {
                b[0].setText("0"); flag[0]=1; 
                enter=1;
             }    
             if(b[6].getText().equals("")&&enter==0)
             {
                b[6].setText("0"); 
                 flag[6]=1;
                enter=1;
             }    
             
          
             if(enter==0)
                 
             {put1();
             }
             }
     if(e.getSource()==b[7]&& flag[7]==0)
        {
           b[7].setText("x");
             flag[7]=1;
             check(); // to check any player has win or not
             put();// to check any two buttons are selcted
             if (tie==0)
             check();
             
              if(auto==1&&enter==0)
           {
               if(flag[2]==1&& flag[6]==1&&flag[8]==1&&flag[0]==0)
               { b[0].setText("0");
                flag[0]=1;
                enter=1;
               }
               else  if(flag[0]==1&& flag[6]==1&&flag[8]==1&&flag[2]==0)
               { b[2].setText("0");
                flag[2]=1;
                enter=1;
               }
                else  if(flag[5]==1&& flag[7]==1&&flag[8]==1&&flag[0]==0)
               { b[0].setText("0");
                flag[0]=1;
                enter=1;
               }
                else if(flag[2]==0&&flag[8]==1)
                {
                    b[2].setText("0");
                flag[2]=1;
                enter=1;
                }
                else if(flag[0]==0&&flag[7]==1)
                {
                    b[0].setText("0");
                flag[0]=1;
                enter=1;
                }
                check();
           } 
             
             if(b[0].getText().equals("x")&&enter==0&&flag[3]==0)
             {
                 b[3].setText("0");
                 flag[3]=1;
                 enter=1;
             }
             if(b[2].getText().equals("x")&&enter==0&&flag[5]==0)
             {
                 b[5].setText("0");
                 flag[5]=1;
                 enter=1;
             }
             if(b[5].getText().equals("x")&&enter==0&&flag[2]==0)
             {
                b[2].setText("0");
                flag[2]=1;
                enter=1;
             }  
          if(b[4].getText().equals("")&&enter==0)
             {
                 b[4].setText("0");
                 flag[4]=1;
                 enter=1;
             }
              if(b[0].getText().equals("")&&enter==0&& b[3].getText().equals("x")&&b[4].getText().equals("0")&&enter==0)
              {
                  b[0].setText("0"); 
                 flag[0]=1;
                enter=1;
                  
              }
             if(b[2].getText().equals("")&&enter==0)
             {
                b[2].setText("0"); 
                 flag[2]=1;
                enter=1;
             } 
             if(b[0].getText().equals("")&&enter==0)
             {
                b[0].setText("0");
                flag[0]=1;
                enter=1;
             }  
             
        
             if(b[6].getText().equals("")&&enter==0)
             {
                b[6].setText("0");  flag[6]=1;
                enter=1;
             }    
             if(b[8].getText().equals("")&&enter==0)
             {
                b[8].setText("0");  flag[8]=1;
                enter=1;
             }
          
             if(enter==0)
                 
             {put1();
             }
             }
     
       }//end of single player
      
    
    if(e.getSource()==reset)
   {
      for(int i=0;i<9;i++)
     {
         b[i].setText("");
          b[i].setBackground(Color.CYAN);
       flag[i]=0;
       b[i].setEnabled(true);
      }
      win=0;
      player=1;   
      w1=0;
      w2=0;
      comp=1;
      auto=2;
      reset.setEnabled(false);
       if(dp==0&&sp==1)
       {
           tie=0;
           dp=0;
           sp=1;
            l.setText("score: Player 1: "+w1+"  & Computer: "+w2);
       }
       
      else
    {
        dp=1;
        sp=0;
         l.setText("score: Player 1: "+w1+"  & Player 2: "+w2);
    }
   }   
   
  
    
 
}
    catch(Exception e1)
    {
        //system.out.println(e1);
    }
    
}// end of funct


public void put()
{
    try{
          // checking  rows
  for(int i=0;i<9;i=i+3)
  {
   
    if(b[i].getText().equals("0")&&b[i+1].getText().equals("0")&&b[i+2].getText().equals(""))
     {
       b[i+2].setText("0");
        flag[i+2]=1;
         enter=1;
       break;
     }
    else if(b[i].getText().equals("0")&&b[i+1].getText().equals("")&&b[i+2].getText().equals("0"))
     {
       b[i+1].setText("0");
        flag[i+1]=1;
         enter=1;
       break;
     }
    else if(b[i].getText().equals("")&&b[i+1].getText().equals("0")&&b[i+2].getText().equals("0"))
     {
       b[i].setText("0");
        flag[i]=1;
         enter=1;
       break;
     }  
  }
  for(int i=0;i<9;i=i+3)
  {
   
  if(b[i].getText().equals("x")&&b[i+1].getText().equals("x")&&b[i+2].getText().equals("")&&enter==0)
     {
       b[i+2].setText("0");
        flag[i+2]=1;
         enter=1;
       break;
     }
   else if(b[i].getText().equals("x")&&b[i+1].getText().equals("")&&b[i+2].getText().equals("x")&&enter==0)
     {
       b[i+1].setText("0");
        flag[i+1]=1;
         enter=1;
       break;
     }
     
   else   if(b[i].getText().equals("")&&b[i+1].getText().equals("x")&&b[i+2].getText().equals("x")&&enter==0)
     {
       b[i].setText("0");
        flag[i]=1;
         enter=1;
       break;
     }  
     
  }     // end of for "rows"
        
  
  //checking columns
  if(enter==0)
  {
  for(int i=0;i<3;i++)
  {
       if(b[i].getText().equals("0")&&b[i+3].getText().equals("0")&&b[i+6].getText().equals(""))
     {
       b[i+6].setText("0");
        flag[i+6]=1;
         enter=1;
       break;
     }
               else if(b[i].getText().equals("0")&&b[i+3].getText().equals("")&&b[i+6].getText().equals("0"))
     {
       b[i+3].setText("0");
        flag[i+3]=1;
         enter=1;
       break;
     }
      else if(b[i].getText().equals("")&&b[i+3].getText().equals("0")&&b[i+6].getText().equals("0"))
     {
       b[i].setText("0");
        flag[i]=1;
         enter=1;
       break;
     }
  }
   for(int i=0;i<3;i++)
  {
 
     if(b[i].getText().equals("x")&&b[i+3].getText().equals("x")&&b[i+6].getText().equals("")&&enter==0)
     {
       b[i+6].setText("0");
        flag[i+6]=1;
         enter=1;
       break;
     }
  
  else if(b[i].getText().equals("x")&&b[i+3].getText().equals("")&&b[i+6].getText().equals("x")&&enter==0)
     {
       b[i+3].setText("0");
        flag[i+3]=1;
         enter=1;
       break;
     }
  
  else if(b[i].getText().equals("")&&b[i+3].getText().equals("x")&&b[i+6].getText().equals("x")&&enter==0)
     {
       b[i].setText("0");
        flag[i]=1;
         enter=1;
       break;
     }
    
  }
  }
  
  // checking 1st diagonal
  if(enter==0)
  {   if(b[0].getText().equals("0")&&b[4].getText().equals("0")&&b[8].getText().equals(""))
     {
    b[8].setText("0");
 flag[8]=1; enter=1;
     }
          
         else if(b[0].getText().equals("0")&&b[4].getText().equals("")&&b[8].getText().equals("0"))
     {
    b[4].setText("0");
      flag[4]=1; enter=1;
     }
       else if(b[0].getText().equals("")&&b[4].getText().equals("0")&&b[8].getText().equals("0"))
     {
    b[0].setText("0");
      flag[0]=1; enter=1;
     }
  
      else if(b[0].getText().equals("x")&&b[4].getText().equals("x")&&b[8].getText().equals(""))
     {
    b[8].setText("0");
 flag[8]=1; enter=1;
     }
            
          
   else if(b[0].getText().equals("x")&&b[4].getText().equals("")&&b[8].getText().equals("x"))
     {
    b[4].setText("0");
      flag[4]=1; enter=1;
     }
          
   else if(b[0].getText().equals("")&&b[4].getText().equals("x")&&b[8].getText().equals("x"))
     {
    b[0].setText("0");
      flag[0]=1; enter=1;
     }
  
  }
  
  // checking 2nd diagonal
  if(enter==0)
  {  if(b[2].getText().equals("0")&&b[4].getText().equals("0")&&b[6].getText().equals(""))
     {
        b[6].setText("0");  
         flag[6]=1; enter=1;
     }
       else if(b[2].getText().equals("0")&&b[4].getText().equals("")&&b[6].getText().equals("0"))
     {
        b[4].setText("0");  
         flag[4]=1; enter=1;
     }
     else if(b[2].getText().equals("")&&b[4].getText().equals("0")&&b[6].getText().equals("0"))
     {
        b[2].setText("0");  
         flag[2]=1; enter=1;
     }
      else  if(b[2].getText().equals("x")&&b[4].getText().equals("x")&&b[6].getText().equals(""))
     {
        b[6].setText("0");  
         flag[6]=1; enter=1;
     }
   
            else if(b[2].getText().equals("x")&&b[4].getText().equals("")&&b[6].getText().equals("x"))
     {
        b[4].setText("0");  
         flag[4]=1; enter=1;
     }
    
 
   else if(b[2].getText().equals("")&&b[4].getText().equals("x")&&b[6].getText().equals("x"))
     {
        b[2].setText("0");  
         flag[2]=1; enter=1;
     }
  
  }
  
    }//end of try
    catch(Exception e1)
    {
       //system.out.println(e1); 
    }
    
    
    
    
    
}

public void  put1()
{
    for(int i=0;i<9;i++)
    {
        if(flag[i]==0)
        {
            b[i].setText("0");
            flag[i]=1;
            break;
        }
     
    }
   
    check();
  
    
}



  public  void  check()
            {
                try{
                  
            
            
            //to check who wins 
  
  // checking  rows
  for(int i=0;i<9;i=i+3)
  {
   if(b[i].getText().equals("x")&&b[i+1].getText().equals("x")&&b[i+2].getText().equals("x"))
     {
         b[i].setBackground(Color.red);
         b[i+1].setBackground(Color.red);
         b[i+2].setBackground(Color.red);
        JOptionPane.showMessageDialog(f,"Player 1 wins"); 
        w1++;
      
        
   win =1;
        break;
     }
   if(b[i].getText().equals("0")&&b[i+1].getText().equals("0")&&b[i+2].getText().equals("0"))
     {
         b[i].setBackground(Color.green);
         b[i+1].setBackground(Color.green);
         b[i+2].setBackground(Color.green);
         if(dp==1&&sp==0)
         JOptionPane.showMessageDialog(f,"Player 2 wins"); 
        else
          JOptionPane.showMessageDialog(f,"Computer wins"); w2++;
        //l.setText("Score: Player 1: "+w1+"  & Player 2: "+w2);
   win =1;
        break;
     }
  }//end of for
  
  //checking columns
  for(int i=0;i<3;i++)
  {
  if(b[i].getText().equals("x")&&b[i+3].getText().equals("x")&&b[i+6].getText().equals("x"))
     {
         b[i].setBackground(Color.red);
         b[i+3].setBackground(Color.red);
         b[i+6].setBackground(Color.red);
        JOptionPane.showMessageDialog(f,"Player 1 wins"); 
        
        w1++;
        //l.setText("Score: Player 1: "+w1+"  & Player 2: "+w2);
        win =1;
        break;
     }
   if(b[i].getText().equals("0")&&b[i+3].getText().equals("0")&&b[i+6].getText().equals("0"))
     {
         b[i].setBackground(Color.green);
         b[i+3].setBackground(Color.green);
         b[i+6].setBackground(Color.green);
         if(dp==1&&sp==0)
         JOptionPane.showMessageDialog(f,"Player 2 wins"); 
        else
          JOptionPane.showMessageDialog(f,"Computer wins");  
        w2++;
        //l.setText("Score: Player 1: "+w1+"  & Player 2: "+w2);
        win =1;
        break;
     }
  
  }
  
  // checking 1st diagonal
  
   if(b[0].getText().equals("x")&&b[4].getText().equals("x")&&b[8].getText().equals("x"))
     {
         b[0].setBackground(Color.red);
         b[4].setBackground(Color.red);
         b[8].setBackground(Color.red);
        JOptionPane.showMessageDialog(f,"Player 1 wins"); 
        w1++;
        win =1;
        //l.setText("Score: Player 1: "+w1+"  & Player 2: "+w2);
  
     }
   if(b[0].getText().equals("0")&&b[4].getText().equals("0")&&b[8].getText().equals("0"))
     {
         b[0].setBackground(Color.green);
         b[4].setBackground(Color.green);
         b[8].setBackground(Color.green);
         if(dp==1&&sp==0)
         JOptionPane.showMessageDialog(f,"Player 2 wins"); 
        else
          JOptionPane.showMessageDialog(f,"Computer wins");  
        w2++;
        win =1;
        //l.setText("Score: Player 1: "+w1+"  & Player 2: "+w2);
  
     }
  // checking 2nd diagonal
   if(b[2].getText().equals("x")&&b[4].getText().equals("x")&&b[6].getText().equals("x"))
     {
         b[2].setBackground(Color.red);
         b[4].setBackground(Color.red);
         b[6].setBackground(Color.red);
        JOptionPane.showMessageDialog(f,"Player 1 wins"); 
        w1++;
        win =1;
       // l.setText("Score: Player 1: "+w1+"  & Player 2: "+w2);
  
     }
  if(b[2].getText().equals("0")&&b[4].getText().equals("0")&&b[6].getText().equals("0"))
     {
         b[2].setBackground(Color.green);
         b[4].setBackground(Color.green);
         b[6].setBackground(Color.green);
         
         if(dp==1&&sp==0)
         JOptionPane.showMessageDialog(f,"Player 2 wins"); 
        else
          JOptionPane.showMessageDialog(f,"Computer wins");   
         w2++;
        win =1;
        //l.setText("Score: Player 1: "+w1+"  & Player 2: "+w2);
  
     }
  
  if(win==1)
  {
      if(dp==1&&sp==0)
      {
      l.setText("score: Player 1: "+w1+"  & Player 2: "+w2);
      }
      else
      {
      l.setText("score: Player 1: "+w1+"  & Computer: "+w2);
      }
      
      int n = JOptionPane.showConfirmDialog(f,"Do you want to play another game?","Game",JOptionPane.YES_NO_OPTION);
//System.out.println(n);  // return 0 if yes
  if(n==0)
   {
     
      for(int i=0;i<9;i++)
     {
         b[i].setText("");
          b[i].setBackground(Color.CYAN);
       flag[i]=0;
      }
      win=0;
      player=1; 
      enter=1;
     
      if(sp==1&&dp==0)
      {comp++;
    
       //system.out.println(comp+"win");
           
          if(auto==2)
      {
        auto=1;  
        autoplayer();
      
      }
          else if(auto==1)
      {
          auto=2;
            
      }
            
    //system.out.println("auto"+auto); 
          
   }   
   }
  else
  {
     for(int i=0;i<9;i++)
      {
          b[i].setEnabled(false);
               } 
  enter=1;
  tie=1;
  }
    
  }
          
          
          
     //as  no player wins     
          
  else     
  {
      int all=0;   // to check whether all buttons are selected or not, 
      for(int j=0;j<9;j++)
      {
          if(b[j].getText().equals("0")||b[j].getText().equals("x"))
          { 
              ++all;// System.out.print(all);
          }
      
      
         
          if(all==9)// if equals 9 that means all button are selected and no player has yet won
                  {
       
              tie=0;
              JOptionPane.showMessageDialog(f,"Tie"); 
         int n = JOptionPane.showConfirmDialog(f,"Do you want to play another game?","Game",JOptionPane.YES_NO_OPTION);
        //system.out.println(n);  // return 0 if yes and 1if no
            if(n==0)
            {
           for(int i=0;i<9;i++)
          {
         b[i].setText("");
          b[i].setBackground(Color.CYAN);
       flag[i]=0;
          }
      win=0;
      player=1;    
      enter=1;
      
       if(sp==1&&dp==0)
      {comp++;
          //system.out.println(comp+"tie");
          
 if(auto==2)
      {
        auto=1;  
         autoplayer();
      }
    else  if(auto==1)
      {
          auto=2;
          
      }
          
       //system.out.println("auto"+auto); 
         
   }   
        }   
        else
        {
            enter=1;
            tie=1;
        for(int i=0;i<9;i++)
         {
          b[i].setEnabled(false);
         } 
      
        
        
         }     
          }

      
      }// end of for
  }// end of else
   
   }// end of try
   catch(Exception e1)
   {
   //system.out.println(e1);
   }
}
  
  void autoplayer()
  {
      //system.out.println("ekuuuuu"+comp);
      
      if(comp==2)
      {
         b[0].setText("0");
                 flag[0]=1;
                
                 
                  
      }
      else if(comp==4)
      {
         b[2].setText("0");
                 flag[2]=1;
                  
      }
       
      else if(comp==6)
      {
         b[8].setText("0");
                 flag[8]=1;
                  
      }
       
     else if(comp==10)
      {
         b[6].setText("0");
                 flag[6]=1;
                  
      }
      else if(comp==8)
      {
         b[4].setText("0");
                 flag[4]=1;
                  
      }
     else  if( comp==12)
       {
           b[0].setText("0");
                 flag[0]=1;
                
                     comp=2;
       }
      enter=1; 
  }
   

}//end of class