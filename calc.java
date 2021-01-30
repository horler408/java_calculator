package guiexamples;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Dev Abdulazeez
 */
public class Calculator extends JFrame implements ActionListener {
    private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operator;
    
    JPanel jp1, jp2, jp3;
    
    JTextField txtDisplay;
    JButton btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, 
            btnSeven, btnEight, btnNine, btnZero, btnPlus, btnMinus,
            btnEqual, btnClr, btnDelete, btnDot, btnTimes, btnDivide;
    JMenu fileMenu, editMenu, viewMenu;
    JMenuItem itemNew, itemOpen, itemCopy, itemPaste, itemSize;
    JMenuBar menuBar = new JMenuBar();
    JCheckBox btnCheck;
    JRadioButton btnOff, btnOn;
    ButtonGroup bg;
    
    public Calculator(){
         fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        viewMenu = new JMenu("View");
        
        itemNew = new JMenuItem("New");
        itemOpen = new JMenuItem("Open");
        itemCopy = new JMenuItem("Copy");
        itemPaste = new JMenuItem("Paste");
        itemSize = new JMenuItem("Resize");
        
        fileMenu.add(itemNew);
        fileMenu.add(itemOpen);
        editMenu.add(itemCopy);
        editMenu.add(itemPaste);
        viewMenu.add(itemSize);
        
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);
        
        jp1 = new JPanel();
        jp1.setBounds(20, 100, 155, 300);
        //jp1.setLayout(new GridLayout(4,3));
        
        jp2 = new JPanel();
        //jp2.setLayout(new GridLayout(5,1));
        jp2.setBounds(170, 100, 55, 300);
    
        jp3 = new JPanel();
        jp3.setBounds(0, 70, 250, 30);
        
        txtDisplay = new JTextField();
        txtDisplay.setBounds(20, 40, 200, 30);
        
        btnCheck = new JCheckBox("Check");
        
        btnOff = new JRadioButton("OFF");
        btnOn = new JRadioButton("ON");
        
        bg = new ButtonGroup();
        bg.add(btnOn);
        bg.add(btnOff);
        
        jp3.add(btnOff);
        jp3.add(btnOn);
        jp3.add(btnCheck);
        
        btnOne = new JButton("1");
        //btnOne.setActionCommand(btnOne.getText());
        btnTwo = new JButton("2");
        btnThree = new JButton("3");
        btnFour = new JButton("4");
        btnFive = new JButton("5");
        btnSix = new JButton("6");
        btnSeven = new JButton("7");
        btnEight = new JButton("8");
        btnNine = new JButton("9");
        btnZero = new JButton("0");
        btnPlus = new JButton("+");
        btnMinus = new JButton("-");
        btnTimes = new JButton("*");
        btnDivide = new JButton("/");
        btnEqual = new JButton("=");
        btnClr = new JButton("Cl");
        btnDelete = new JButton("DE");
        
        jp1.add(btnSeven);
        jp1.add(btnEight);
        jp1.add(btnNine);
        jp1.add(btnFour);
        jp1.add(btnFive);
        jp1.add(btnSix);
        jp1.add(btnOne);
        jp1.add(btnTwo);
        jp1.add(btnThree);
        jp1.add(btnZero);
        jp1.add(btnEqual);
        jp1.add(btnDelete);
        
        jp2.add(btnPlus);
        jp2.add(btnMinus);
        jp2.add(btnTimes);
        jp2.add(btnDivide);
        //jp2.add(btnClr);
        
        //To register the button
        btnOne.addActionListener(this);
        btnTwo.addActionListener(this);
        btnThree.addActionListener(this);
        btnFour.addActionListener(this);
        btnFive.addActionListener(this);
        btnSix.addActionListener(this);
        btnSeven.addActionListener(this);
        btnEight.addActionListener(this);
        btnNine.addActionListener(this);
        btnZero.addActionListener(this);
        btnPlus.addActionListener(this);
        btnMinus.addActionListener(this);
        btnDivide.addActionListener(this);
        btnTimes.addActionListener(this);
        btnEqual.addActionListener(this);
        btnDelete.addActionListener(this);
        btnClr.addActionListener(this);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setJMenuBar(menuBar);
        setTitle("Calculator");
        setVisible(true);
        setSize(250, 300);
        setResizable(false);
        this.setBackground(Color.green);
        setLayout(null);
        setLocation(50, 30);
        
        
        add(menuBar);
        add(txtDisplay);
        add(jp1);
        add(jp2);
        add(jp3);
    }
    
    public void actionPerformed(ActionEvent e){
        String opt = e.getActionCommand();
        
        if(opt.equals(btnPlus.getText()) || opt.equals(btnMinus.getText()) ||
           opt.equals(btnTimes.getText()) || opt.equals(btnDivide.getText())){
            
            String btnTxt = e.getActionCommand(); 
            math_operator = btnTxt.charAt(0);
            total1 = total1 + Double.parseDouble(txtDisplay.getText());
            txtDisplay.setText("");
        }
        
        else if(opt.equals(btnOne.getText()) || opt.equals(btnTwo.getText()) ||
                opt.equals(btnThree.getText()) || opt.equals(btnFour.getText()) ||
                opt.equals(btnFive.getText()) || opt.equals(btnSix.getText()) ||
                opt.equals(btnSeven.getText()) || opt.equals(btnEight.getText()) ||
                opt.equals(btnNine.getText()) || opt.equals(btnZero.getText())) {
            
            String btnTxt = txtDisplay.getText() + e.getActionCommand();
            txtDisplay.setText(btnTxt);
        }
        
        else if(opt.equals(btnEqual.getText())){
            switch (math_operator) {
              case '+':
                  total2 = total1 + Double.parseDouble(txtDisplay.getText());
                  break;
              case '-':
                  total2 = total1 - Double.parseDouble(txtDisplay.getText());
                  break;
              case '*':
                  total2 = total1 * Double.parseDouble(txtDisplay.getText());
                  break;
              case '/':
                  total2 = total1 / Double.parseDouble(txtDisplay.getText());
                  break;
            }
            txtDisplay.setText(Double.toString(total2));
            total1 = 0;
        }
        else if(opt.equals(btnClr.getText())){
            total2 = 0; 
            txtDisplay.setText("");
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();  
    }
    
}
