import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Buttons extends JPanel implements ActionListener {

	JButton btn1, btn2;
	JLabel label;

	public Buttons() {
		super();
		btn1 = new JButton("Increase");
		btn2 = new JButton("Decrease");
		label = new JLabel("0");
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		add(btn1);
		add(btn2);
		add(label);
	}

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		Buttons panel = new Buttons();

		frame.setSize(200, 100);
		frame.setVisible(true);
		frame.add(panel);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int x = Integer.parseInt(label.getText());
		if (e.getActionCommand() == "Increase") {
			// System.out.println(e.getActionCommand());

			x += 1;
			label.setText(Integer.toString(x));
		} else if (e.getActionCommand() == "Decrease") {
			// System.out.println(e.getActionCommand());
			x -= 1;
			label.setText(Integer.toString(x));
		}

	}

}
