import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{
    public static void main(String[] args){
        JFrame frame=new JFrame("CALCULATER");
        Dimension framesize=new Dimension(500,500);
        frame.setSize(framesize);
        frame.setResizable(false);
        Font font=new Font("number",Font.BOLD,20);
        JPanel up=new JPanel();
        up.setBounds(0,0,500,80);
        up.setBackground(Color.WHITE);
        up.setLayout(null);
        TextField textField=new TextField();
        textField.setBounds(0,0,500,80);
        textField.setFont(font);
        JPanel down=new JPanel();
        down.setBounds(0,80,500,390);
        down.setBackground(Color.lightGray);
        down.setLayout(new GridLayout(5,4));
        final char[] action = {0};
        final double[] num1 = {0};
        final double[] num2 = {0};
        final double[] ans = {0};

        
        //buttons and their actions
        JButton button1=new JButton("1");
        button1.setFont(font);
        button1.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            textField.setText(textField.getText().concat(String.valueOf(1)));
          }
        });
        JButton button2=new JButton("2");
        button2.setFont(font);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat(String.valueOf(2)));
            }
        });
        JButton button3=new JButton("3");
        button3.setFont(font);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat(String.valueOf(3)));
            }
        });

        JButton plus=new JButton("+");
        plus.setFont(font);
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 num1[0] = Double.parseDouble(textField.getText());
                 action[0] ='+';
             textField.setText("");
            }
        });
        JButton button4=new JButton("4");
        button4.setFont(font);
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat(String.valueOf(4)));
            }
        });
        JButton button5=new JButton("5");
        button5.setFont(font);
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat(String.valueOf(5)));
            }
        });
        JButton button6=new JButton("6");
        button6.setFont(font);
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat(String.valueOf(6)));
            }
        });
        JButton minus=new JButton("-");
        minus.setFont(font);
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              num1[0] = Double.parseDouble(textField.getText());
                 action[0] ='-';
                textField.setText("");
            }
        });
        JButton button7=new JButton("7");
        button7.setFont(font);
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat(String.valueOf(7)));
            }
        });
        JButton button8=new JButton("8");
        button8.setFont(font);
        button8.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat(String.valueOf(8)));
            }
        });
        JButton button9=new JButton("9");
        button9.setFont(font);
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat(String.valueOf(9)));
            }
        });
        JButton buttonzarb=new JButton("*");
        buttonzarb.setFont(font);
      buttonzarb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              num1[0] = Double.parseDouble(textField.getText());
              action[0] ='*';
              textField.setText("");
            }
        });
        JButton dut=new JButton(".");
        dut.setFont(font);
        dut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat("."));
            }
        });
        JButton button0=new JButton("0");
        button0.setFont(font);
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat(String.valueOf(0)));
            }
        });
        JButton mosavi=new JButton("=");
        mosavi.setFont(font);
        mosavi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 num2[0]=Double.parseDouble(textField.getText());
                switch (action[0]){
                    case '+':
                       ans[0] = num1[0] +num2[0];
                        break;
                    case '-':
                        ans[0] = num1[0] -num2[0];
                        break;
                    case '*':
                       ans[0] = num1[0] *num2[0];
                        break;
                    case '/':
                       ans[0] = num1[0] /num2[0];
                        break;
                }
                textField.setText(String.valueOf(ans[0]));
               num1[0] = ans[0];
            }
        });
        JButton taghsim=new JButton("/");
        taghsim.setFont(font);
        taghsim.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1[0] = Double.parseDouble(textField.getText());
                action[0] ='/';
                textField.setText("");
            }
        });
        JButton dl=new JButton("DL");
        dl.setFont(font);
       dl.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               String string=textField.getText();
               textField.setText("");
               for (int i = 0; i <string.length()-1 ; i++) {
                   textField.setText(textField.getText()+string.charAt(i));
               }
           }
       });
        JButton clr=new JButton("CLR");
        clr.setFont(font);
        clr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });
        JButton manfi=new JButton("(-)");
        manfi.setFont(font);
        manfi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            double temp=Double.parseDouble(textField.getText());
            temp*=-1;
            textField.setText(String.valueOf(temp));
            }
        });

        down.add(button1);
        down.add(button2);
        down.add(button3);
        down.add(plus);
        down.add(button4);
        down.add(button5);
        down.add(button6);
        down.add(minus);
        down.add(button7);
        down.add(button8);
        down.add(button9);
        down.add(buttonzarb);
        down.add(dut);
        down.add(button0);
        down.add(mosavi);
        down.add(taghsim);
        down.add(dl);
        down.add(clr);
        down.add(manfi);
        up.add(textField);

      frame.add(up);
      frame.add(down);
      frame.setLayout(null);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }}