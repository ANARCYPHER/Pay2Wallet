package Models;

public class OfferModel {
    Integer logoImage;
    String offerField1,offerField2,offerField3;

    public OfferModel(Integer logoImage, String offerField1, String offerField2, String offerField3) {
        this.logoImage = logoImage;
        this.offerField1 = offerField1;
        this.offerField2 = offerField2;
        this.offerField3 = offerField3;
    }

    public Integer getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(Integer logoImage) {
        this.logoImage = logoImage;
    }

    public String getOfferField1() {
        return offerField1;
    }

    public void setOfferField1(String offerField1) {
        this.offerField1 = offerField1;
    }

    public String getOfferField2() {
        return offerField2;
    }

    public void setOfferField2(String offerField2) {
        this.offerField2 = offerField2;
    }

    public String getOfferField3() {
        return offerField3;
    }

    public void setOfferField3(String offerField3) {
        this.offerField3 = offerField3;
    }
}
