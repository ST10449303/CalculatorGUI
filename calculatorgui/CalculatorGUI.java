/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculatorgui;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class CalculatorGUI {

    public static void main(String[] args) {
          JOptionPane.showMessageDialog(null,"Calculator");
          
        String input1 = JOptionPane.showInputDialog("Enter the first number:");
        double num1 = Double.parseDouble(input1);
        
        String input2 = JOptionPane.showInputDialog("Enter the second number:");
        double num2 = Double.parseDouble(input2);
        
        String operation = JOptionPane.showInputDialog("Enter operation (+, -, *, /): ");
        
        if(operation.equals("+")) {
           double sumofTwoNumbers = num1 + num2;
        
        
            JOptionPane.showMessageDialog(null, "The result is:" + sumofTwoNumbers );
        }
            else if(operation.equals("-")) {
                double sumofTwoNumbers = num1 - num2;
        
                 JOptionPane.showMessageDialog(null, "The result is:" + sumofTwoNumbers );
            }
            else if(operation.equals("*")) {
                 double sumofTwoNumbers = num1 * num2;
                 JOptionPane.showMessageDialog(null, "The result is: " + sumofTwoNumbers);
            }
            else if(operation.equals("/")) {
                 double sumofTwoNumbers = num1 / num2;
                JOptionPane.showMessageDialog(null, "The result is: " + sumofTwoNumbers);
            }
           
            
        }
        
        
    }

