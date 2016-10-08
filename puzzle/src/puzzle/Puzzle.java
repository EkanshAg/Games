/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzle;

/**
 *
 * @author Ekansh Agarwal
 */

import java.awt.Dimension;
import java.awt.GridLayout;

import java.awt.Image;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;



class Puzzle
    implements ActionListener
{

    JFrame f;
    JPanel p1;
    JPanel p2;
    JButton b[];
    Icon image;
    int buttonX1;
    int buttonY1;
    int x;
    int pos;
    JButton oldbutton;

    
  public static void main(String args[])
    {
        new Puzzle();
    }
 
    Puzzle()
    {
        
        try{
        f = new JFrame("PUZZLE");
        b = new JButton[11];
        
        //x = 0;
        pos = 0;
        //oldbutton = null;
        p1 = new JPanel();
        p2 = new JPanel();
        f.setDefaultCloseOperation(3);
        
       int  w = 100, h = 100; 
       //bi.getGraphics().drawImage(orig, 0, 0, w, h, x, y, x + w, y + h, null);
        
       Image orig=null;
      
       
           orig = ImageIO.read(new File("01.jpg"));
       
      
       
        BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
       bi.getGraphics().drawImage(orig, 0, 0, w, h, 0, 0, w,  h, null);
      ImageIO.write(bi, "jpg", new File("1.jpg"));
      bi.getGraphics().drawImage(orig, 0, 0, w, h, 100, 0, 100 + w, 0+ h, null);
      ImageIO.write(bi, "jpg", new File("2.jpg"));
      bi.getGraphics().drawImage(orig, 0, 0, w, h, 200, 0, 200+ w, 0 + h, null);
      ImageIO.write(bi, "jpg", new File("3.jpg"));
      bi.getGraphics().drawImage(orig, 0, 0, w, h, 0, 100, 0+ w, 100 + h, null);
      ImageIO.write(bi, "jpg", new File("4.jpg"));
        bi.getGraphics().drawImage(orig, 0, 0, w, h, 100, 100, 100+ w, 100 + h, null);
      ImageIO.write(bi, "jpg", new File("5.jpg"));
      bi.getGraphics().drawImage(orig, 0, 0, w, h, 200, 100, 200+ w, 100 + h, null);
      ImageIO.write(bi, "jpg", new File("6.jpg"));
      bi.getGraphics().drawImage(orig, 0, 0, w, h, 0, 200, 0+ w, 200 + h, null);
      ImageIO.write(bi, "jpg", new File("7.jpg"));
      bi.getGraphics().drawImage(orig, 0, 0, w, h, 100, 200, 100+ w, 200 + h, null);
      ImageIO.write(bi, "jpg", new File("8.jpg"));
      bi.getGraphics().drawImage(orig, 0, 0, w, h, 200, 200, 200+ w, 200 + h, null);
      ImageIO.write(bi, "jpg", new File("9.jpg"));
        
      
       
        b[1] = new JButton(new ImageIcon("1.jpg"));
        b[2] = new JButton(new ImageIcon("3.jpg"));
        b[3] = new JButton(new ImageIcon("6.jpg"));
        b[4] = new JButton(new ImageIcon("9.jpg"));
        b[5] = new JButton(new ImageIcon("use.png"));
        b[6] = new JButton(new ImageIcon("2.jpg"));
        b[7] = new JButton(new ImageIcon("8.jpg"));
        b[8] = new JButton(new ImageIcon("5.jpg"));
        b[9] = new JButton(new ImageIcon("7.jpg"));
      b[10] = new JButton(new ImageIcon("4.jpg"));
       
      for(int i = 1; i <= 10; i++)
        {
            b[i].setPreferredSize(new Dimension(100, 100));
            p1.add(b[i]);
            b[i].addActionListener(this);
              
        }

b[0] = new JButton(new ImageIcon("01.jpg"));
b[0].setPreferredSize(new Dimension(300, 300));

         image = b[5].getIcon();  
         
         System.out.println("eeee");
         
        f.add(p1, "West");  
        f.add(p2, "East");
        p1.setLayout(new GridLayout(4, 3));
        p2.add(b[0]);
        f.pack();
        f.setVisible(true);
        
        }
        catch(Exception e)
        {
    System.out.println(e);            
        }
        
    }

    public void actionPerformed(ActionEvent e)
    {
       
        JButton button1 = (JButton)e.getSource();
        Icon image1 = button1.getIcon();
        buttonX1 = button1.getX(); System.out.println(buttonX1);
        buttonY1 = button1.getY(); System.out.println(buttonY1);
       /* if(oldbutton != button1)
        {
            x = 0;
        }*/
        if(buttonX1 == 0 && buttonY1 == 0)
        {
            pos = 1;
        } else
        if(buttonX1 == 100 && buttonY1 == 0)
        {
            pos = 2;
        } else
        if(buttonX1 == 200 && buttonY1 == 0)
        {
            pos = 3;
        }  else
        if(buttonX1 == 0 && buttonY1 == 100)
        {
            pos = 4;
        } else
        if(buttonX1 == 100 && buttonY1 == 100)
        {
            pos = 5;
        } else
        if(buttonX1 == 200 && buttonY1 == 100)
        {
            pos = 6;
        } else
        if(buttonX1 == 0 && buttonY1 == 200)
        {
            pos = 7;
        } else
        if(buttonX1 == 100 && buttonY1 == 200)
        {
            pos = 8;
        } else
        if(buttonX1 == 200 && buttonY1 == 200)
        {
            pos = 9;
        } else
        if(buttonX1 == 0 && buttonY1 == 300)
        {
            pos =10;
        } 
        System.out.println(pos);
        try
        {
            if(pos==10 && b[pos - 3].getIcon() == image )
            {
               
                Icon image2 = b[pos - 3].getIcon();
                b[pos].setIcon(image2);
                b[pos - 3].setIcon(image1);
            }
            else if(pos != 1 && pos != 4 && pos != 7  && b[pos - 1].getIcon() == image)
            {
                Icon image2 = b[pos - 1].getIcon();
                b[pos].setIcon(image2);
                b[pos - 1].setIcon(image1);
            } else
            if(pos != 3 && pos != 6 && pos != 9 && pos != 10 && b[pos + 1].getIcon() == image)
            {
                Icon image2 = b[pos + 1].getIcon();
                b[pos].setIcon(image2);
                b[pos + 1].setIcon(image1);
            } else
            if(pos != 8 && pos != 9&& pos != 10&& b[pos + 3].getIcon() == image)
            {
                Icon image2 = b[pos + 3].getIcon();
                b[pos].setIcon(image2);
                b[pos + 3].setIcon(image1);
            } else
            if(pos != 1 && pos != 2 && pos != 3 && b[pos - 3].getIcon() == image)
            {
                Icon image2 = b[pos - 3].getIcon();
                b[pos].setIcon(image2);
                b[pos - 3].setIcon(image1);
            }
            
        }
        catch(Exception e1)
        {
            System.out.println((new StringBuilder()).append("eee").append(e1).toString());
        }
        check();
    }

    public void check()
    {
        int done = 0;
        if(this.b[1].getIcon() == new ImageIcon("1.jpg"))
        {
            done++;
        }
        if(this.b[2].getIcon() == new ImageIcon("2.jpg"))
        {
            done++;
        }
        if(this.b[3].getIcon() == new ImageIcon("3.jpg"))
        {
            done++;
        }
        if(this.b[4].getIcon() == new ImageIcon("4.jpg"))
        {
            done++;
        }
        if(this.b[5].getIcon() == new ImageIcon("5.jpg"))
        {
            done++;
        }
        if(this.b[6].getIcon() == new ImageIcon("6.jpg"))
        {
            done++;
        }
        if(this.b[7].getIcon() == new ImageIcon("7.jpg"))
        {
            done++;
        }
        if(this.b[8].getIcon() == new ImageIcon("8.jpg"))
        {
            done++;
        }
        if(this.b[9].getIcon() == new ImageIcon("9.jpg"))
        {
            done++;
        }
        if(this.b[10].getIcon() == new ImageIcon("use.jpg"))
        {
            done++;
        }
        try
        {
            if(done == 10)
            {
                JFrame cak = new JFrame();
                JButton b = new JButton(new ImageIcon("cak1.jpg"));
                cak.add(b);
                cak.pack();
                cak.setVisible(true);
                f.setVisible(false);
            }
        }
        catch(Exception e2)
        {
            System.out.println(e2);
        }
    }

}