
package guiexamples;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author AB
 */
public class Calculator extends JFrame implements ActionListener {
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
        
        //To Register Listener
        btnOne.addActionListener(this);
        btnTwo.addActionListener(this);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setJMenuBar(menuBar);
        setTitle("Calculator");
        setVisible(true);
        setSize(250, 300);
        setResizable(false);
        this.setBackground(Color.green);
        setLayout(null);
        setLocation(50, 30);
        
        //JOptionPane.showConfirmDialog(this, "Do You want to save it",
                //"Confirmation Message", JOptionPane.YES_NO_CANCEL_OPTION,
                //JOptionPane.WARNING_MESSAGE);
        
        add(menuBar);
        add(txtDisplay);
        add(jp1);
        add(jp2);
        add(jp3);
    }
    
    public void actionPerformed(ActionEvent e){
        String btnOneTxt = txtDisplay.getText() + btnOne.getText();
        txtDisplay.setText(btnOneTxt);
    }
    
    public void btnTwoactionPerformed(ActionEvent e){
        String btnTwoTxt = txtDisplay.getText() + btnTwo.getText();
        txtDisplay.setText(btnTwoTxt);
    }
    
    /*btnOne.addActionListener(new ActionListener(){
           public void actionPerformed(){
               txtDisplay.setText("1");
           }
    });*/
}
