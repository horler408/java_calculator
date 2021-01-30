package guiexamples;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
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
            btnEqual, btnClr, btnDelete, btnDot, btnTimes, btnDivide, 
            btnMod;
    JMenu fileMenu, editMenu, viewMenu;
    JMenuItem itemNew, itemOpen, itemCopy, itemPaste, itemSize;
    JMenuBar menuBar = new JMenuBar();
    JCheckBox btnCheck;
    JRadioButton btnOff, btnOn;
    ButtonGroup bg;
    
    public Calculator(){
        //Initialise Menus
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        viewMenu = new JMenu("View");
        
        //Initialise Menu Items
        itemNew = new JMenuItem("New");
        itemOpen = new JMenuItem("Open");
        itemCopy = new JMenuItem("Copy");
        itemPaste = new JMenuItem("Paste");
        itemSize = new JMenuItem("Resize");
        
        //Adding Munu Items to Munus
        fileMenu.add(itemNew);
        fileMenu.add(itemOpen);
        editMenu.add(itemCopy);
        editMenu.add(itemPaste);
        viewMenu.add(itemSize);
        
        //Adding Munus to the Munu Bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);
        
        //Initialising the Panels
        jp1 = new JPanel();
        jp1.setBounds(20, 100, 155, 300);
        
        jp2 = new JPanel();
        jp2.setBounds(170, 130, 55, 300);
    
        jp3 = new JPanel();
        jp3.setBounds(0, 70, 250, 30);
        
        //Initialise the TextField
        txtDisplay = new JTextField();
        txtDisplay.setBounds(20, 40, 200, 30);
        
        //Initialise the Check Box
        btnCheck = new JCheckBox("Check");
        
        //Initialise Radio Buttons
        btnOff = new JRadioButton("OFF");
        btnOn = new JRadioButton("ON");
        btnOn.setEnabled(false); //Disable ON button by default
        
        bg = new ButtonGroup();
        bg.add(btnOn);
        bg.add(btnOff);
        
        //Adding the Radio Buttons to Panel 3
        jp3.add(btnOff);
        jp3.add(btnOn);
        jp3.add(btnCheck);
        
        //Initialise the Buttons
        btnOne = new JButton("1");
        btnTwo = new JButton("2");
        btnThree = new JButton("3");
        btnFour = new JButton("4");
        btnFive = new JButton("5");
        btnSix = new JButton("6");
        btnSeven = new JButton("7");
        btnEight = new JButton("8");
        btnNine = new JButton("9");
        btnZero = new JButton("0");
        btnDot = new JButton(".");
        btnPlus = new JButton("+");
        btnMinus = new JButton("-");
        btnTimes = new JButton("*");
        btnDivide = new JButton("/");
        btnEqual = new JButton("=");
        btnClr = new JButton("Cl");
        btnDelete = new JButton("DE");
        btnMod = new JButton("%");
        
        //Adding Pressing buttons to panel 1
        jp1.add(btnClr);
        jp1.add(btnDelete);
        jp1.add(btnMod);
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
        jp1.add(btnDot);
        jp1.add(btnEqual);
        
        //Adding Operator Buttons to Panel 2
        jp2.add(btnPlus);
        jp2.add(btnMinus);
        jp2.add(btnTimes);
        jp2.add(btnDivide);
        
        //To register the buttons
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
        btnDot.addActionListener(this);
        btnPlus.addActionListener(this);
        btnMinus.addActionListener(this);
        btnDivide.addActionListener(this);
        btnTimes.addActionListener(this);
        btnEqual.addActionListener(this);
        btnDelete.addActionListener(this);
        btnClr.addActionListener(this);
        btnMod.addActionListener(this);
        btnOn.addActionListener(this);
        btnOff.addActionListener(this);
        btnCheck.addActionListener(this);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setJMenuBar(menuBar);
        setTitle("Calculator");
        setVisible(true);
        setSize(250, 320);
        setResizable(false);
        this.setBackground(Color.green);
        setLayout(null);
        setLocation(100, 50);
        
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
                opt.equals(btnNine.getText()) || opt.equals(btnZero.getText()) ||
                opt.equals(btnDot.getText())){
            String btnTxt = txtDisplay.getText() + e.getActionCommand();
            txtDisplay.setText(btnTxt);
            if(txtDisplay.getText().contains(".")){
                btnDot.setText("");
            }else {
                btnDot.setText(".");
            }
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
        else if(opt.equals(btnDelete.getText())){
            int length = txtDisplay.getText().length();
            int number = txtDisplay.getText().length() - 1;
            String store;
            
            if(length > 0){
                StringBuilder back = new StringBuilder(txtDisplay.getText());
                back.deleteCharAt(number);
                txtDisplay.setText(back.toString());
            }
        }
        else if(opt.equals(btnOff.getText())){
            disable();
        }
        else if(opt.equals(btnOn.getText())){
            enable();
        }
    }
    
    
    public void disable(){
        btnOff.setEnabled(false);
        btnOn.setEnabled(true);
        
        txtDisplay.setEnabled(false);
        btnOne.setEnabled(false);
        btnTwo.setEnabled(false);
        btnThree.setEnabled(false);
        btnFour.setEnabled(false);
        btnFive.setEnabled(false);
        btnSix.setEnabled(false);
        btnSeven.setEnabled(false);
        btnEight.setEnabled(false);
        btnNine.setEnabled(false);
        btnZero.setEnabled(false);
        btnDot.setEnabled(false);
        btnEqual.setEnabled(false);
        btnMod.setEnabled(false);
        btnClr.setEnabled(false);
        btnDelete.setEnabled(false);
        btnPlus.setEnabled(false);
        btnTimes.setEnabled(false);
        btnMinus.setEnabled(false);
        btnDivide.setEnabled(false);
        btnCheck.setEnabled(false);
    }
    
    public void enable(){
        btnOff.setEnabled(true);
        btnOn.setEnabled(false);
        
        txtDisplay.setEnabled(true);
        btnOne.setEnabled(true);
        btnTwo.setEnabled(true);
        btnThree.setEnabled(true);
        btnFour.setEnabled(true);
        btnFive.setEnabled(true);
        btnSix.setEnabled(true);
        btnSeven.setEnabled(true);
        btnEight.setEnabled(true);
        btnNine.setEnabled(true);
        btnZero.setEnabled(true);
        btnDot.setEnabled(true);
        btnEqual.setEnabled(true);
        btnMod.setEnabled(true);
        btnClr.setEnabled(true);
        btnDelete.setEnabled(true);
        btnPlus.setEnabled(true);
        btnTimes.setEnabled(true);
        btnMinus.setEnabled(true);
        btnDivide.setEnabled(true);
        btnCheck.setEnabled(true);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator(); 
    }
    
}
