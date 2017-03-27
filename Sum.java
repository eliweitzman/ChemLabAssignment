package sum;
import javax.swing.*;
public class Sum {
    public static void main(String[] args) {
    int sum = 0;
    boolean stop = false;
    int num = Integer.parseInt(JOptionPane.showInputDialog(null, "input a non-zero integer"));
    for(int i = 1; i <= num; i++) {
        sum += i;
        System.out.println(sum + "|" + i);
    }
    }
}
