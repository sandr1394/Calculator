package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class InternalRealisation implements ActionListener  {
	Calculator parent;
	double currentNumber, enteredNumber;
	String selectedAction;

	InternalRealisation(Calculator parent) {
		this.parent = parent;
	}

	public void actionPerformed(ActionEvent e) {
		JButton clickedButton = (JButton) e.getSource();
		String dispFieldText = parent.getValue();
		if (!dispFieldText.equals("")){
			enteredNumber = Double.parseDouble(dispFieldText);
		}
		if (clickedButton.getText().equals("+")) {
			selectedAction = "+";
			currentNumber = enteredNumber;
			parent.setValue("");
		} else if (clickedButton.getText().equals("-")) {
			selectedAction = "-";
			currentNumber = enteredNumber;
			parent.setValue("");
		} else if (clickedButton.getText().equals("*")) {
			selectedAction = "*";
			currentNumber = enteredNumber;
			parent.setValue("");
		} else if (clickedButton.getText().equals("/")) {
			selectedAction = "/";
			currentNumber = enteredNumber;
			parent.setValue("");
		} else if ((clickedButton == parent.equal)
				&& (selectedAction != null)) {
			if (selectedAction.equals("+")) {
				currentNumber += enteredNumber;
				parent.setValue("" + currentNumber);
			} else if (selectedAction.equals("-")) {
				currentNumber -= enteredNumber;
				parent.setValue("" + currentNumber);
			} else if (selectedAction.equals("*")) {
				currentNumber *= enteredNumber;
				parent.setValue("" + currentNumber);
			} else if (selectedAction.equals("/")) {
				currentNumber /= enteredNumber;
				parent.setValue("" + currentNumber);
			}
		}else {
			if (!clickedButton.getText().equals("=")) {
				if ((clickedButton.getText().equals("C")))
				{parent.eraseDisplay();}
				else
				{
					String clickedButtonLabel = clickedButton.getText();
					parent.setValue(dispFieldText + clickedButtonLabel);
				}
			}	
		}
	}
}
