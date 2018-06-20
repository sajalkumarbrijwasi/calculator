package GUI;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.*;

import static java.awt.font.TextAttribute.FONT;

class MyFrame extends Frame
{
    MyFrame()
    {
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)

            {
                System.exit(0);
            }
        });
        setTitle("abc");
        Button b,b1,b2,b3;
        TextField t,tf;
        Label l;
        b=new Button("add");
        b.setBackground(Color.orange);
        b.setBounds(0,800,250,200);
        add(b);
        b1=new Button("multiply");
        b1.setBackground(Color.orange);
        b1.setBounds(500,800,250,200);
        add(b1);
        b2=new Button("subtract");

        b2.setBackground(Color.orange);
        b2.setBounds(250,800,250,200);
        t=new TextField();
        Font f=new Font("Dubai",Font.PLAIN,50);
        t.setFont(f);
        add(b2);

        b3=new Button("Division");
        b3.setBackground(Color.orange);
        b3.setBounds(750,800,250,200);
        add(b3);
        t.setBounds(520,300,500,100);
        t.setBackground(Color.red);
        l=new Label();
        l.setBounds(20,0,1000,400);
        l.setBackground(Color.green);
         l.setFont(f);
        tf=new TextField();
        tf.setBackground(Color.cyan);
        tf.setBounds(20,300,500,100);

        tf.setFont(f);

        add(tf);
        b.addActionListener(e-> {
                    int a = Integer.parseInt(t.getText());
                    int h = Integer.parseInt(tf.getText());
                    int c = a + h;
                    l.setText("sum is" + String.valueOf(c));
                });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a=Integer.parseInt(t.getText());
                int b=Integer.parseInt(tf.getText());
                int c=a*b;
                l.setText("product is"+String.valueOf(c));

            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {int c;
                int a=Integer.parseInt(t.getText());
                int b=Integer.parseInt(tf.getText());
                if(a>b)
                    c=a-b;
                else
                    c=b-a;
                l.setText("subtract"+String.valueOf(c));

            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {float c;
                int a=Integer.parseInt(t.getText());
                int b=Integer.parseInt(tf.getText());
                if(a>b)
                    c=(float)a/b;
                else
                    c=(float)b/a;
                l.setText("division is"+String.valueOf(c));

            }
        });
        setLayout(new FlowLayout());
        add(t);
        add(l);
        setSize(1000,1000);setLayout(null);
        setVisible(true);

    }
    public static void main(String args[])
    {new MyFrame();
    }
}

