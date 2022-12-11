package day08_IfStatement;

public class MySalaryMonthly {
    public static void main(String[] args) {


    double mySalaryBeforeTax = 38650;
    double MonthlyPaidBeforeTax= mySalaryBeforeTax/12;
        System.out.println("MonthlyPaidBeforeTax = " + MonthlyPaidBeforeTax);
    double UniversalTaxCharge = (MonthlyPaidBeforeTax/100)*2.29;
    double PayRelatedSocialInsurance = (MonthlyPaidBeforeTax/100)*4.17;
    double PersonaTaxCredit  =   (MonthlyPaidBeforeTax/100)*9.42;
    double TotalTaxMonthly   =  PersonaTaxCredit + UniversalTaxCharge + PayRelatedSocialInsurance;
    double TotalTaxYearly    =  (PersonaTaxCredit + UniversalTaxCharge + PayRelatedSocialInsurance) *12;
    double NetPayment        =  MonthlyPaidBeforeTax -TotalTaxMonthly;
        System.out.println("UniversalTaxCharge = " + UniversalTaxCharge);
        System.out.println("PersonaTaxCredit = " + PersonaTaxCredit);
        System.out.println("PayRelatedSocialInsurance = " + PayRelatedSocialInsurance);
        System.out.println("TotalTaxYearly = " + TotalTaxYearly);
        System.out.println("TotalTaxMonthly = " + TotalTaxMonthly);
        System.out.println("NetPayment = " + NetPayment);




    }
}
