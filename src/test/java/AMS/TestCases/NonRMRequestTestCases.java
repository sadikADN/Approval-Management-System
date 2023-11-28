package AMS.TestCases;

import AMS.BaseAMC;
import AMS.Pages.DashboardPage;
import AMS.Pages.LoginPage;
import AMS.Pages.NonRMRequestPage;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class NonRMRequestTestCases extends BaseAMC {

    public NonRMRequestTestCases() {
        super();
    }

    @Test(priority = 1)
    public void nonRMRequestPageShouldBeDisplayed() throws InterruptedException {

        DashboardPage dashboardPage = new LoginPage()
                .getEmail("requester@supplier.com")
                .getpassword("1234")
                .getLoginBtn();

        NonRMRequestPage nonRMRequestPage = new DashboardPage()
                .expandMenu()
                .getMarketingSupplyChain()
                .getNonRM()
                .getCreateNonRMRequest()
                .getNonRMQuotationForm()
//         NonRMRequestPage nonRMRequestPage1 = new NonRMRequestPage()
//                .getNonRMQuotationForm()
                .getSelectSBU()
                .getSelectSBUValue()
                .getSelectLocation()
                .getSelectLocationValue()
                .getSelectCostCenter()
                .getSelectCostCenterValue()
                .getSelectDate()
                .getSelectDateValue()
                .getSelectComparativeQuotations()
                .getSelectComparativeQuotationsValue()
                .getSelectPurchaseCategory()
                .getSelectPurchaseCategoryValue()
                .getSelectMonthlyForecast()
                .getSelectMonthlyForecastValue()
                .getMRNumber("1234")
                .getCapexNo("1234")
                .getForecastAmount("1000")
                .getDescription("Test")
                .getJustification("Test")

                //quotationList
                .getQuotationList()
                .getProductDescription("Test")
                .getQty("100")
                .getUOM("Test")
                .getUnitPrice("100")
                .getTotalAmount("100")
                .getSelectSupplier()
                .getSelectSupplierValue()
                .getSelectSupplier1()
                .getSelectSupplierValue1()
                .getTotalAmountToBePaid()
                .getSelectedSupplierPaymentTerm("cash")
                .getSelectedSupplierRationalization("cash")
                .getSelectedSupplierWarranty("1")

                //comment
                .getAddComment()
                .getComment("Test")
                .getSubmitBtn();

    }

    @Test(priority = 2)
    public void nonRMRequestPageShouldBeDisplayedWithNo() throws InterruptedException {

        DashboardPage dashboardPage = new LoginPage()
                .getEmail("requester@supplier.com")
                .getpassword("1234")
                .getLoginBtn();

        NonRMRequestPage nonRMRequestPage = new DashboardPage()
                .expandMenu()
                .getMarketingSupplyChain()
                .getNonRM()
                .getCreateNonRMRequest()
                .getNonRMQuotationForm()
//         NonRMRequestPage nonRMRequestPage1 = new NonRMRequestPage()
//                .getNonRMQuotationForm()
                .getSelectSBU()
                .getSelectSBUValue()
                .getSelectLocation()
                .getSelectLocationValue()
                .getSelectCostCenter()
                .getSelectCostCenterValue()
                .getSelectDate()
                .getSelectDateValue()
                .getSelectComparativeQuotations()
                .getSelectComparativeQuotationsValue1()

                .getSelectPurchaseCategory()
                .getSelectPurchaseCategoryValue()
                .getSelectMonthlyForecast()
                .getSelectMonthlyForecastValue()
                .getMRNumber("1234")
                .getCapexNo("1234")
                .getForecastAmount("1000")
                .getDescription("Test")
                .getJustification("Test")
                .getWaiverVendor("Test")
                .getWaiverDepartment("Test")
                .getWaiverDeptOfficial("Test")
                .getWaiverAmount("1000")
                .getWaiverRequisitionNumber("1234")
                .getWaiverDescription("Test")
                .getWaiverExplanation("Test")
                .getWaiverOther("Test")

                //quotationList
                .getQuotationList()
                .getProductDescription("Test")
                .getQty("100")
                .getUOM("Test")
                .getUnitPrice("100")
                .getTotalAmount("100")
                .getSelectSupplier()
                .getSelectSupplierValue()
                .getSelectSupplier1()
                .getSelectSupplierValue1()
                .getTotalAmountToBePaid()
                .getSelectedSupplierPaymentTerm("cash")
                .getSelectedSupplierRationalization("cash")
                .getSelectedSupplierWarranty("1")

                //comment
                .getAddComment()
                .getComment("Test")
                .getSubmitBtn();
    }

    @AfterMethod
    public void tearDown(ITestResult result){
        if (ITestResult.FAILURE == result.getStatus()){
            takeScreenshot(result.getMethod().getMethodName());
        }

        driver.quit();
    }
}
