package pkgCore;

public class Retirement {

	private int YearsToWork;
	private int YearsRetired;
	private double AnnualReturnWorking;
	private double AnnualReturnRetired;
	private double RequiredIncome;
	private double MonthlySSI;
	
	public Retirement(int YearsToWork, double AnnualReturnWorking, int YearsRetired, double AnnualReturnRetired,
			double RequiredIncome, double MonthlySSI) {
		super();
		this.YearsToWork = YearsToWork;
		this.AnnualReturnWorking = AnnualReturnWorking;
		this.YearsRetired = YearsRetired;
		this.AnnualReturnRetired = AnnualReturnRetired;
		this.RequiredIncome = RequiredIncome;
		this.MonthlySSI = MonthlySSI;
	}
	
	// Build the constructor, getters and setters for the attributes above.
	
	public int getYearsToWork() {
		return YearsToWork;
	}

	public void setYearsToWork(int yearsToWork) {
		YearsToWork = yearsToWork;
	}

	public int getYearsRetired() {
		return YearsRetired;
	}

	public void setYearsRetired(int yearsRetired) {
		YearsRetired = yearsRetired;
	}

	public double getAnnualReturnWorking() {
		return AnnualReturnWorking;
	}

	public void setAnnualReturnWorking(double annualReturnWorking) {
		AnnualReturnWorking = annualReturnWorking;
	}

	public double getAnnualReturnRetired() {
		return AnnualReturnRetired;
	}

	public void setAnnualReturnRetired(double annualReturnRetired) {
		AnnualReturnRetired = annualReturnRetired;
	}

	public double getRequiredIncome() {
		return RequiredIncome;
	}

	public void setRequiredIncome(double requiredIncome) {
		RequiredIncome = requiredIncome;
	}

	public double getMonthlySSI() {
		return MonthlySSI;
	}

	public void setMonthlySSI(double monthlySSI) {
		MonthlySSI = monthlySSI;
	}
	
	public double TotalAmountSaved()
	{
		// Determine amount to be saved based on Monthly SSI, Required Income, Annual return during retirement
		// and number of years retired.
		//
		
		double Retired = AnnualReturnRetired / 12;
		int RetiredYears = YearsRetired*12;
		double Value = 0;
		
		
		return Value;
	}
	

	public double AmountToSave()
	{
		// Determine the amount to save each month based on TotalAmountSaved, YearsToWork
		// and Annual return while working
		
		double Working = AnnualReturnWorking / 12;
		double WorkingYears = YearsToWork * 12;
		double Value = 0;
		
	    
		return Value;
	
	}
}
