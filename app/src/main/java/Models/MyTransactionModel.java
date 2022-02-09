package Models;

public class MyTransactionModel {
    Integer iconImage,debitLogo;
    String billName,amount,phnNO;

    public MyTransactionModel(Integer iconImage, Integer debitLogo, String billName, String amount, String phnNO) {
        this.iconImage = iconImage;
        this.debitLogo = debitLogo;
        this.billName = billName;
        this.amount = amount;
        this.phnNO = phnNO;
    }

    public Integer getIconImage() {
        return iconImage;
    }

    public void setIconImage(Integer iconImage) {
        this.iconImage = iconImage;
    }

    public Integer getDebitLogo() {
        return debitLogo;
    }

    public void setDebitLogo(Integer debitLogo) {
        this.debitLogo = debitLogo;
    }

    public String getBillName() {
        return billName;
    }

    public void setBillName(String billName) {
        this.billName = billName;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPhnNO() {
        return phnNO;
    }

    public void setPhnNO(String phnNO) {
        this.phnNO = phnNO;
    }
}
