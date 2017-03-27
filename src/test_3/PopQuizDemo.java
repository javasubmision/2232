/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_3;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author jeffe
 */
public class PopQuizDemo {
    public static void main (String args[]){
        PopQuizDemo();
    }

        public static void PopQuizDemo(){
        final SimpleFrame frame = new SimpleFrame();

        final JPanel main = new JPanel();
        main.setSize(400,75);
        main.setLayout(new GridLayout(3,1));
        frame.add(main);

        JLabel l1 = new JLabel("Welcome to Question Bank!");
        main.add(l1);

        JLabel l2 = new JLabel("Enter your Username:");
        main.add(l2);

        final JTextField name = new JTextField ();
        main.add(name);

        final JPanel panel = new JPanel();
        panel.setSize(400,50);
        panel.setLocation(0,225);
        frame.add(panel);

        JButton start = new JButton ("Next");
        panel.add(start);

        frame.setVisible(true);

        start.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e){
                 frame.setVisible(false);
                 randomize();
             }
        });
    }

    public static void randomize(){
        Questions q = new Questions();
        int a=0;
        Random randnum = new Random (System.currentTimeMillis());
        java.util.HashSet<Integer> myset = new java.util.HashSet<>();
        for (int count = 1; count <= 3; count++){
            while (true) {
                a = randnum.nextInt (3);
                if(!myset.contains(a)) { myset.add(new Integer(a)); break;}
            }
            if(a==0){
                q.one();
            }
            else if(a==1){
                q.two();
            }
            else if(a==2){
                q.three();
            }
            else{
                break;
            }
        }
    }

    private static class SimpleFrame {

        public SimpleFrame() {
        }

        private void setVisible(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void add(JPanel panel) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class Questions {

        public Questions() {
        }

        private void one() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void two() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void three() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
