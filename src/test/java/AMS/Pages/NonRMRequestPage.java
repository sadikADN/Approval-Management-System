package AMS.Pages;

import AMS.BaseAMC;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NonRMRequestPage extends BaseAMC {

    public NonRMRequestPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//app-body/div[1]/app-content-root[1]/div[1]/app-create-non-rm[1]/p-accordion[1]/div[1]/form[1]/p-accordiontab[1]")
    WebElement NonRMQuotationForm;

    @FindBy(xpath = "//span[contains(text(),'Select SBU')]")
    WebElement selectSBU;

    @FindBy(xpath = "(//li[@class=\"p-ripple p-element p-dropdown-item\"])[1]")
    WebElement selectSBUValue;

    @FindBy(xpath = "//span[contains(text(),'Select Location')]")
    WebElement selectLocation;

    @FindBy(xpath = "(//li[@class=\"p-ripple p-element p-dropdown-item\"])[1]")
    WebElement selectLocationValue;

    @FindBy(xpath = "//span[contains(text(),'Select Cost Center')]")
    WebElement selectCostCenter;

    @FindBy(xpath = "(//li[@class=\"p-ripple p-element p-dropdown-item\"])[1]")
    WebElement selectCostCenterValue;

    @FindBy(xpath = "//input[@placeholder=\"Select Requirement Date\"]")
    WebElement selectDate;

    @FindBy(xpath = "//span[contains(text(),'21')]")
    WebElement selectDateValue;

    @FindBy(xpath = "//span[contains(text(),'Select Comparative Quotations')]")
    WebElement selectComparativeQuotations;

    @FindBy(xpath = "(//li[@class=\"p-ripple p-element p-dropdown-item\"])[1]")
    WebElement selectComparativeQuotationsValue;

    @FindBy(xpath = "(//li[@class=\"p-ripple p-element p-dropdown-item\"])[2]")
    WebElement selectComparativeQuotationsValue2;

    @FindBy(xpath = "//input[@formcontrolname='waiverVendor']")
    WebElement waiverVendor;

    @FindBy(xpath = "//input[@formcontrolname='waiverDepartment']")
    WebElement waiverDepartment;

    @FindBy(xpath = "//input[@formcontrolname='waiverDeptOfficial']")
    WebElement waiverDeptOfficial;

    @FindBy(xpath = "//input[@formcontrolname='waiverAmount']")
    WebElement waiverAmount;

    @FindBy(xpath = "//input[@formcontrolname='waiverRequisitionNumber']")
    WebElement waiverRequisitionNumber;

    @FindBy(xpath = "//textarea[@formcontrolname='waiverDescription']")
    WebElement waiverDescription;

    @FindBy(xpath = "//textarea[@formcontrolname='waiverExplanation']")
    WebElement waiverExplanation;

    @FindBy(xpath = "//textarea[@formcontrolname='waiverOther']")
    WebElement waiverOther;

    @FindBy(xpath = "//span[contains(text(),'Select Purchase Category')]")
    WebElement selectPurchaseCategory;

    @FindBy(xpath = "(//li[@class=\"p-ripple p-element p-dropdown-item\"])[1]")
    WebElement selectPurchaseCategoryValue;

    @FindBy(xpath = "//span[contains(text(),'Select Monthly Forecast')]")
    WebElement selectMonthlyForecast;

    @FindBy(xpath = "(//li[@class='p-ripple p-element p-dropdown-item'])[1]")
    WebElement selectMonthlyForecastValue;

    @FindBy(xpath = "//input[@formcontrolname='mrNumber']")
    WebElement mrNumber;

    @FindBy(xpath = "//input[@formcontrolname='capexNo']")
    WebElement capexNo;


    @FindBy(xpath = "//input[@id='forecastAmount']")
    WebElement forecastAmount;

    @FindBy(xpath = "//textarea[@id='description']")
    WebElement description;

    @FindBy(xpath = "//textarea[@id='justification']")
    WebElement justification;

    @FindBy(xpath = "//app-body/div[1]/app-content-root[1]/div[1]/app-create-non-rm[1]/p-accordion[1]/div[1]/form[1]/p-accordiontab[2]")
    WebElement quotationList;

    @FindBy(xpath = "//input[@id='productDescription0']")
    WebElement productDescription;

    @FindBy(xpath = "//input[@id='qty0']")
    WebElement qty;

    @FindBy(xpath = "//input[@id='uom0']")
    WebElement uom;

    @FindBy(xpath = "//app-body/div[1]/app-content-root[1]/div[1]/app-create-non-rm[1]/p-accordion[1]/div[1]/form[1]/p-accordiontab[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
    WebElement unitPrice;

    @FindBy(xpath = "//app-body/div[1]/app-content-root[1]/div[1]/app-create-non-rm[1]/p-accordion[1]/div[1]/form[1]/p-accordiontab[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/input[1]")
    WebElement totalAmount;

    @FindBy(xpath = "//button[contains(text(),'Add Supplier')]")
    WebElement addSupplier;

    @FindBy(xpath = "//span[contains(text(),'Select a Supplier')]")
    WebElement selectSupplier;

    @FindBy(xpath = "(//li[@class='p-ripple p-element p-dropdown-item'])[1]")
    WebElement selectSupplierValue;

    @FindBy(xpath = "//span[contains(text(),'Select Supplier')]")
    WebElement selectSupplier1;

    @FindBy(xpath = "(//li[@class='p-ripple p-element p-dropdown-item'])[1]")
    WebElement selectSupplierValue1;

    @FindBy(xpath = "//input[@formcontrolname='totalAmountToBePaid']")
    WebElement totalAmountToBePaid;

    @FindBy(xpath = "//input[@formcontrolname='selectedSupplierPaymentTerm']")
    WebElement selectedSupplierPaymentTerm;

    @FindBy(xpath = "//input[@formcontrolname='selectedSupplierRationalization']")
    WebElement selectedSupplierRationalization;

    @FindBy(xpath = "//input[@formcontrolname='selectedSupplierWarranty']")
    WebElement selectedSupplierWarranty;

    @FindBy(xpath = "//app-body/div[1]/app-content-root[1]/div[1]/app-create-non-rm[1]/p-accordion[1]/div[1]/form[1]/p-accordiontab[3]")
    WebElement addComment;

    @FindBy(xpath = "//textarea[@formcontrolname='comment']")
    WebElement comment;

    @FindBy(xpath = "//div[contains(text(),'Submit')]")
    WebElement submitBtn;

    public NonRMRequestPage getNonRMQuotationForm() throws InterruptedException {
        NonRMQuotationForm.isDisplayed();
        NonRMQuotationForm.click();
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getSelectSBU() throws InterruptedException {
        selectSBU.isDisplayed();
        selectSBU.click();
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getSelectSBUValue() throws InterruptedException {
        selectSBUValue.isDisplayed();
        selectSBUValue.click();
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getSelectLocation() throws InterruptedException {
        selectLocation.isDisplayed();
        selectLocation.click();
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getSelectLocationValue() throws InterruptedException {
        selectLocationValue.isDisplayed();
        selectLocationValue.click();
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getSelectCostCenter() throws InterruptedException {
        selectCostCenter.isDisplayed();
        selectCostCenter.click();
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getSelectCostCenterValue() throws InterruptedException {
        selectCostCenterValue.isDisplayed();
        selectCostCenterValue.click();
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getSelectDate() throws InterruptedException {
        selectDate.isDisplayed();
        selectDate.click();
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getSelectDateValue() throws InterruptedException {
        selectDateValue.isDisplayed();
        selectDateValue.click();
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getSelectComparativeQuotations() throws InterruptedException {
        selectComparativeQuotations.isDisplayed();
        selectComparativeQuotations.click();
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getSelectComparativeQuotationsValue() throws InterruptedException {
        selectComparativeQuotationsValue.isDisplayed();
        selectComparativeQuotationsValue.click();
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getSelectComparativeQuotationsValue1() throws InterruptedException {
        selectComparativeQuotationsValue2.isDisplayed();
        selectComparativeQuotationsValue2.click();
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getWaiverVendor(String waiverVendor1) throws InterruptedException {
        waiverVendor.isDisplayed();
        waiverVendor.sendKeys(waiverVendor1);
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getWaiverDepartment(String waiverDepartment1) throws InterruptedException {
        waiverDepartment.isDisplayed();
        waiverDepartment.sendKeys(waiverDepartment1);
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getWaiverDeptOfficial(String waiverDeptOfficial1) throws InterruptedException {
        waiverDeptOfficial.isDisplayed();
        waiverDeptOfficial.sendKeys(waiverDeptOfficial1);
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getWaiverAmount(String waiverAmount1) throws InterruptedException {
        waiverAmount.isDisplayed();
        waiverAmount.sendKeys(waiverAmount1);
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getWaiverRequisitionNumber(String waiverRequisitionNumber1) throws InterruptedException {
        waiverRequisitionNumber.isDisplayed();
        waiverRequisitionNumber.sendKeys(waiverRequisitionNumber1);
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getWaiverDescription(String waiverDescription1) throws InterruptedException {
        waiverDescription.isDisplayed();
        waiverDescription.sendKeys(waiverDescription1);
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getWaiverExplanation(String waiverExplanation1) throws InterruptedException {
        waiverExplanation.isDisplayed();
        waiverExplanation.sendKeys(waiverExplanation1);
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getWaiverOther(String waiverOther1) throws InterruptedException {
        waiverOther.isDisplayed();
        waiverOther.sendKeys(waiverOther1);
        Thread.sleep(1000);
        return this;
    }







    public NonRMRequestPage getSelectPurchaseCategory() throws InterruptedException {
        selectPurchaseCategory.isDisplayed();
        selectPurchaseCategory.click();
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getSelectPurchaseCategoryValue() throws InterruptedException {
        selectPurchaseCategoryValue.isDisplayed();
        selectPurchaseCategoryValue.click();
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getSelectMonthlyForecast() throws InterruptedException {
        selectMonthlyForecast.isDisplayed();
        selectMonthlyForecast.click();
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getSelectMonthlyForecastValue() throws InterruptedException {
        selectMonthlyForecastValue.isDisplayed();
        selectMonthlyForecastValue.click();
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getMRNumber(String mrNumber1) throws InterruptedException {
        mrNumber.isDisplayed();
        mrNumber.sendKeys(mrNumber1);
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getCapexNo(String capexNo1) throws InterruptedException {
        capexNo.isDisplayed();
        capexNo.sendKeys(capexNo1);
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getForecastAmount(String forecastAmount1) throws InterruptedException {
        forecastAmount.isDisplayed();
        forecastAmount.sendKeys(forecastAmount1);
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getDescription(String description1) throws InterruptedException {
        description.isDisplayed();
        description.sendKeys(description1);
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getJustification(String justification1) throws InterruptedException {
        justification.isDisplayed();
        justification.sendKeys(justification1);
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getQuotationList() throws InterruptedException {
        quotationList.isDisplayed();
        quotationList.click();
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getProductDescription(String productDescription1) throws InterruptedException {
        productDescription.isDisplayed();
        productDescription.sendKeys(productDescription1);
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getQty(String qty1) throws InterruptedException {
        qty.isDisplayed();
        qty.sendKeys(qty1);
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getUOM(String uom1) throws InterruptedException {
        uom.isDisplayed();
        uom.sendKeys(uom1);
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getUnitPrice(String unitPrice1) throws InterruptedException {
        unitPrice.isDisplayed();
        unitPrice.clear();
        unitPrice.sendKeys(unitPrice1);
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getTotalAmount(String totalAmount1) throws InterruptedException {
        totalAmount.isDisplayed();
       String amount = totalAmount.getText();
        System.out.println(amount);
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getAddSupplier() throws InterruptedException {
        addSupplier.isDisplayed();
        addSupplier.click();
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getSelectSupplier() throws InterruptedException {
        selectSupplier.isDisplayed();
        selectSupplier.click();
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getSelectSupplierValue() throws InterruptedException {
        selectSupplierValue.isDisplayed();
        selectSupplierValue.click();
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getSelectSupplier1() throws InterruptedException {
        selectSupplier1.isDisplayed();
        selectSupplier1.click();
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getSelectSupplierValue1() throws InterruptedException {
        selectSupplierValue1.isDisplayed();
        selectSupplierValue1.click();
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getTotalAmountToBePaid() throws InterruptedException {
        totalAmountToBePaid.isDisplayed();
        String amount = totalAmountToBePaid.getText();
        System.out.println(amount);
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getSelectedSupplierPaymentTerm(String selectedSupplierPaymentTerm1) throws InterruptedException {
        selectedSupplierPaymentTerm.isDisplayed();
        selectedSupplierPaymentTerm.sendKeys(selectedSupplierPaymentTerm1);
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getSelectedSupplierRationalization(String selectedSupplierRationalization1) throws InterruptedException {
        selectedSupplierRationalization.isDisplayed();
        selectedSupplierRationalization.sendKeys(selectedSupplierRationalization1);
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getSelectedSupplierWarranty(String selectedSupplierWarranty1) throws InterruptedException {
        selectedSupplierWarranty.isDisplayed();
        selectedSupplierWarranty.sendKeys(selectedSupplierWarranty1);
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getAddComment() throws InterruptedException {
        addComment.isDisplayed();
        addComment.click();
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getComment(String comment1) throws InterruptedException {
        comment.isDisplayed();
        comment.sendKeys(comment1);
        Thread.sleep(1000);
        return this;
    }

    public NonRMRequestPage getSubmitBtn() throws InterruptedException {
        submitBtn.isDisplayed();
        submitBtn.click();
        Thread.sleep(1000);
        return this;
    }

}
