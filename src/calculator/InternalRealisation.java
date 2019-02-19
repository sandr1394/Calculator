package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class InternalRealisation implements ActionListener  {
	Calculator parent; // Переменная ссылка на класс Calculator
	double currentNumber, enteredNumber;
	String selectedAction;

	
	InternalRealisation(Calculator parent) {
		this.parent = parent;
	}

	public void actionPerformed(ActionEvent e) {
		// Получение объекта, который вызвал действие
		JButton clickedButton = (JButton) e.getSource();
		//Получение текста из дисплея калькулятора
		String dispFieldText = parent.getValue();
		if (!dispFieldText.equals(""))
			enteredNumber = Double.parseDouble(dispFieldText);

		
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
		}

		
		else {

			if (!clickedButton.getText().equals("=")) {
				if ((clickedButton.getText().equals("C")))
				{parent.eraseDisplay();}
				else
				{
					// Отображение на экране текста нажатой кнопки
					String clickedButtonLabel = clickedButton.getText();
					parent.setValue(dispFieldText + clickedButtonLabel);
				}

			}
				
	}
}
}
