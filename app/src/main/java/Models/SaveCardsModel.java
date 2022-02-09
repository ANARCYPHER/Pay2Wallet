package Models;

public class SaveCardsModel {

    Integer bankLogo,cardLogo;
    String bankName,card,cardNo,cardHolderName,date;

    public SaveCardsModel(Integer bankLogo, Integer cardLogo, String bankName, String card, String cardNo, String cardHolderName, String date) {
        this.bankLogo = bankLogo;
        this.cardLogo = cardLogo;
        this.bankName = bankName;
        this.card = card;
        this.cardNo = cardNo;
        this.cardHolderName = cardHolderName;
        this.date = date;
    }

    public Integer getBankLogo() {
        return bankLogo;
    }

    public void setBankLogo(Integer bankLogo) {
        this.bankLogo = bankLogo;
    }

    public Integer getCardLogo() {
        return cardLogo;
    }

    public void setCardLogo(Integer cardLogo) {
        this.cardLogo = cardLogo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
