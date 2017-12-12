package pkgCore;

public class Retirement {

	private int iYearsToWork;
	private double dAnnualReturnWorking;
	private int iYearsRetired;
	private double dAnnualReturnRetired;
	private double dRequiredIncome;
	private double dMonthlySSI;
	
	
	public double AmountToSave()
	{
		// Determine the amount to save each month based on TotalAmountSaved, YearsToWork
		// and Annual return while working
		
		double rAnnualReturnWorking = dAnnualReturnWorking / 12;
		double dMonthsToWork = iYearsToWork * 12;
		double returnVal = 0;
		if (rAnnualReturnWorking == 0) {
			returnVal = TotalAmountSaved()/dMonthsToWork;
	    }else {
	    	returnVal = TotalAmountSaved()* rAnnualReturnWorking
	                  /(Math.pow(1+rAnnualReturnWorking, dMonthsToWork)-1);
	    }
		return returnVal;
	
	}
	
	public Retirement(int iYearsToWork, double dAnnualReturnWorking, int iYearsRetired, double dAnnualReturnRetired,
			double dRequiredIncome, double dMonthlySSI) {
		super();
		this.iYearsToWork = iYearsToWork;
		this.dAnnualReturnWorking = dAnnualReturnWorking;
		this.iYearsRetired = iYearsRetired;
		this.dAnnualReturnRetired = dAnnualReturnRetired;
		this.dRequiredIncome = dRequiredIncome;
		this.dMonthlySSI = dMonthlySSI;
	}
	
	// Build the constructor, getters and setters for the attributes above.
	
	public int getiYearsToWork() {
		return iYearsToWork;
	}

	public void setiYearsToWork(int iYearsToWork) {
		this.iYearsToWork = iYearsToWork;
	}

	public double getdAnnualReturnWorking() {
		return dAnnualReturnWorking;
	}

	public void setdAnnualReturnWorking(double dAnnualReturnWorking) {
		this.dAnnualReturnWorking = dAnnualReturnWorking;
	}

	public int getiYearsRetired() {
		return iYearsRetired;
	}

	public void setiYearsRetired(int iYearsRetired) {
		this.iYearsRetired = iYearsRetired;
	}

	public double getdAnnualReturnRetired() {
		return dAnnualReturnRetired;
	}

	public void setdAnnualReturnRetired(double dAnnualReturnRetired) {
		this.dAnnualReturnRetired = dAnnualReturnRetired;
	}

	public double getdRequiredIncome() {
		return dRequiredIncome;
	}

	public void setdRequiredIncome(double dRequiredIncome) {
		this.dRequiredIncome = dRequiredIncome;
	}

	public double getdMonthlySSI() {
		return dMonthlySSI;
	}

	public void setdMonthlySSI(double dMonthlySSI) {
		this.dMonthlySSI = dMonthlySSI;
	}
	
	public double TotalAmountSaved()
	{
		// Determine amount to be saved based on Monthly SSI, Required Income, Annual return during retirement
		// and number of years retired.
		//
		
		double dARR = dAnnualReturnRetired / 12;
		double ReturnVal = 0;
		int dYR = iYearsRetired*12;
		if (dARR == 0) {
			ReturnVal = TotalAmountSaved() / dARR;
		} else {
			ReturnVal = TotalAmountSaved() * dARR / (Math.pow(1 + dARR, dARR) - 1);
		}
		return ReturnVal;
	}
}
