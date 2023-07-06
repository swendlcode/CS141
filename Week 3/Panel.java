import javax.swing.JOptionPane;

public class Panel {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello" + name);
        
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "Your age is" + age);

        double friends = Double.parseDouble(JOptionPane.showInputDialog("How many friends do you have right now?"));
        JOptionPane.showMessageDialog(null, "I killed your friends and you have " + (friends - friends));


    }

}