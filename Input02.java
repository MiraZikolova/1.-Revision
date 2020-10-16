package projects05;

import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "There's no input here, just a message",
                "Title",
                0);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "Is this a question?",
                "Dialog Title",
                2,
                null,
                null,
                "Type something here.");
        
        
        String[] acceptableValues = {"Grigor Dimitrov", "Novak Djokovic", "Roger Federer"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Choose your favourite tennis player?",
                "Tennis",
                3,
                null,
                acceptableValues,
                acceptableValues[0]);
                
    }
}