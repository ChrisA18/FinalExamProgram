package pkgApp.controller;

import java.net.URL;
import java.text.NumberFormat;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import pkgApp.RetirementApp;
import pkgCore.Retirement;

public class RetirementController implements Initializable {

		
	private RetirementApp mainApp = null;
	
	@FXML
	private TextField txtYearsToWork;
	@FXML
	private TextField txtAnnualReturnWork;
	@FXML
	private TextField txtYearsRetired;
	@FXML
	private TextField txtAnnualReturnRetired;
	@FXML
	private TextField txtRequiredIncome;
	@FXML
	private TextField txtMonthlySSI;
	@FXML
	private TextField txtSaveEachMonth;
	@FXML
	private TextField txtNeedToSave;
	

	public RetirementApp getMainApp() {
		return mainApp;
	}

	public void setMainApp(RetirementApp mainApp) {
		this.mainApp = mainApp;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {		
	}
	
	@FXML
	public void btnClear(ActionEvent event) {
		System.out.println("Clear pressed");
		
		// Clear all the text inputs
		
		txtYearsToWork.clear();
		txtAnnualReturnWork.clear();
		txtYearsRetired.clear();
		txtAnnualReturnRetired.clear();
		txtRequiredIncome.clear();
		txtMonthlySSI.clear();
		
	}

	
	@FXML
	public void btnCalculate(ActionEvent event) {
		
		// Call AmountToSave and TotalAmountSaved and populate 
		
		if (!ValidInput()) {
			return;
		}
		Retirement retirement = new Retirement(Integer.parseInt(txtYearsToWork.getText()), 
				Double.parseDouble(txtAnnualReturnWork.getText()),
				Integer.parseInt(txtYearsRetired.getText()), 
				Double.parseDouble(txtAnnualReturnRetired.getText()),
				Double.parseDouble(txtRequiredIncome.getText()),
				Double.parseDouble(txtMonthlySSI.getText()));
		
		txtNeedToSave.setText("$ "+String.format("%.2f",retirement.TotalAmountSaved()));
		txtSaveEachMonth.setText("$ "+String.format("%.2f",retirement.AmountToSave()));
}

		private boolean ValidInput(){
			if (txtAnnualReturnWork.getText().isEmpty()) {
				 Alert _alert = new Alert(Alert.AlertType.ERROR);
				 _alert.setContentText("Invalid can not be empty");
				 _alert.show();
				 return false;
			}
			try {
				double workReturn = Double.parseDouble(txtAnnualReturnWork.getText());
				if (workReturn<0||workReturn>0.2) {
					Alert _alert = new Alert(Alert.AlertType.ERROR);
					 _alert.setContentText("Invalid number must be between 0 and 0.2");
					 _alert.show();
					 return false;
				}
			} catch (NumberFormatException e) {
				Alert _alert = new Alert(Alert.AlertType.ERROR);
				 _alert.setContentText("Invalid number");
				 _alert.show();
				 return false;
			}
			
			if (txtYearsToWork.getText().isEmpty()) {
				 Alert _alert = new Alert(Alert.AlertType.ERROR);
				 _alert.setContentText("Invalid number");
				 _alert.show();
				 return false;
			}
			try {
				Integer.parseInt(txtYearsToWork.getText());
			} catch (NumberFormatException e) {
				Alert _alert = new Alert(Alert.AlertType.ERROR);
				 _alert.setContentText("Invalid number");
				 _alert.show();
				 return false;
			}
			
			if (txtYearsRetired.getText().isEmpty()) {
				 Alert _alert = new Alert(Alert.AlertType.ERROR);
				 _alert.setContentText("Invalid can not be empty!");
				 _alert.show();
				 return false;
			}
			try {
				Integer.parseInt(txtYearsRetired.getText());
			} catch (NumberFormatException e) {
				Alert _alert = new Alert(Alert.AlertType.ERROR);
				 _alert.setContentText("Invalid number");
				 _alert.show();
				 return false;
			}
			
			if (txtAnnualReturnRetired.getText().isEmpty()) {
				 Alert _alert = new Alert(Alert.AlertType.ERROR);
				 _alert.setContentText("invalid can not be empty");
				 _alert.show();
				 return false;
			}
			try {
				double retireReturn = Double.parseDouble(txtAnnualReturnRetired.getText());
				if (retireReturn<0||retireReturn>0.03) {
					Alert _alert = new Alert(Alert.AlertType.ERROR);
					 _alert.setContentText("Invalid number must be between 0 and 0.03");
					 _alert.show();
					 return false;
				}
			} catch (NumberFormatException e) {
				Alert _alert = new Alert(Alert.AlertType.ERROR);
				 _alert.setContentText("Invalid number");
				 _alert.show();
				 return false;
			}
			
			if (txtRequiredIncome.getText().isEmpty()) {
				 Alert _alert = new Alert(Alert.AlertType.ERROR);
				 _alert.setContentText("Invalid can not be empty");
				 _alert.show();
				 return false;
			}
			try {
				Double.parseDouble(txtRequiredIncome.getText());
			} catch (NumberFormatException e) {
				Alert _alert = new Alert(Alert.AlertType.ERROR);
				 _alert.setContentText("invalid number");
				 _alert.show();
				 return false;
			}
			
			if (txtMonthlySSI.getText().isEmpty()) {
				 Alert _alert = new Alert(Alert.AlertType.ERROR);
				 _alert.setContentText("Invalid can not be empty");
				 _alert.show();
				 return false;
			}
			try {
				Double.parseDouble(txtMonthlySSI.getText());
			} catch (NumberFormatException e) {
				Alert _alert = new Alert(Alert.AlertType.ERROR);
				 _alert.setContentText("invalid number");
				 _alert.show();
				 return false;
			}
			
			return true;
		}
		
	
}
