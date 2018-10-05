
import javax.swing.JOptionPane;

public class Array {

	public static void main(String[] args) {

		int tnombre[] = new int[5];
		for (int i = 0; i < tnombre.length; i++) {
			tnombre[i] = Integer.parseInt(JOptionPane.showInputDialog("Remplisez la case numero " + (i + 1)));

		}
		for (int j = 0; j < tnombre.length; j++) {

			JOptionPane.showMessageDialog(null, "la case numero " + (j + 1) + " contien " + (tnombre[j]));
		}

	}

}
